import java.util.ArrayList;

public class Gerente extends Funcionario {

    private String senha;
    private ArrayList<Funcionario> equipe = new ArrayList<>();

    public void listarDados() {
        System.out.println("\n--- Dados do gerente ---");
        this.listarAtributos();
        System.out.println("Custo da equipe: " + this.custoEquipe());
    }

    public boolean validarAcesso(String senha) {
        return senha.equals(this.senha);
    }

    public void alterarSenha(String atual, String nova) {
        if (validarAcesso(atual)) {
            this.senha = nova;
        }
    }

    public double custoEquipe() {
        double custo = this.salario;

        for (Funcionario funcionario : this.equipe) {
            custo += funcionario.salario;
        }

        return custo;
    }

    public void listarEquipe() {
        System.out.println("\n--- Membros da equipe ---");
        System.out.println("Gerente: " + this.nome);
        
        for (Funcionario funcionario : this.equipe) {
            System.out.println(funcionario.nome);
        }
    }

    public void inserirFuncEquipe(Funcionario funcionario) {
        this.equipe.add(funcionario);
    }
}
