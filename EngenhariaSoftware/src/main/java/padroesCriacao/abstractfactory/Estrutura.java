package padroesCriacao.abstractfactory;

public class Estrutura implements Financa{
    private int valor = 0;
    private String dataPag ="";
    private String tipoConta = "";

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
        auxDescricao = "A faturo foi paga!";
        return auxDescricao;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
}
