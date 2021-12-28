package padroesEstruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorTest {

    @Test
    void deveRetornarPagamentoDolar(){
        Gestor gestor = new Gestor();
        gestor.setPagamento(100);

        assertEquals("Pagamento realizado com sucesso! $100.0",gestor.getPagamentoDolar());
    }

    @Test
    void deveRetornarPagamentoReal(){
        Gestor gestor = new Gestor();
        gestor.setPagamento(100);

        assertEquals("Pagamento convertido de Dolar para Real concluido! R$568.0",gestor.getPagamentoReal());;
    }

}