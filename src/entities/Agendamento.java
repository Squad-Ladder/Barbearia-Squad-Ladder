package entities;

public class Agendamento {
    public String nomeCliente;
    public String servico;
    public String dataHora;
    public String status;

    public Agendamento(String nomeCliente, String servico, String dataHora) {
        this.nomeCliente = nomeCliente;
        this.servico = servico;
        this.dataHora = dataHora;
        this.status = "Pendente";
    }

    public void confirmar() {
        this.status = "Confirmado";
    }

    public void recusar() {
        this.status = "Recusado";
    }

    public void exibirResumo() {
        System.out.println("entities.Cliente: " + nomeCliente + " | Serviço: " + servico + " | Horário: " + dataHora + " | Status: " + status);
    }
}