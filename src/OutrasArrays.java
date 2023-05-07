import java.util.Scanner;
import java.util.*;


public class OutrasArrays {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int chave = 0;
        System.out.printf("Digite cada número de sua preferência e pressione ENTER: %n");

        for(int indice=0; indice<numeros.length; indice++){
            System.out.printf("Digite o número da posição %d :  ", contador);
            numeros[indice]=entrada.nextInt();
            contador++;
        }

        // Organiza em ordem crescente
        Arrays.sort(numeros);
        // Arrays.fill(numeros,10); --- "Prenche cada posição com o valor 10"
        // System.arraycopy(numeros,0,destino,0,10); --- "(origem,copiar a partir de qual posição,destino,colar a partir de qual posição, quantos elementos)"
        // Arrays.equals(numeros, destino); --- Retorna valor Booleano

        entrada.close();
        // Arrays.binarySearch(numeros, 55); --- Procura o numero 55 dentro a Array numeros e retorna a posição( mas precisa estar em ordem crescente utilizando o Arrays.sort) 
        System.out.printf("Aqui estão seus números ordenados em ordem crescente: %n%s%n", Arrays.toString(numeros));
        System.out.println(chave);
    }
}
