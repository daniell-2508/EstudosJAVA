import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Matriculados em Programação Modular: ");
        int PM = entrada.nextInt();
        System.out.print("Matriculados em Cálculo: ");
        int Cal = entrada.nextInt();
        int [] vetorpm = new int [PM];
        int [] vetorcal = new int[Cal];
        for ( int i = 0; i < PM; i++){
            System.out.print("Número no matriculado em PM: ");
            int matricula = entrada.nextInt();
            vetorpm[i] = matricula;
        }
        for ( int i = 0; i < Cal; i++){
            System.out.print("Número no matriculado em Cal: ");
            int matricula = entrada.nextInt();
            vetorcal[i] = matricula;
        }
        for (int i = 0; i < PM; i ++){
            for (int j = 0; j < Cal; j++){
                if (vetorpm[i] == vetorcal[j]){
                    System.out.println("Matriculado em comum " + vetorpm[i]);
                }
            }
        }
}
}