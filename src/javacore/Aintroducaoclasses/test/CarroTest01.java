package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Golf";
        carro.modelo = "Volks";
        carro.ano = 2014;

        carro2.nome = "Celta";
        carro2.modelo = "Chev";
        carro2.ano = 2009;

        carro = carro2;

        System.out.println("Carro1");
        System.out.println("Nome:" + carro.nome + ", Modelo:" + carro.modelo + ", Ano:" + carro.ano);
        System.out.println("\nCarro2");
        System.out.println("Nome:" + carro2.nome + ", Modelo:" + carro2.modelo + ", Ano:" + carro2.ano);

    }
}
