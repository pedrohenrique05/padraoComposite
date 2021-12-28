package padroesEstruturais.bridge;

public abstract class OrdemServico {

    protected ISetor setor;
    private int numProtocolo;
    private String tipoServico;
    protected boolean cobranca;
    private String descricao;
    protected float valorCobranca;

    public OrdemServico(int numProtocolo, String tipoServico, String descricao) {
        this.numProtocolo = numProtocolo;
        this.tipoServico = tipoServico;
        this.descricao = descricao;
    }

    public void setSetor(ISetor setor) {
        this.setor = setor;
    }

    public void setNumProtocolo(int numProtocolo) {
        this.numProtocolo = numProtocolo;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }
    public abstract void setValorCobranca(float valor);
    public abstract void setCobranca();

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ISetor getSetor() {
        return this.setor;
    }

    public int getNumProtocolo() {
        return this.numProtocolo;
    }

    public String getTipoServico() {
        return this.tipoServico;
    }

    public boolean isCobranca() {
        return this.cobranca;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public float getValorCobranca(){
        return this.valorCobranca;
    }
}
