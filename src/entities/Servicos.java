package entities;

public class Servicos {

    String tipo;
    double valor;

    public Servicos(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibirServico() {
        System.out.println("===================");
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Valor: " + this.valor);

    }
}
