package padroesEstruturais.adapter;

public interface IPagamento {
    String getDescricaoPagamento();
    void setDescricaoPagamento(String descricaoPagamento);
    double getValor();
    void setValor(double valor);
}
