package padroesEstruturais.adapter;

public class PagamentoAdapter extends PagamentoReal {
    private double valorDolar = 5.68;
    private IPagamento pagamento;

    public PagamentoAdapter(IPagamento pagamento){
        this.pagamento = pagamento;
    }

    public void pagamentoConvertido(){
        double aux = pagamento.getValor()*valorDolar;
        this.setValorTotal(aux);
        this.setDescricaoPagamento("Pagamento convertido de Dolar para Real concluido! R$"+aux);
    }

    public String recuperaPagamentoDolar(){
        double aux = this.getValorTotal()/valorDolar;
        this.pagamento.setValor(aux);
        this.pagamento.setDescricaoPagamento("Pagamento realizado com sucesso! $"+aux);
        return this.pagamento.getDescricaoPagamento();
    }

    public String getPagamentoReal(){
        return this.getDescricaoPagamento();
    }


}
