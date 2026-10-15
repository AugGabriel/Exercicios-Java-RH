import java.util.Scanner;

public class Entrada {

    public static String lerLinha(String msg, Scanner leitor) {
        return leitor.nextLine();
    }

    public static int lerInteiro(String msg, Scanner leitor) {
        return leitor.nextInt();
    }

    public static double lerDouble(String msg, Scanner leitor) {
        return leitor.nextDouble();
    }

    public static int menu(Scanner leitor) {}

    public static void contratarFuncionario(Empresa empresa, Scanner leitor) {
        String nome = Entrada.lerLinha("Informe o nome: ", leitor);
        String cpf = Entrada.lerLinha("Informe o cpf: ", leitor);
        double salario = Entrada.lerDouble("Informe o salário: ", leitor);

        System.out.println("Informe a data de contratação: ");
        Data dataContratacao = Data.informarData(leitor);

        System.out.println("Informe a data de nascimento: ");
        Data dataNascimento = Data.informarData(leitor);

        empresa.inserirFuncionario(
            new Funcionario(nome, cpf, salario, dataNascimento, dataContratacao)
        );
    }

    public static void contratarGerente(Empresa empresa, Scanner leitor) {
         String nome = Entrada.lerLinha("Informe o nome: ", leitor);
        String cpf = Entrada.lerLinha("Informe o cpf: ", leitor);
        double salario = Entrada.lerDouble("Informe o salário: ", leitor);

        System.out.println("Informe a data de contratação: ");
        Data dataContratacao = Data.informarData(leitor);

        System.out.println("Informe a data de nascimento: ");
        Data dataNascimento = Data.informarData(leitor);

        String senha = Entrada.lerLinha("Informe a senha: ", leitor);

        empresa.inserirGerente(
            new Gerente(nome, cpf, salario, dataNascimento, dataContratacao, senha)
        );
    }

    public static Funcionario selecionarFuncionario(Empresa empresa, Scanner leitor) {}

    public static Gerente selecionarGerente(Empresa empresa, Scanner leitor) {}

    public static void atribuirFuncionarioGerente(Empresa empresa, Scanner leitor) {}

    public static void alterarSenhaGerente(Empresa empresa, Scanner leitor) {}

    public static void funcionarioMaisAntigo(Empresa empresa, Scanner leitor) {}

    public static void funcionarioMaisVelho(Empresa empresa, Scanner leitor) {}
}
