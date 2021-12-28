package padroesEstruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegiaoTest {

    @Test
    void deveRetornarFuncionariosFiliais(){
        Cidade cidadeUm = new Cidade("Filial final - Olaria","Olaria");

        Cidade cidadeDois = new Cidade("Filial final - Lima Duarte","Lima Duarte");
        Funcionario funcionarioDoisUm = new Funcionario("Operacional",1500);
        cidadeDois.setFilial(funcionarioDoisUm);

        Cidade cidadeTres = new Cidade("Filial final - Bicas","Bicas");
        Funcionario funcionarioTresUm = new Funcionario("Vendedor", 1800);
        Funcionario funcionarioTresDois = new Funcionario("Administrativo", 2000);
        cidadeTres.setFilial(funcionarioTresUm);
        cidadeTres.setFilial(funcionarioTresDois);

        Cidade filial = new Cidade("Filial centralizada", "Juiz de Fora");
        filial.setFilial(cidadeUm);
        filial.setFilial(cidadeDois);
        filial.setFilial(cidadeTres);

        Regiao regiao = new Regiao();
        regiao.setAtuacao(filial);

        assertEquals("Descrição da filial: Filial centralizada\n"+
                "Descrição da filial: Filial final - Olaria\n"+
                "Descrição da filial: Filial final - Lima Duarte\n"+
                "Função na Filial: Operacional\n"+
                "Descrição da filial: Filial final - Bicas\n"+
                "Função na Filial: Vendedor\n"+
                "Função na Filial: Administrativo\n",filial.getAtuacao());
    }

    @Test
    public void deveRetornaErroSemFilial(){
        try{
            Regiao filial = new Regiao();
            filial.getAtuacao();
            fail();
        }catch(NullPointerException e){
            assertEquals("Local sem atuação!",e.getMessage());
        }
    }

}