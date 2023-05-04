import java.util.Scanner;

public class DadosTeclado {

    public static void main(String[] args) {

        String palavra = "",nome = "";
        int numero = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a palavra?");
        palavra = entrada.nextLine();
        System.out.print("Qual o seu número da sorte? ");
        numero = entrada.nextInt();
        System.out.print("Agora digite seu nome: ");
        nome = entrada.next();

        System.out.printf("Seu nome é: %s%nNúmero da sorte: %d%nPalavra que te representa: %s",nome,numero,palavra);

    }
    
}
