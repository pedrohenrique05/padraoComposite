package padroesEstruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Cidade extends Filial {

    private List<Filial> filial;
    private String nomeCidade;

    public Cidade(String descricao,String nomeCidade){
        super(descricao);
        this.filial = new ArrayList<Filial>();
        this.nomeCidade = nomeCidade;
    }

    public void setFilial(Filial filial){
        this.filial.add(filial);
    }

    public String getNomeCidade() {
        return this.nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getAtuacao(){
        String descricao = "";
        descricao = "Descrição da filial: " + this.getDescricao() + "\n";
        for(Filial regiao : this.filial){
            descricao += regiao.getAtuacao();
        }
        return descricao;
    }
}
