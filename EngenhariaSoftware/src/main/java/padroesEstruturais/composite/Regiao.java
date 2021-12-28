package padroesEstruturais.composite;

public class Regiao {

    private Filial atuacao;

    public void setAtuacao (Filial atuacao){
        this.atuacao = atuacao;
    }

    public String getAtuacao(){
        if(this.atuacao == null){
            throw new NullPointerException("Local sem atuação!");
        }
        return this.atuacao.getAtuacao();
    }
}
