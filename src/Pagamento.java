import java.util.Scanner;

public class Pagamento implements Pagar{
    @Override
    public void metodoPix(Scanner sc, Double valor) {
        System.out.println("-------------------------------------------------");
        System.out.println("O valor da compra é de: "+ valor);
        System.out.println("""
                Pague nesse QRcode:
                
                 ▒▒▒▒▒▒▒▒▒▒▒▒
                 ▒▒▒▒▓▒▒▓▒▒▒▒
                 ▒▒▒▒▓▒▒▓▒▒▒▒
                 ▒▒▒▒▒▒▒▒▒▒▒▒
                 ▒▓▒▒▒▒▒▒▒▒▓▒
                 ▒▒▓▓▓▓▓▓▓▓▒▒
                 ▒▒▒▒▒▒▒▒▒▒▒▒
                """);

    }

    @Override
    public void metodoCartao(Scanner sc, Double valor) {
        System.out.println("-------------------------------------------------");
        System.out.println("O valor da compra é de: "+ valor);
        System.out.println("""
                Pague Na Maquina: 
                ╔══╗
                ║██║ 
                ║  ║ 
                ╚══╝
                """);

    }
}
