public class Colecao implements ItemEmprestavel {
    private String proprietario;
    private Integer qtItens;

    public Colecao(String proprietario, Integer qtItens) {
        this.proprietario = proprietario;
        this.qtItens = qtItens;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getQtItens() {
        return this.qtItens;
    }

    public void setQtItens(Integer qtItens) {
        this.qtItens = qtItens;
    }
    
    public void descricao(){
        System.out.println("Nome do Proprietario: " + this.proprietario);
        System.out.println("Quantiade de itens: " + this.qtItens);
    }
}
