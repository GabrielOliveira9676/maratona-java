package academy.devdojo.maratonajava.src.javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    // Variaveis constantes sempres são em letra maiuscula e deve conter um valor. (ex: VELOCIDADE_LIMITE = 250)
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
