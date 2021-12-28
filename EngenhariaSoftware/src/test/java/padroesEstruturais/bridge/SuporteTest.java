package padroesEstruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuporteTest {

    @Test
    void deveRetornarValorSuporteRetencao(){
        Retencao retencao = new Retencao();
        Suporte suporte = new Suporte(2021,"Suporte","Sem acesso");
        suporte.setSetor(retencao);
        suporte.setCobranca();
        suporte.setValorCobranca(20);
        assertEquals(0.0,suporte.getValorCobranca());
    }

    @Test
    void deveRetornaValorSuporteAtendimentoCliente(){
        AtendimentoCliente atendimento = new AtendimentoCliente();
        Suporte suporte = new Suporte(2021,"Suporte","Sem acesso");
        suporte.setSetor(atendimento);
        suporte.setCobranca();
        suporte.setValorCobranca(20);
        assertEquals(20.0,suporte.getValorCobranca());
    }

}