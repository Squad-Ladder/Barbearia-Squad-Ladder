import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Servicos> lista = new ArrayList<>();

        System.out.println("------BÁSICOS-------");
        Servicos serviço1 = new Servicos("Corte de cabelo", 35.00);
        Servicos serviço2 = new Servicos("Barba", 25.00);
        Servicos serviço3 = new Servicos("Cabelo + Barba", 50.00);
        Servicos serviço4 = new Servicos("Hidratação", 60.00);
        Servicos serviço5 = new Servicos("Limpeza de pele", 80.00);


        lista.add(serviço1);
        lista.add(serviço2);
        lista.add(serviço3);
        lista.add(serviço4);
        lista.add(serviço5);


        serviço1.exibirServiço();
        serviço2.exibirServiço();
        serviço3.exibirServiço();

        System.out.println("------PREMIUM------");

        serviço4.exibirServiço();
        serviço5.exibirServiço();
    }
}