import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class ListasVetores {

    public static void main(String[] args) {

        // Array estatico
        // int [] num = new int[5];
        // int [] numeros = {9,8,7,4,3,45,33,4,567,33,23,10};
        int acertos = 0;
        // num[0] = 23;
        // num[1] = 30;
        // num[2] = 41;
        // num[3] = 57;
        // num[4] = 38;


        // for(int i=0;i<numeros.length;i++){
            
        //     System.out.printf("%d%n",numeros[i]);

        // }

        Scanner respostas = new Scanner(System.in);

        final int TAMANHO = 7;
        ArrayList<String> gabarito = new ArrayList<String>(); 
        // Arrays.asList(new String[]{"a","b","e","b","a","a","e"})
        gabarito.add("a");
        gabarito.add("b");
        gabarito.add("e");
        gabarito.add("b");
        gabarito.add("a");
        gabarito.add("a");
        gabarito.add("e");

        
        // Array Dinamico
        // ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<String> respostaAluno = new ArrayList<String>();
        System.out.print("Digite a resposta da questão e pressione ENTER: \n");
        for (int indice=0; indice<TAMANHO; indice++){
            respostaAluno.add(respostas.nextLine());
            if(respostaAluno.get(indice).equals(gabarito.get(indice))){
                acertos = acertos + 1;
            }
        }
        respostas.close();
        
        // String stringGabarito = Arrays.toString(gabarito);
        System.out.printf("GABARITO: %s%n",gabarito);
        System.out.printf("ALUNO:    %s%n",respostaAluno);
        System.out.printf("ACERTOU:  %d questões!!!",acertos);
    }
    
}
