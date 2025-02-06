package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double plrAnual = 10000;
        double primeiraFaixa = 7.5 / 100;
        double segundaFaixa = 15.0 / 100;
        double terceiraFaixa = 22.5 / 100;
        double quartaFaixa = 27.5 / 100;
        double valorImposto;

        if(plrAnual >= 7640.81 && plrAnual <= 9922.28){
            valorImposto = plrAnual * primeiraFaixa;
        } else if (plrAnual >= 9922.29 && plrAnual <= 13167) {
            valorImposto = plrAnual * segundaFaixa;
        } else if (plrAnual >= 13167.01 && plrAnual <= 16380.38) {
             valorImposto = plrAnual * terceiraFaixa;
        }else{
           valorImposto = plrAnual * quartaFaixa;
        }
        System.out.println(valorImposto);

    }
}
