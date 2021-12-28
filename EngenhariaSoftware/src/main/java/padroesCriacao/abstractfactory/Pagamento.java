package padroesCriacao.abstractfactory;

public class Pagamento implements Financa{
    private int valor = 0;
    private String dataPag = "";
    private float bonificacao = 0;

    @Override
    public int getValor() {
        return this.valor;
    }

    @Override
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String dataPag() {
        return this.dataPag;
    }

    @Override
    public void setDataPag(String data) {
        this.dataPag = dataPag;
    }

    @Override
    public String getComprovante() {
        String auxDescricao;
        auxDescricao = "O pagamento foi realizado com sucesso.";
        return auxDescricao;
    }

    public void setbonificacao(float bonificacao){
        this.bonificacao = bonificacao;
    }
}
