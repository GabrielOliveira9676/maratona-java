package academy.devdojo.maratonajava.src.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.src.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 5;
        int b = 6;

        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
}
