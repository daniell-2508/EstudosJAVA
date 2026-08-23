import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double [] temperaturas = new double[12];
        String [] meses = {"janeiro","fevereiro","marco","abril","maio","junho",
                "julho","agosto","setembro","outubro","novembro","dezembro"};

        for (int i = 0; i < 12; i++){
            System.out.print("Temperatura media de " + meses[i] + ": ");
            temperaturas[i] = entrada.nextDouble();
        }

        int posMaior = 0;
        int posMenor = 0;

        for (int i = 1; i < 12; i++){
            if (temperaturas[i] > temperaturas[posMaior]){
                posMaior = i;
            }
            if (temperaturas[i] < temperaturas[posMenor]){
                posMenor = i;
            }
        }

        System.out.println("Maior temperatura: " + temperaturas[posMaior] + " em " + meses[posMaior]);
        System.out.println("Menor temperatura: " + temperaturas[posMenor] + " em " + meses[posMenor]);
    }
}