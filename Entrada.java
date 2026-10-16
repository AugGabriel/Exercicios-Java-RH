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

    public static int menu(Empresa empresa, Scanner leitor) {
        System.out.println("Opções:");
        System.out.println("1) Contratar funcionário");
        System.out.println("2) Contratar gerente");
        System.out.println("3) Atribuir um funcionário a um gerente");
        System.out.println("4) Alterar senha de gerente");
        System.out.println("5) Imprimir dados do cliente com mais tempo de casa");
        System.out.println("6) Imprimir dados do cliente mais velho");
        System.out.println("7) Imprimir folha de pagamento da empresa");
        System.out.println("0) Sair");

        return Entrada.lerInteiro("Sua escolha: ", leitor);
    }

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

        System.out.println("Funcionário contratado com sucesso!");
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

        System.out.println("Gerente contratado com sucesso!");
    }

    public static Funcionario selecionarFuncionario(Empresa empresa, Scanner leitor) {
        empresa.listarFuncionarios();
        int numero = Entrada.lerInteiro("Informe o número do funcionário desejado: ", leitor);

        return empresa.getFuncionario(numero - 1);
    }

    public static Gerente selecionarGerente(Empresa empresa, Scanner leitor) {
        empresa.listarGerentes();
        int numero = Entrada.lerInteiro("Informe o número do gerente desejado: ", leitor);

        return empresa.getGerente(numero - 1);
    }

    public static void atribuirFuncionarioGerente(Empresa empresa, Scanner leitor) {
        Funcionario funcionario = selecionarFuncionario(empresa, leitor);
        Gerente gerente = selecionarGerente(empresa, leitor);

        gerente.inserirFuncEquipe(funcionario);

        System.out.println("Funcionário atribuído com sucesso!");
    }

    public static void alterarSenhaGerente(Empresa empresa, Scanner leitor) {
        Gerente gerente = selecionarGerente(empresa, leitor);

        String atual = Entrada.lerLinha("Digite a senha atual: ", leitor);
        String nova = Entrada.lerLinha("Digite a nova senha: ", leitor);

        if (gerente.alterarSenha(atual, nova)) {
            System.out.println("Senha alterada com sucesso!");
        }
        else {
            System.out.println("Não foi possível alterar a senha!");
        }
    }

    public static void funcionarioMaisAntigo(Empresa empresa, Scanner leitor) {
        empresa.funcionarioMaisAntigo().listarDados();
    }

    public static void funcionarioMaisVelho(Empresa empresa, Scanner leitor) {
        empresa.funcionarioMaisVelho().listarDados();
    }
}
