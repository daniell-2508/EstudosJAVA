import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double [] precos = new double[10];
        int [] quantidades = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Preco do objeto " + (i+1) + ": ");
            precos[i] = entrada.nextDouble();
            System.out.print("Quantidade vendida do objeto " + (i+1) + ": ");
            quantidades[i] = entrada.nextInt();
        }

        double totalGeral = 0;
        int posMaisVendido = 0;

        System.out.println("Relatorio de vendas:");
        for (int i = 0; i < 10; i++){
            double valorTotal = precos[i] * quantidades[i];
            totalGeral = totalGeral + valorTotal;

            System.out.println("Objeto " + (i+1) + " - Quantidade: " + quantidades[i]
                    + " - Valor unitario: " + precos[i] + " - Valor total: " + valorTotal);

            if (quantidades[i] > quantidades[posMaisVendido]){
                posMaisVendido = i;
            }
        }

        double comissao = totalGeral * 0.05;

        System.out.println("Valor geral das vendas: " + totalGeral);
        System.out.println("Comissao do vendedor: " + comissao);
        System.out.println("Objeto mais vendido: posicao " + (posMaisVendido+1)
                + " - valor unitario: " + precos[posMaisVendido]);
    }
}