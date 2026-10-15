import java.util.ArrayList;

public class Empresa {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Gerente> gerentes = new ArrayList<>();

    public void folhaPagamento() {}

    public void inserirFuncionario() {}

    public void inserirGerente() {}

    public Funcionario funcionarioMaisAntigo() {}

    public Funcionario funcionarioMaisVelho() {}

    public Funcionario localizarFuncionario(String cpf) {}

    public Gerente localizarGerente(String cpf) {}

    public void atribuirFuncionarioGerente(Gerente gerente, Funcionario funcionario) {}
}
