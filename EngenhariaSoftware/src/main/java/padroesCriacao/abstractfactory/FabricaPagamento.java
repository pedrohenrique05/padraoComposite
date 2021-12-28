package padroesCriacao.abstractfactory;

public class FabricaPagamento implements FabricaAbstrata{
    @Override
    public Financa criaFinanca() {
        return new Pagamento();
    }
}
