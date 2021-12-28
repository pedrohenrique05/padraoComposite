package padroesCriacao.factorymethod;

public class ServicoFactory {


    public static Pessoa obterUsuario(String usuario){
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("padroesCriacao.factorymethod." + usuario);
            objeto = classe.newInstance();
        }catch (Exception ex){
            System.out.println("Usuário não especificado");
            throw new IllegalArgumentException("Usuário não especificado");
        }
        if(!(objeto instanceof Pessoa)){
            System.out.println("Usuário não pertencente a funcionabilidade");
            throw new IllegalArgumentException("Usuário não pertencente a funcionabilidade");
        }
        return (Pessoa) objeto;
    }
}
