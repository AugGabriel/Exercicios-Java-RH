import java.util.ArrayList;

public class Empresa {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Gerente> gerentes = new ArrayList<>();

    public void folhaPagamento() {
        double custoMensal = 0;

        System.out.println("\n--- Folha de pagamento ---");

        for (Funcionario funcionario : this.funcionarios) {
            funcionario.listarDados();
        }
        for (Gerente gerente : this.gerentes) {
            gerente.listarDados();
            custoMensal += gerente.custoEquipe();
        }

        System.out.println("Custo mensal da empresa: " + custoMensal);
    }

    public void inserirFuncionario() {}

    public void inserirGerente() {}

    public Funcionario funcionarioMaisAntigo() {}

    public Funcionario funcionarioMaisVelho() {}

    public Funcionario localizarFuncionario(String cpf) {}

    public Gerente localizarGerente(String cpf) {}

    public void atribuirFuncionarioGerente(Gerente gerente, Funcionario funcionario) {}
}
