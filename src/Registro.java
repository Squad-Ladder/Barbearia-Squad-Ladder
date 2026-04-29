import java.util.ArrayList;

public class Registro {

    private ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();

    public void adicionarAgendamento(Agendamento agendamento) {
        listaAgendamentos.add(agendamento);
        System.out.println("Agendamento salvo!");
    }

    public void listarClientesEServicos() {
        System.out.println("\n-=========LISTA DE CLIENTES==========");
        if (listaAgendamentos.isEmpty()) {
            System.out.println("Nenhum cliente agendado");
        } else {
            for (Agendamento ag : listaAgendamentos) {
                System.out.println("Cliente: " + ag.nomeCliente + "Servico: " + ag.servico + "Data: " + ag.dataHora);
            }
        }
    }

    public void excluirAgendamento(String nomeDoCliente) {
        listaAgendamentos.removeIf(ag -> ag.nomeCliente.equalsIgnoreCase(nomeDoCliente));
        System.out.println("🚫 Agendamento do " + nomeDoCliente + " foi apagado do sistema.");
    }
}
