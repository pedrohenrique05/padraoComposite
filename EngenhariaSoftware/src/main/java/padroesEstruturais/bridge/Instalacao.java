package padroesEstruturais.bridge;

public class Instalacao extends  OrdemServico{

    public Instalacao(int numProtocolo, String tipoServico, String descricao) {
        super(numProtocolo, tipoServico, descricao);
    }

    public void setCobranca(){
        this.cobranca = this.setor.getCobranca();
    }

    public void setValorCobranca(float valor){
        if(isCobranca()){
            this.valorCobranca = valor;
        }else{
            this.valorCobranca = 0;
        }
    }
}
