package padroesCriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class conexaoBancoTest {

    @Test
    public void deveRetornarCaminhoBanco(){
        conexaoBanco.getInstance().setCaminho("Caminho 01");
        assertEquals("Caminho 01",conexaoBanco.getInstance().getCaminho());
    }

    @Test
    public void deveRetornarUsuario(){
        conexaoBanco.getInstance().setUsuario("Usuario 01");
        assertEquals("Usuario 01",conexaoBanco.getInstance().getUsuario());
    }

    @Test
    public void deveRetornarSenha(){
        conexaoBanco.getInstance().setSenha("Senha 01");
        assertEquals("Senha 01",conexaoBanco.getInstance().getSenha());
    }

    @Test
    public void deveRetornarConexao(){
        conexaoBanco.getInstance().getConexao();
    }

    @Test
    public void deveRetornarFechamentoConexao(){
        conexaoBanco.getInstance().fechaConexao();
    }

}