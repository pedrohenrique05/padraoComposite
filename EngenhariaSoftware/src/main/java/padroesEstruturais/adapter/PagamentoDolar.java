package padroesEstruturais.adapter;
public class PagamentoDolar implements IPagamento{

    private double valorTotal;
    private String descricaoPagamento;

    @Override
    public double getValor() {
        return this.valorTotal;
    }

    @Override
    public void setValor(double valor) {
        this.valorTotal = valor;
    }

    @Override
    public String getDescricaoPagamento() {
        return this.descricaoPagamento;
    }

    @Override
    public void setDescricaoPagamento(String descricaoPagamento) {
        this.descricaoPagamento = descricaoPagamento;
    }
}
