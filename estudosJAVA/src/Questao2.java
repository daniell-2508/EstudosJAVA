import java.util.Scanner;



public class Questao2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double x = entrada.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double y = entrada.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        double z = entrada.nextDouble();
        double [] valores = new double[3];
        valores [0] = x;
        valores [1] = y;
        valores [2] = z;
        double maior_valor = valores[0];
        double menor_valor = valores [0];
        for (int i = 0; i < valores.length; i ++) {
            if (valores[i] >= maior_valor ){
                maior_valor = valores[i];
            }
            if (valores[i] <= menor_valor){
                menor_valor = valores[i];
            }
        }
        System.out.print("O maior valor entre os 3 é: ");
        System.out.println(maior_valor);
        System.out.print("O menor valor entre os 3 é: ");
        System.out.println(menor_valor);


        if (( x <= y && x >= z) || (x >= y && x <= z)){
            System.out.print("O valor ");
            System.out.print(x);
            System.out.println(" está dentro do intervalo");

        }
        else {
            System.out.print("O valor ");
            System.out.print(x);
            System.out.println("não está dentro do intervalo");
        }

        if((y % x == 0) && (z % x == 0)){
            System.out.print("O valor ");
            System.out.print(x);
            System.out.print(" é divisivel por ");
            System.out.print(y);
            System.out.print(" e por ");
            System.out.print(z);

        }
        else {
            System.out.print("O valor ");
            System.out.print(x);
            System.out.print(" não é divisivel por ");
            System.out.print(y);
            System.out.print(" e por ");
            System.out.print(z);
        }



    }
}