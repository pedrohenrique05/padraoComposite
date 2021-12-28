package padroesEstruturais.composite;

public abstract class Filial {

    private String descricao;

    public Filial(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public abstract String getAtuacao();
}
