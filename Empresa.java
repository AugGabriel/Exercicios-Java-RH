import java.util.ArrayList;

public class Empresa {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Gerente> gerentes = new ArrayList<>();

    public Funcionario getFuncionario(int index) { 
        return this.funcionarios.get(index); 
    }

    public Gerente getGerente(int index) { 
        return this.gerentes.get(index); 
    }

    public void folhaPagamento() {
        double custoMensal = 0;

        System.out.println("\n--- Folha de pagamento ---");

        for (Funcionario funcionario : this.funcionarios) {
            funcionario.listarDados();
            custoMensal += funcionario.salario;
        }
        for (Gerente gerente : this.gerentes) {
            gerente.listarDados();
            custoMensal += gerente.salario;
        }

        System.out.println("Custo mensal da empresa: " + custoMensal);
    }

    public void inserirFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void inserirGerente(Gerente gerente) {
        this.gerentes.add(gerente);
    }

    public Funcionario funcionarioMaisAntigo() {
        if (this.funcionarios.size() == 0) {
            return null;
        }

        Funcionario maisAntigo = this.funcionarios.get(0);

        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.dataContratacao.compara(maisAntigo.dataContratacao) == -1) {
                maisAntigo = funcionario;
            }
        }

        return maisAntigo;
    }

    public Funcionario funcionarioMaisVelho() {
        if (this.funcionarios.size() == 0) {
            return null;
        }

        Funcionario maisVelho = this.funcionarios.get(0);

        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.dataNascimento.compara(maisVelho.dataNascimento) == -1) {
                maisVelho = funcionario;
            }
        }

        return maisVelho;
    }

    public Funcionario localizarFuncionario(String cpf) {
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.cpf.equals(cpf)) {
                return funcionario;
            }
        }
        return null;
    }
    
    public Gerente localizarGerente(String cpf) {
        for (Gerente gerente : this.gerentes) {
            if (gerente.cpf.equals(cpf)) {
                return gerente;
            }
        }
        return null;
    }

    public void atribuirFuncionarioGerente(Gerente gerente, Funcionario funcionario) {
        gerente.inserirFuncEquipe(funcionario);
    }

    public void listarFuncionarios() {
        for (int i = 0; i < this.funcionarios.size(); i++) {
            System.out.println((i + 1) + ") " + funcionarios.get(i).getNome());
        }
    }

    public void listarGerentes() {
        for (int i = 0; i < this.gerentes.size(); i++) {
            System.out.println((i + 1) + ") " + gerentes.get(i).getNome());
        }
    }
}
