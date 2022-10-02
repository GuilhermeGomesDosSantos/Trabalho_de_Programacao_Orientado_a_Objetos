import java.util.Random;

public class Exemplo {
    public static void main(String[] args) throws Exception {
        Random aleatorio = new Random();
        System.out.println("Exemplo de Numeros Aleatórios com Random: ");
        for (int i = 0; i < 10; i ++) {
        System.out.println(aleatorio.nextInt(100));
        }
    }
}
