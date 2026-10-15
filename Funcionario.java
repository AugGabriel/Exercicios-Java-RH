public class Funcionario {

    protected String nome, cpf;
    protected double salario;
    protected Data dataNascimento, dataContratacao;

    public Funcionario(
        String nome, 
        String cpf, 
        double salario, 
        Data dataNascimento, 
        Data dataContratacao
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
    }

    public String getNome() { return this.nome; }

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
