import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double [][] vendas = new double[12][4];
        String [] meses = {"janeiro","fevereiro","marco","abril","maio","junho",
                "julho","agosto","setembro","outubro","novembro","dezembro"};

        for (int mes = 0; mes < 12; mes++){
            for (int semana = 0; semana < 4; semana++){
                System.out.print("Venda de " + meses[mes] + " - semana " + (semana+1) + ": ");
                vendas[mes][semana] = entrada.nextDouble();
            }
        }

        double totalGeral = 0;

        System.out.println("Total por mes:");
        for (int mes = 0; mes < 12; mes++){
            double totalMes = 0;
            for (int semana = 0; semana < 4; semana++){
                totalMes = totalMes + vendas[mes][semana];
            }
            System.out.println(meses[mes] + ": " + totalMes);
            totalGeral = totalGeral + totalMes;
        }

        System.out.println("Total por semana (ano todo):");
        for (int semana = 0; semana < 4; semana++){
            double totalSemana = 0;
            for (int mes = 0; mes < 12; mes++){
                totalSemana = totalSemana + vendas[mes][semana];
            }
            System.out.println("Semana " + (semana+1) + ": " + totalSemana);
        }

        System.out.println("Total geral do ano: " + totalGeral);
    }
}