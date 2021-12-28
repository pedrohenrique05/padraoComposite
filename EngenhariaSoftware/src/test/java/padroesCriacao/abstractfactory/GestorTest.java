package padroesCriacao.abstractfactory;

import org.junit.jupiter.api.Test;
import padroesCriacao.factorymethod.Aluno;

import static org.junit.jupiter.api.Assertions.*;

class GestorTest {

    @Test
    void deveRetornarFinancaEstrutura(){
        FabricaAbstrata fabrica = new FabricaEstrutura();
        Gestor gestor = new Gestor(fabrica);
        assertEquals("A faturo foi paga!",gestor.getComprovanteFinanca());
    }

    @Test
    void deveRetornarFinancaPagamento(){
        FabricaAbstrata fabrica = new FabricaPagamento();
        Gestor gestor = new Gestor(fabrica);
        assertEquals("O pagamento foi realizado com sucesso.",gestor.getComprovanteFinanca());
    }
}