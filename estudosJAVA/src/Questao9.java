import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int[6];

        for (int i = 0; i < 6; i++){
            System.out.print("Digite o numero " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        int somaPares = 0;
        int quantidadeImpares = 0;

        System.out.println("Os numeros pares sao:");
        for (int i = 0; i < 6; i++){
            if (numeros[i] % 2 == 0){
                System.out.println("numero " + numeros[i] + " na posicao " + (i+1));
                somaPares = somaPares + numeros[i];
            }
        }
        System.out.println("Soma dos pares = " + somaPares);

        System.out.println("Os numeros impares sao:");
        for (int i = 0; i < 6; i++){
            if (numeros[i] % 2 != 0){
                System.out.println("numero " + numeros[i] + " na posicao " + (i+1));
                quantidadeImpares++;
            }
        }
        System.out.println("Quantidade de impares = " + quantidadeImpares);
    }
}