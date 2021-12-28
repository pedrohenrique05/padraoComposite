package padroesCriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveNaoRetornarFalhas(){
        Pessoa usuario = ServicoFactory.obterUsuario("Professor");
    }


}