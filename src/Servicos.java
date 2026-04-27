public class Servicos {

    String tipo;
    double valor;

    Servicos(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    void exibirServiço() {
        System.out.println("===================");
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Valor: " + this.valor);

    }
}
