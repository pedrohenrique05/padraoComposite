package padroesEstruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoTest {

    @Test
    void deveRetornarValorServicoRetencao(){
        Retencao retencao = new Retencao();
        Servico servico = new Servico(2021,"Serviço","Solicitação de serviço");
        servico.setSetor(retencao);
        servico.setCobranca();
        servico.setValorCobranca(80);
        assertEquals(0.0,servico.getValorCobranca());
    }

    @Test
    void deveRetornaValorServicoAtendimentoCliente(){
        AtendimentoCliente atendimento = new AtendimentoCliente();
        Servico servico = new Servico(2021,"Serviço","Solicitação de serviço");
        servico.setSetor(atendimento);
        servico.setCobranca();
        servico.setValorCobranca(80);
        assertEquals(80.0,servico.getValorCobranca());
    }

}