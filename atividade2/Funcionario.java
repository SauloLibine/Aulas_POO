public class Funcionario extends Pessoa{
<<<<<<< HEAD
    private Integer cargo;
=======
    private String cargo;
>>>>>>> 13b6ead (entrega atividade2)
    
    public Funcionario(String nome, String email, String cargo){
        super(nome, email);
        this.cargo = cargo;
    }

<<<<<<< HEAD
    public Integer getCargo() {
        return this.cargo;
    }

    public void setCargo(Integer cargo) {
=======
    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
>>>>>>> 13b6ead (entrega atividade2)
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo() {
       System.out.println("Nome: " + this.getNome());
       System.out.println("E-mail: " + this.getEmail());
       System.out.println("Cargo: " + this.cargo);
    }
    
    
}