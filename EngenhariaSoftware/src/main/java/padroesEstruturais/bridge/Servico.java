package padroesEstruturais.bridge;

public class Servico extends OrdemServico{

    public Servico(int numProtocolo, String tipoServico, String descricao) {
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
