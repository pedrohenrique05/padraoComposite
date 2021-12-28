package padroesCriacao.singleton;
import javax.swing.*;
import java.sql.*;
public class conexaoBanco {

    private String driver = "org.gjt.mm.mysql.Driver";
    private String caminho = null;
    private String usuario = null;
    private String senha = null;
    private Connection conexao = null;

    private conexaoBanco(){}

    private static conexaoBanco instance = new conexaoBanco();

    public static synchronized  conexaoBanco getInstance() {
        return instance;
    }

    public String getCaminho() {
        return caminho;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public Connection getConexao() {
        try {
            if (this.conexao == null) {
                Class.forName(driver);
                this.conexao = DriverManager.getConnection(this.caminho, this.usuario, this.senha);
            } else if (this.conexao.isClosed()) {
                this.conexao = null;
                return getConexao();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Erro pois não há BD criado");
        } catch (SQLException e) {
            System.out.println("Erro pois não há BD criado");
        }
        return this.conexao;
    }

    public void fechaConexao(){
        if (this.conexao != null) {
            try {
                this.conexao.close();
            } catch (SQLException e) {
               System.out.println("Banco há BD criado");
            }
        }
    }
}