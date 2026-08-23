import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidades de elementos no primeiro vetor: ");
        int n = entrada.nextInt();
        int [] X = new int [n];
        System.out.print("Quantidades de elementos no segundo vetor: ");
        int m = entrada.nextInt();
        int [] Y = new int [m];
        for (int i = 0; i < n; i ++){
            System.out.print("Valor do elemento no vetor X: ");
            int valorx = entrada.nextInt();
            X[i] = valorx;
        }
        for (int i = 0; i < m; i ++){
            System.out.print("Valor do elemento no vetor Y: ");
            int valory = entrada.nextInt();
            Y[i] = valory;
        }
        int [] Z = new int [n + m];
        int tam = n;
        for (int i = 0; i < n; i ++){
            Z[i] = X[i];
        }
        for (int i = 0; i < m; i ++){
            boolean achou = false;
            for (int j = 0; j < tam; j ++){
                if (Y[i] == Z[j]){
                    achou = true;
                }
            }
            if (!achou){
                Z[tam] = Y[i];
                tam++;
            }
        }
        System.out.print("Vetor uniao Z: ");
        for (int i = 0; i < tam; i ++){
            System.out.print(Z[i] + " ");
        }
    }
}