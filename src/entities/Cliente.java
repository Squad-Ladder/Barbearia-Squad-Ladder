package entities;

public class Cliente {

    String nome;
    int telefone;
    String endereco;

    Cliente(String nome, int telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    void exibirCliente() {
        System.out.println("-----CLIENTE-----");
        System.out.println("entities.Cliente: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço:" + this.endereco);
        System.out.println("--------------");

    }
}
