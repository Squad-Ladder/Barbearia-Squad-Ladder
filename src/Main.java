import entities.Servicos;
import services.BarbeariaSevice;
import ui.Menu;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciarAtendimento();
    }
}




       /* BarbeariaSevice barbeariaSevice = new BarbeariaSevice();
        ArrayList<Servicos> lista = new ArrayList<>();

        //System.out.println("------BÁSICOS-------");
        barbeariaSevice.adicionarServico(new Servicos("Corte de cabelo", 35.00));
        barbeariaSevice.adicionarServico(new Servicos("Barba", 25.00));
        barbeariaSevice.adicionarServico(new Servicos("Cabelo + Barba", 50.00));
        barbeariaSevice.adicionarServico(new Servicos("Hidratação", 60.00));
        barbeariaSevice.adicionarServico(new Servicos("Limpeza de pele", 80.00));


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
        /*Agendamento agendamento = new Agendamento("Marcelo", "Corte", "30/09 as 08:00");
        agendamento.confirmar();


        barbeariaSevice.servicoAgendamento("Marcelo", "Corte de cabelo", "30/09 às 08:00");
        barbeariaSevice.servicoAgendamento("Nicolas", "Barba", "30/09 às 09:00");
        agendamento.exibirResumo();

        barbeariaSevice.exibirServicosPremium();
        barbeariaSevice.exibirAgendamentoCompleto();

    }
}


        */