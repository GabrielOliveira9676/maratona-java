package academy.devdojo.maratonajava.src.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.src.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(180);

        c1.imprimie();
        c2.imprimie();
        c3.imprimie();
    }
}
