package padroesEstruturais.adapter;

public class Gestor {

    IPagamento pagamento;
    PagamentoAdapter persistencia;

    public Gestor(){
        this.pagamento = new PagamentoDolar();
        this.persistencia = new PagamentoAdapter(this.pagamento);
    }

    public void setPagamento(double valor){
        this.pagamento.setValor(valor);
        this.pagamento.setDescricaoPagamento("Pagamento realizado com sucesso! $"+valor);
        this.persistencia.pagamentoConvertido();
    }

    public String getPagamentoReal(){
        return persistencia.getPagamentoReal();
    }

    public String getPagamentoDolar(){
        return persistencia.recuperaPagamentoDolar();
    }
}
