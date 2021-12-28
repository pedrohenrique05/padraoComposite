package padroesEstruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstalacaoTest {

@Test
    void deveRetornarValorInstalacaoRetencao(){
        Retencao retencao = new Retencao();
        Instalacao instalacao = new Instalacao(2021,"Instalação","Primeiro acesso");
        instalacao.setSetor(retencao);
        instalacao.setCobranca();
        instalacao.setValorCobranca(50);
        assertEquals(0.0,instalacao.getValorCobranca());
    }

@Test
    void deveRetornaValorInstalacaoAtendimentoCliente(){
        AtendimentoCliente atendimento = new AtendimentoCliente();
        Instalacao instalacao = new Instalacao(2021,"Instalação", "Primeiro acesso");
        instalacao.setSetor(atendimento);
        instalacao.setCobranca();
        instalacao.setValorCobranca(50);
        assertEquals(50.0,instalacao.getValorCobranca());
    }

}