public class Cadastro {

   private Integer id;
   private String nome;
   private String fone;
   private Integer cpf;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Cadastro(Integer id, String nome, String fone, Integer cpf) {
        this.id = id;
        this.nome =nome;
        this.fone = fone;
        this.cpf = cpf;
    }


}
