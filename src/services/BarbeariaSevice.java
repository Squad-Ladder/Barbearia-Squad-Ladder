package services;


import entities.Agendamento;
import entities.Cliente;
import entities.Servicos;

import java.util.ArrayList;
import java.util.List;

public class BarbeariaSevice {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Agendamento> agendamento = new ArrayList<>();
    private List<Servicos> servico = new ArrayList<>();


    public void adicionarServico(Servicos novoServico) {
        servico.add(novoServico);
    }

    public void adicionarCliente(Cliente novoCliente) {
        clientes.add(novoCliente);
    }

    public void servicoAgendamento(String nomeCliente, String tipoServico, String horario) {
        Cliente clienteEncontrado = null;

        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nomeCliente)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        Servicos servicoEncontrado = null;
        for (Servicos servicos : servico) {
            if (servicos.getTipo().equalsIgnoreCase(tipoServico)) {
                servicoEncontrado = servicos;
                break;


            }
        }
        if (clienteEncontrado != null && servicoEncontrado != null) {
            Agendamento novo = new Agendamento(clienteEncontrado.getNome(),
                    servicoEncontrado.getTipo(), horario);
            agendamento.add(novo);
            System.out.println("Servico: " + tipoServico + "marcado para " + nomeCliente);
        } else {
            System.out.println("Servico não encontrado ou não cadastrado ainda");
        }


    }

    public void exibirAgendamentoCompleto() {
        System.out.println("\n=== AGENDA DA BARBEARIA ===");
        if (agendamento.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            for (Agendamento agenda : agendamento) {
                agenda.exibirResumo();
            }
        }
    }

    public void exibirServicosPremium() {
        System.out.println("\n------ SERVIÇOS PREMIUM ------");
        for (Servicos servicos : servico) {
            // Aqui você decide a lógica: por preço ou por uma etiqueta que você criar
            if (servicos.getValor() >= 60.0) {
                servicos.exibirServico();
            }
        }
    }
}
