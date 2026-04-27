public class Usuario {

    String nome;
    int telefone;
    String endereco;

    Usuario(String nome, int telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;


    }

    void exibirUsuario() {
        System.out.println("-----CLIENTE-----");
        System.out.println("Cliente: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço:" + this.endereco);
        System.out.println("--------------");

    }
}

