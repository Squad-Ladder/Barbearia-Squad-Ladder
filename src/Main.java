import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Servicos> lista = new ArrayList<>();

        System.out.println("------BÁSICOS-------");
        Servicos servico1 = new Servicos("Corte de cabelo", 35.00);
        Servicos servico2 = new Servicos("Barba", 25.00);
        Servicos servico3 = new Servicos("Cabelo + Barba", 50.00);
        Servicos servico4 = new Servicos("Hidratação", 60.00);
        Servicos servico5 = new Servicos("Limpeza de pele", 80.00);

        lista.add(servico1);
        lista.add(servico2);
        lista.add(servico3);
        lista.add(servico4);
        lista.add(servico5);


        servico1.exibirServico();
        servico2.exibirServico();
        servico3.exibirServico();

        System.out.println("------PREMIUM------");

        servico4.exibirServico();
        servico5.exibirServico();

        System.out.println("----AGENDAMENTO------");
        Agendamento agendamento1 = new Agendamento("Marcelo", "Corte", "30/09 as 08:00");
        agendamento1.confirmar();
        agendamento1.exibirResumo();

        //crud do sitema

        Registro rG = new Registro();

        Agendamento agendamento2 = new Agendamento("Joao Lucas", "Corte", "28/09 as 16:00");

        rG.adicionarAgendamento(agendamento1);
        rG.adicionarAgendamento(agendamento2);

        rG.listarClientesEServicos();
    }
}