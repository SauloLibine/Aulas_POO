public class Emprestimo 
{
    private Pessoa pessoa;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Pessoa pessoa, Material material, String dataE, String dataD) {
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataE;
        this.dataDevolucao = dataD;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void exibirDetalhes(){
        System.out.println("Data do empréstimo: " + this.dataEmprestimo);
        System.out.println("Data de devolução: " + this.dataDevolucao);
        System.out.println("Pessoa vinculado");
        this.pessoa.exibirInfo();
        System.out.println("Material vinculado");
        this.material.descricao();
    }
}