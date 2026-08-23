import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int [] gabarito = new int[8];

        System.out.println("Digite o gabarito (8 respostas):");
        for (int i = 0; i < 8; i++){
            System.out.print("Questao " + (i+1) + ": ");
            gabarito[i] = entrada.nextInt();
        }

        int aprovados = 0;

        for (int aluno = 1; aluno <= 10; aluno++){
            System.out.print("Numero do aluno " + aluno + ": ");
            int numeroAluno = entrada.nextInt();

            int nota = 0;
            for (int i = 0; i < 8; i++){
                System.out.print("Resposta da questao " + (i+1) + ": ");
                int resposta = entrada.nextInt();
                if (resposta == gabarito[i]){
                    nota++;
                }
            }

            System.out.println("Aluno " + numeroAluno + " - Nota: " + nota);

            if (nota >= 6){
                aprovados++;
            }
        }

        double percentualAprovacao = (aprovados / 10.0) * 100;
        System.out.println("Percentual de aprovacao: " + percentualAprovacao + "%");
    }
}