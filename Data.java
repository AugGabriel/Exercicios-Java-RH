import java.util.Scanner;

public class Data {

    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int compara(Data data) {
        if (this.ano != data.ano) {
            return this.ano > data.ano ? 1 : -1;
        }
        if (this.mes != data.mes) {
            return this.mes > data.mes ? 1 : -1;
        }
        if (this.dia != data.dia) {
            return this.dia > data.dia ? 1 : -1;
        }
        return 0;
    }

    public static Data informarData(Scanner leitor) {
        int dia = Entrada.lerInteiro("Digite o dia: ", leitor);
        int mes = Entrada.lerInteiro("Digite o mês: ", leitor);
        int ano = Entrada.lerInteiro("Digite o ano: ", leitor);

        return new Data(dia, mes, ano);
    }
}