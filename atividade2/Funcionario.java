public class Funcionario extends Pessoa{
    private Integer cargo;
    
    public Funcionario(String nome, String email, String cargo){
        super(nome, email);
        this.cargo = cargo;
    }

    public Integer getCargo() {
        return this.cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo() {
       System.out.println("Nome: " + this.getNome());
       System.out.println("E-mail: " + this.getEmail());
       System.out.println("Cargo: " + this.cargo);
    }
    
    
}