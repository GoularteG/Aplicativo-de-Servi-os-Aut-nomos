import java.util.Scanner;

public interface Pagar {
    public void metodoPix(Scanner sc, Double valor);

    public void metodoCartao(Scanner sc, Double valor);
}
