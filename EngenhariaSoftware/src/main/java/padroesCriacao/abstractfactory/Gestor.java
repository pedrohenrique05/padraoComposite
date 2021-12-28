package padroesCriacao.abstractfactory;

import org.jetbrains.annotations.NotNull;

public class Gestor {
    private Financa financa;

    public Gestor(@NotNull FabricaAbstrata fabrica) {
        this.financa = fabrica.criaFinanca();
    }

    public String getComprovanteFinanca(){
        return this.financa.getComprovante();
    }
}
