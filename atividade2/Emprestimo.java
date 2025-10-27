public class Emprestimo 
{
<<<<<<< HEAD
    private Pessoa pessoa;
=======
    private TomadorEmprestimo tomadoremprestimo;
>>>>>>> 13b6ead (entrega atividade2)
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

<<<<<<< HEAD
    public Emprestimo(Pessoa pessoa, Material material, String dataE, String dataD) {
        this.pessoa = pessoa;
=======
    public Emprestimo(TomadorEmprestimo tomadoremprestimo, Material material, String dataE, String dataD) {
        this.tomadoremprestimo = tomadoremprestimo;
>>>>>>> 13b6ead (entrega atividade2)
        this.material = material;
        this.dataEmprestimo = dataE;
        this.dataDevolucao = dataD;
    }

<<<<<<< HEAD
    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
=======
    public TomadorEmprestimo getTomadoremprestimo() {
        return this.tomadoremprestimo;
    }

    public void setTomadoremprestimo(TomadorEmprestimo tomadoremprestimo) {
        this.tomadoremprestimo = tomadoremprestimo;
>>>>>>> 13b6ead (entrega atividade2)
    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

<<<<<<< HEAD
    public void exibirDetalhes(){
        System.out.println("Data do empréstimo: " + this.dataEmprestimo);
        System.out.println("Data de devolução: " + this.dataDevolucao);
        System.out.println("Pessoa vinculado");
        this.pessoa.exibirInfo();
=======
    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes(){
        System.out.println("Data do empréstimo: " + this.dataEmprestimo);
        System.out.println("Data de devolução: " + this.dataDevolucao);
        System.out.println("TomadorEmprestimo vinculado");
        this.tomadoremprestimo.exibirInfo();
>>>>>>> 13b6ead (entrega atividade2)
        System.out.println("Material vinculado");
        this.material.descricao();
    }
}