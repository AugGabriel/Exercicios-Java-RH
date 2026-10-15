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

    public static void contratarFuncionario(Empresa empresa, Scanner leitor) {}

    public static void contratarGerente(Empresa empresa, Scanner leitor) {}

    public static Funcionario selecionarFuncionario(Empresa empresa, Scanner leitor) {}

    public static Gerente selecionarGerente(Empresa empresa, Scanner leitor) {}

    public static void atribuirFuncionarioGerente(Empresa empresa, Scanner leitor) {}

    public static void alterarSenhaGerente(Empresa empresa, Scanner leitor) {}

    public static void funcionarioMaisAntigo(Empresa empresa, Scanner leitor) {}

    public static void funcionarioMaisVelho(Empresa empresa, Scanner leitor) {}
}
