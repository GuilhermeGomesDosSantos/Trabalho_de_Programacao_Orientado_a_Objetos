package Jogo;

import java.util.Random;
import javax.swing.JOptionPane;

public class Jogo_Oficial {
    private String Nome;
    private int[] Resposta_Usuario = new int[5];
    private int[] Numero_Aleatorio = new int[5];
    private int i, r;

    public Jogo_Oficial() {
        this.Nome = Nome;
        this.Numero_Aleatorio = Numero_Aleatorio;
    }

    public void getJogar() {
        Nome = String.format(JOptionPane.showInputDialog(null, "Olá Qual é o seu Nome?"));
        JOptionPane.showMessageDialog(null, "Olá " + this.Nome + " Seja Bem Vindo ao Jogo do Milhão");
        JOptionPane.showMessageDialog(null, this.Nome + "As Regras Funcionam Assim: " + "\n" +
                "1° Você vai Digitar 5 Numeros Aleatórios" + "\n" +
                "2° Logo que Você digitar os 5 Numeros, o Proprio jogo irá gerar 5 Numeros Aleatórios" + "\n" +
                "3° E caso os 5 Numeros que você digitou sejam iguais aos 5 Numeros aleatorios do Jogo, você terá Ganhado");

        for (int i = 0; i < 5; i++) {
            Resposta_Usuario[i] = Integer
                    .parseInt(JOptionPane.showInputDialog(this.Nome + " Digite o Valor do " + (i + 1) + "° Numero"));
            if (Resposta_Usuario[i] > 10) {
                JOptionPane.showMessageDialog(null, "O Maior Numero que pode ser Digitado é 10");
                i--;
            }
        }

        // Aplicação do Metodo Random
        Random random = new Random();
        int v = 1;
        for (int r = 0; r < 5; r++) {
            Numero_Aleatorio[r] = random.nextInt(10);
            JOptionPane.showMessageDialog(null, "O Valor do " + (v++) +
                    "° Numero Aleatorio é: " + this.Numero_Aleatorio[r]);
        }

        // Condição
        if (Resposta_Usuario[i] == Numero_Aleatorio[r]) {
            JOptionPane.showMessageDialog(null, this.Nome + ", Parabens Você Ganhou");
        } else {
            JOptionPane.showMessageDialog(null, this.Nome + ", Infelismente Você Perdeu");
        }
    }
}
/*
 * import java.util.Random;
 * import javax.swing.JOptionPane;
 * 
 * //SEM O METODO RANDOM
 * public class Jogo_Oficial {
 * private String Nome;
 * private int[] Resposta_Usuario = new int[5];
 * private int[] Numero_Aleatorio = new int[5];
 * private int i, r;
 * private int[] gabarito = { 1, 2, 3, 4, 5 };
 * 
 * public Jogo_Oficial() {
 * this.Nome = Nome;
 * this.Numero_Aleatorio = Numero_Aleatorio;
 * }
 * 
 * public void getJogar() {
 * Nome = String.format(JOptionPane.showInputDialog(null,
 * "Olá Qual é o seu Nome?"));
 * JOptionPane.showMessageDialog(null, "Olá " + this.Nome +
 * " Seja Bem Vindo ao Jogo do Milhão");
 * JOptionPane.showMessageDialog(null, this.Nome + "As Regras Funcionam Assim: "
 * + "\n" +
 * " 1° Você vai Digitar 5 Numeros Aleatórios" + "\n" +
 * "2° Logo que Você digitar os 5 Numeros, o Proprio jogo irá gerar 5 Numeros Aleatórios"
 * + "\n" +
 * "3° E caso os 5 Numeros que você digitou sejam iguais aos 5 Numeros aleatorios do Jogo, você terá Ganhado"
 * );
 * 
 * for (int i = 0; i < 5; i++) {
 * Resposta_Usuario[i] = Integer
 * .parseInt(JOptionPane.showInputDialog(this.Nome + " Digite o Valor do " + (i
 * + 1) + "° Numero"));
 * if (Resposta_Usuario[i] > 10) {
 * JOptionPane.showMessageDialog(null,
 * "O Maior Numero que pode ser Digitado é 10");
 * i--;
 * }
 * }
 * 
 * for (int r = 0; r < 5; r++) {
 * int v = 1;
 * JOptionPane.showMessageDialog(null, "O Valor do " + (v++) +
 * "° Numero Aleatorio é: " + this.gabarito[r]);
 * }
 * // Condição
 * if (Resposta_Usuario[i] == gabarito[i]) {
 * JOptionPane.showMessageDialog(null, this.Nome + ", Parabens Você Ganhou");
 * } else {
 * JOptionPane.showMessageDialog(null, this.Nome +
 * ", Infelismente Você Perdeu");
 * }
 * }
 * }
 */