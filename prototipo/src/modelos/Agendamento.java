package modelos;

public class Agendamento {

    private Cadastro cliente;
    private String servico;
    private String horario;
    private String status;

    public Agendamento(Cadastro cliente, String servico, String horario) {
        this.cliente = cliente;
        this.servico = servico;
        this.horario = horario;
        this.status = "Pendente";
    }

    public void cancelar() { status = "Cancelado"; }

    @Override
    public String toString() {
        return cliente.getNome() + " | " + servico + " | " + horario + " | " + status;
    }
}