public class Funcionario {

    protected String nome, cpf, dataNascimento, dataContratacao;
    protected double salario;

    protected void listarAtributos() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Salário: " + this.salario);
    }

    public void listarDados() {
        System.out.println("\n--- Dados do funcionário ---");
        this.listarAtributos();
    }
}
