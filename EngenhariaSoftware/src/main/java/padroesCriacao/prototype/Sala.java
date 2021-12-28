package padroesCriacao.prototype;

public class Sala implements Cloneable{

    private String descricao;
    private int capMax;

    public Sala(String descricao, int capMax) {
        this.descricao = descricao;
        this.capMax = capMax;
    }

    @Override
    protected Sala clone() throws CloneNotSupportedException {
        return (Sala)super.clone();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "descricaoSala='" + descricao + '\'' +
                ", capMax=" + capMax +
                '}';
    }
}
