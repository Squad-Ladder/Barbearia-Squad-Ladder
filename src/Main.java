
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Serviços> lista = new ArrayList<>();

        System.out.println("------BÁSICOS-------");
        Serviços serviço1 = new Serviços("Corte de cabelo", 35.00);
        Serviços serviço2 = new Serviços("Barba", 25.00);
        Serviços serviço3 = new Serviços("Cabelo + Barba", 50.00);
        Serviços serviço4 = new Serviços("Hidratação", 60.00);
        Serviços serviço5 = new Serviços("Limpeza de pele", 80.00);


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