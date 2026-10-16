import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        String escolha;

        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("");
            escolha = Entrada.menu(empresa, leitor);

            if (escolha.equals("1")) {
                Entrada.contratarFuncionario(empresa, leitor);
            }
            else if (escolha.equals("2")) {
                Entrada.contratarGerente(empresa, leitor);
            }
            else if (escolha.equals("3")) {
                Entrada.atribuirFuncionarioGerente(empresa, leitor);
            }
            else if (escolha.equals("4")) {
                Entrada.alterarSenhaGerente(empresa, leitor);
            }
            else if (escolha.equals("5")) {
                Entrada.funcionarioMaisAntigo(empresa, leitor);
            }
            else if (escolha.equals("6")) {
                Entrada.funcionarioMaisVelho(empresa, leitor);
            }
            else if (escolha.equals("7")) {
                empresa.folhaPagamento();
            }
            else if (!escolha.equals("0")) {
                System.out.println("Opção inválida!");
            }
        } while (!escolha.equals("0"));

        System.out.println("Até mais!");
        leitor.close();
    }
}
