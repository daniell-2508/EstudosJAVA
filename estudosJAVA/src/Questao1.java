import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int valor = entrada.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= valor; i++) {
            fatorial *= i;

        }

        System.out.println("O fatorial do número " + valor + " é " + fatorial);
    }
}