import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        int escolha;

        Scanner leitor = new Scanner(System.in);

        do {
            escolha = Entrada.menu(empresa, leitor);

            if (escolha == 1) {
                Entrada.contratarFuncionario(empresa, leitor);
            }
            else if (escolha == 2) {
                Entrada.contratarGerente(empresa, leitor);
            }
            else if (escolha == 3) {
                Entrada.atribuirFuncionarioGerente(empresa, leitor);
            }
            else if (escolha == 4) {
                Entrada.alterarSenhaGerente(empresa, leitor);
            }
            else if (escolha == 5) {
                Entrada.funcionarioMaisAntigo(empresa, leitor);
            }
            else if (escolha == 6) {
                Entrada.funcionarioMaisVelho(empresa, leitor);
            }
            else if (escolha != 0) {
                System.out.println("Opção inválida!");
            }
        } while (escolha != 0);

        leitor.close();
    }
}
