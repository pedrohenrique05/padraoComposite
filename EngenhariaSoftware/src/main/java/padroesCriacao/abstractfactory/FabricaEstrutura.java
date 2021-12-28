package padroesCriacao.abstractfactory;

public class FabricaEstrutura implements FabricaAbstrata{

    @Override
    public Financa criaFinanca() {
        return new Estrutura();
    }
}
