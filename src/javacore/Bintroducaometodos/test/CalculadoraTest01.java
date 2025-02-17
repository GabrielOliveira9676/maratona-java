package academy.devdojo.maratonajava.src.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.src.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finaliza soma");

        Calculadora calculadora2 = new Calculadora();
        calculadora2.subtraiDoisNumeros();
        System.out.println("Finaliza subtração");
    }
}
