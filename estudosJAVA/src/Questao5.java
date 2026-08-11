import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean primeira_leitura = true;
        int maior_idade = 0;
        int menor_idade = 0;
        int femeas_da_lista = 0;
        while (true){
            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();
            if (idade == -1) {
                break;
            }
            if (primeira_leitura){
                maior_idade = idade;
                menor_idade = idade;
                primeira_leitura = false;
            }
            System.out.print("Digite o sexo: ");
            String sexo = entrada.next();
            System.out.print("Digite a cor dos olhos: ");
            String olhos = entrada.next();
            System.out.print("Digite a cor do cabelo: ");
            String cabelo = entrada.next();
            if (idade > maior_idade){
                maior_idade = idade;
            }
            if (idade < menor_idade){
                menor_idade = idade;
            }
            if ((sexo.equals("mulher")) && (idade >= 18 && idade <= 35) && (olhos.equals("verdes")) && (cabelo.equals("loiro"))){
                femeas_da_lista ++;
            }



        }

        System.out.println("A maior idade registrada é " + maior_idade);
        System.out.println("A menor idade registrada é " + menor_idade);
        System.out.println(" o número de mulheres cuja idade está entre 18 e 35 anos inclusive e que tenham olhos verdes e cabelos louros é " + femeas_da_lista);


    }
}