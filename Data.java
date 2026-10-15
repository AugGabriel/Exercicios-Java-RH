public class Data {

    private int dia, mes, ano;

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
}