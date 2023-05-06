import java.util.Arrays;
import java.util.Scanner;


public class ComparacaoArray {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        char[] gabarito = {'a','b','e','d','a','e','b'};
        char[] aluno = new char[7];
        int contador = 1;
        int acertos = 0;
        String nome = "";

        System.out.printf("Digite o nome do aluno: ");
        nome = entrada.next();

        for (int indice=0; indice<gabarito.length; indice++ ){
            System.out.printf("Digite a resposta da questão %d: ", contador);
            aluno[indice]=entrada.next().charAt(0);
            contador++;
            if(gabarito[indice]==aluno[indice]){
                acertos++;  
            }

        }

        entrada.close();
    
        System.out.printf("\nGABARITO: %s%n", Arrays.toString(gabarito));
        System.out.printf("ALUNO   : %s%n%n", Arrays.toString(aluno));
        System.out.printf("O Aluno %s acertou %d questões!!!", nome, acertos);
    }
}
