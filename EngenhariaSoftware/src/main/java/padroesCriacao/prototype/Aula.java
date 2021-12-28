package padroesCriacao.prototype;

public class Aula implements Cloneable {
    private String descricao;
    private float duracao;
    private String tipo;
    private Sala sala;

    public Aula (String descricao, float duracao, String tipo, Sala sala){
        this.descricao = descricao;
        this.duracao = duracao;
        this.tipo = tipo;
        this.sala = sala;
    }

    @Override
    public Aula clone() throws CloneNotSupportedException{
         Aula aulaClone = (Aula) super.clone();
         aulaClone.sala = (Sala) aulaClone.sala.clone();
         return aulaClone;

    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {

        return "Aula{descricaoAula='" +descricao+ "', duracao="+duracao+", tipo='"+tipo+"'}";
    }
}
