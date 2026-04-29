package ui;

import entities.Cliente;
import entities.Servicos;
import services.BarbeariaSevice;

import java.util.Scanner;

public class Menu {
    private BarbeariaSevice barbeariaSevice = new BarbeariaSevice();
    private Scanner sc = new Scanner(System.in);

      /*  String nome;
        String corte;
        Double cpf;
        Integer id;



       */

    public void iniciarAtendimento() {
        barbeariaSevice.adicionarServico(new Servicos("Corte de cabelo", 35.00));
        barbeariaSevice.adicionarServico(new Servicos("Barba", 25.00));
        barbeariaSevice.adicionarServico(new Servicos("Cabelo + Barba", 50.00));
        barbeariaSevice.adicionarServico(new Servicos("Hidratação", 60.00));
        barbeariaSevice.adicionarServico(new Servicos("Limpeza de pele", 80.00));

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n========= BARBEARIA-MENU =========");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Realizar Agendamento");
            System.out.println("3. Ver Serviços Premium");
            System.out.println("4. Ver Agenda Completa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();

                    barbeariaSevice.adicionarCliente(new Cliente(nome, 0, "Não informado"));
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Quem é o cliente? ");
                    String cliente = sc.nextLine();
                    System.out.print("Qual o serviço? ");
                    String servico = sc.nextLine();
                    System.out.print("Qual o horário? ");
                    String horario = sc.nextLine();

                    barbeariaSevice.servicoAgendamento(cliente, servico, horario);
                    break;

                case 3:
                    barbeariaSevice.exibirServicosPremium();
                    break;

                case 4:
                    barbeariaSevice.exibirAgendamentoCompleto();
                    break;

                case 0:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!!!");
            }
        }
    }
}