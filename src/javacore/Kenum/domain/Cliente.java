package academy.devdojo.maratonajava.javacore.Kenum.domain;

public class Cliente {

    private String noma;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String noma, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.noma = noma;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "noma='" + noma + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteiNT=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
