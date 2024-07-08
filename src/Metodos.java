import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    //Listas para os metodos
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<PrestadorDeServicos> prestadorDeServicos = new ArrayList<>();
    public static ArrayList<Servicos> servicos = new ArrayList<>();
    Pagamento paga = new Pagamento();
    static Agenda agenda = new Agenda();

    //Menu do prestador
    public static void menuPrestador(Scanner sc) {
        System.out.println("---------------------------------------");
        System.out.println("Digite seu nome para login:");
        var nomePrestador = sc.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("Qual seu email para login: ");
        var emailPrestador = sc.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("Digite seu numero para contato:");
        var numeroPrestador = sc.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("Informe suas tecnologias:");
        var descricaoDosServicos = sc.nextLine();
        prestadorDeServicos.add(new PrestadorDeServicos(nomePrestador, emailPrestador, numeroPrestador, descricaoDosServicos));
        menuServicosP(sc);


    }


    //Menu do cliente
    public static void menuCliente(Scanner sc) {
        System.out.println("---------------------------------------");
        System.out.println("Digite seu nome para login:");
        var nomeCliente = sc.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("Qual seu email para login: ");
        var emailCliente = sc.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("Descreva o tipo de trabalho procurado: ");
        var descDoDesejo = sc.nextLine();
        // adicionando cliente na lista
        clientes.add(new Cliente(nomeCliente, emailCliente, descDoDesejo));
        // metodo para agendar
        agendar(sc);
        System.out.println("---------------------------------------");
        sc.nextLine();
        System.out.println("Gostaria de criar um serviço?");
        System.out.println("""
                1 - Sim
                2 - Não
                """);
        var ler= sc.nextInt();
        if (ler== 1)  {
            //metodo para criar serviço
            menuServicosC(sc);
            System.out.println("---------------------------------------");
            System.out.println("Abrindo chat com o provedor de serviços....");
            //metodo para mudar status
            status(sc);
            System.out.println("---------------------------------------");
            System.out.println("Deseja avaliar o serviço? ");
            System.out.println("""
                    1- Avaliar
                    2- Sair
                    """);
            var opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    avaliar(sc);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        }else {
        }

    }
    // criando servicos no menu cliente
    private static void menuServicosC(Scanner sc) {
        System.out.println("---------------------------------------");
        System.out.println("Escolha um dos serviçõs: ");
        System.out.println("""
                1- Front-end
                2- Back-end
                3- Design
                """);
        int opcao = sc.nextInt();
        if (opcao == 1) {
            String descTrabalho = "Front-End";
            sc.nextLine();
            System.out.println("---------------------------------------");
            System.out.println("Qual o titulo do serviço? ");
            var nomeDoServico = sc.nextLine();
            System.out.println("---------------------------------------");
            System.out.println("Qual o tempo necessario para o serviço?(em horas) ");
            var tempo = sc.nextDouble();
            var salarioFront = (16.00 * tempo);
            System.out.println("---------------------------------------");
            System.out.println("Valor a pagar: " + salarioFront);
            servicos.add(new Servicos(descTrabalho, nomeDoServico, salarioFront));
            System.out.println("""
                    ---------------------------------------
                    Deseja pagar no cartao ou no pix?
                    1- Cartao
                    2- Pix
                    """);
            var pagamento = sc.nextInt();
            if (pagamento == 1) {
                Pagamento paga = new Pagamento();
                paga.metodoCartao(sc, salarioFront);
            } else {
                Pagamento paga = new Pagamento();
                paga.metodoPix(sc, salarioFront);
            }
        } else if (opcao == 2) {
            String descTrabalho = "Back-End";
            sc.nextLine();
            System.out.println("---------------------------------------");
            System.out.println("Qual o titulo do serviço? ");
            var nomeDoServico = sc.nextLine();
            System.out.println("---------------------------------------");
            System.out.println("Qual o tempo necessario para o serviço?(em horas) ");
            var tempo = sc.nextDouble();
            var salarioBack = (20.00 * tempo);
            System.out.println("---------------------------------------");
            System.out.println("Valor a pagar: " + salarioBack);
            servicos.add(new Servicos(descTrabalho, nomeDoServico, salarioBack));
            System.out.println("""
                    ---------------------------------------
                    Deseja pagar no cartao ou no pix?
                    1- Cartao
                    2- Pix
                    """);
            var pagamento = sc.nextInt();
            if (pagamento == 1) {
                Pagamento paga = new Pagamento();
                paga.metodoCartao(sc, salarioBack);
            } else {
                Pagamento paga = new Pagamento();
                paga.metodoPix(sc, salarioBack);
            }
        } else if (opcao == 3) {
            String descTrabalho = "Design";
            sc.nextLine();
            System.out.println("---------------------------------------");
            System.out.println("Qual o titulo do serviço? ");
            var nomeDoServico = sc.nextLine();
            System.out.println("---------------------------------------");
            System.out.println("Qual o tempo necessario para o serviço? (em horas)");
            var tempo = sc.nextDouble();
            var salarioDesign = (16.00 * tempo);
            System.out.println("---------------------------------------");
            System.out.println("Valor a pagar: " + salarioDesign);
            servicos.add(new Servicos(descTrabalho, nomeDoServico, salarioDesign));
            System.out.println("""
                    ---------------------------------------
                    Deseja pagar no cartao ou no pix?
                    1- Cartao
                    2- Pix
                    """);
            var pagamento = sc.nextInt();
            if (pagamento == 1) {
                Pagamento paga = new Pagamento();
                paga.metodoCartao(sc, salarioDesign);
            } else {
                Pagamento paga = new Pagamento();
                paga.metodoPix(sc, salarioDesign);
            }
        }
    }
    // exibindo serviços e agenda para o prestador
    public static void menuServicosP(Scanner sc) {
        System.out.println("---------------------------------------");
        System.out.println("Lista de Serviços:");
        for (int i = 0; i < servicos.size(); i++) {
            Servicos servico = servicos.get(i);
            System.out.println((i + 1) + ". Título: " + servico.getTituloDoServico());
            System.out.println("   Descrição: " + servico.getDescricaoDoServico());
            System.out.println("   Valor: R$" + servico.getValor());
            System.out.println("   Status: " + servico.getStatus());
            System.out.println("   Avaliação: " + servico.getAvaliacaos());
            System.out.println("---------------------------------------");
        }
        System.out.println("Lista da Agenda:");
        agenda.listarCompromissos();
        System.out.println("---------------------------------------");

    }

    //avaliar serviço
    public static void avaliar(Scanner sc) {
        System.out.println("---------------------------------------");
        System.out.println("Qual a nota geral do serviço prestado? ");
        var notaAvaliar = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("Informe o nome do prestador de serviços: ");
        var nomePrestador = sc.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("Informe o nome do serviço: ");
        var nomeServico = sc.nextLine();
        sc.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("Adicione um comentario ao serviço: ");
        var comentario = sc.nextLine();

        Avaliacao avaliacao = new Avaliacao(notaAvaliar, nomePrestador, nomeServico, comentario);
        // metodo para adicionar a avaliacao ao servico de acordo com o nome
        for (Servicos servicos : servicos) {
            if (servicos.getTituloDoServico().equalsIgnoreCase(nomeServico)) {
                servicos.adicionarAvaliacao(avaliacao);
                System.out.println("---------------------------------------");
                System.out.println("Avaliação adicionada com sucesso!");
            }
        }
    }

    public static void status(Scanner sc) {
        System.out.println("---------------------------------------");
        System.out.println("""
                O seu serviço foi concluido? 
                1- Sim
                2- Não
                """);
        var opcao = sc.nextInt();
        sc.nextLine();
        if (opcao == 1) {
            System.out.println("---------------------------------------");
            System.out.println("Informe o nome do trabalho para confirmação");
            var nome = sc.nextLine();
            System.out.println("---------------------------------------");
            System.out.println("Informe o novo status: ");
            var status = sc.nextLine();
            for (Servicos servicos : servicos) {
                // metodo para mudar o status do servico de acordo com o nome
                if (servicos.getTituloDoServico().equalsIgnoreCase(nome)) {
                    servicos.mudarStatus(status);
                    System.out.println("---------------------------------------");
                    System.out.println("Status alterado com sucesso!");
                }
            }
        } else {
            System.out.println("---------------------------------------");
            System.out.println("Entre novamente mais tarde....");
        }
    }
    // metodo para agendamentos
    public static void agendar(Scanner sc) {
        System.out.println("""
                ---------------------------------------
                Deseja agendar um serviço?
                1- Sim
                2- Não
                """);
        var agendas = sc.nextInt();
        switch (agendas) {
            case 1:
                Agenda agenda = new Agenda();
                System.out.println("---------------------------------------");
                sc.nextLine();
                System.out.println("Qual serviço desejado?");
                var servico = sc.nextLine();
                System.out.println("---------------------------------------");
                System.out.println("Qual a data para agendamento do serviço?");
                var data = sc.nextLine();
                System.out.println("---------------------------------------");
                System.out.println("Qual a hora para agendamento do serviço?");
                var hora = sc.nextLine();
                sc.nextLine();
                Metodos.agenda.adicioniarCompromisso(new Compromisso(data,hora,servico));
                System.out.println("Agendamento concluido!");
                break;
            case 2:
                break;
            default:
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                break;

        }
    }
    }


