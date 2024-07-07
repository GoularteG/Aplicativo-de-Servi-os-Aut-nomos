import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        // Servicos padroes para nao deixar a lista vazia
        Metodos.servicos.add(new Servicos("Preciso de um Site para minha loja", "Site Loja", 100.0));
        Metodos.servicos.add(new Servicos("Rest API", "Planilha loja", 150.0));
        Metodos.servicos.add(new Servicos("loja", "Preciso de uma arte para minha loja", 110.0));
        Metodos.agenda.adicioniarCompromisso(new Compromisso("18/09","10:00","Fazer um site para minha empresa"));
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("*******************************************************");
            System.out.println("Bem-vindo ao Aplicativo de Serviços Autônomos");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Entrar como Cliente");
            System.out.println("2. Entrar como Prestador de Serviços");
            System.out.println("0. Sair");
            System.out.println("*******************************************************");

            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    Metodos.menuCliente(sc);
                    break;
                case 2:
                    Metodos.menuPrestador(sc);
                    break;
                case 0:
                    System.out.println("Saindo do aplicativo...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }

        } while (opcao != 0);
    }
}
