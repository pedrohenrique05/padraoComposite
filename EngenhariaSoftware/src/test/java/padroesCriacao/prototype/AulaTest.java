package padroesCriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AulaTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        Aula aula = new Aula("Aula baseada nos movimentos naturais do ser humano",
                90,
                "Aula funcional",
                new Sala("sala ampla", 20));
        Aula aulaClone = aula.clone();
        aulaClone.setDuracao(30);

        assertEquals("Aula{descricaoAula='Aula baseada nos movimentos naturais do ser humano', duracao=90.0, tipo='Aula funcional'}",aula.toString());
        assertEquals("Aula{descricaoAula='Aula baseada nos movimentos naturais do ser humano', duracao=30.0, tipo='Aula funcional'}",aulaClone.toString());



    }

}