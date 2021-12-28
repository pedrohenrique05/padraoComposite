package padroesCriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoUsuarioNaoEspecificado(){
        try{
            Pessoa usuario = ServicoFactory.obterUsuario("Zelador");
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Usuário não especificado", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoUsuarioNaoPertecente(){
        try{
            Pessoa usuario = ServicoFactory.obterUsuario("Dependente");
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Usuário não pertencente a funcionabilidade", e.getMessage());
        }
    }
}