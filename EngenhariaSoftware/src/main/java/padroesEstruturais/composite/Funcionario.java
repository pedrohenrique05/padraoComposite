package padroesEstruturais.composite;

public class Funcionario extends Filial {

    private int salario;
    public Funcionario(String descricao, int salario){
        super(descricao);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String getAtuacao() {
        return "Função na Filial: "+this.getDescricao() + "\n";
    }
}
