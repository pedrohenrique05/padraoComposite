package padroesCriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveNaoRetornarFalhas(){
        Pessoa usuario = ServicoFactory.obterUsuario("Aluno");
    }

}