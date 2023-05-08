public class Metodos {
    public static void main(String[] args) {
        
        // Chamada direta do método
        msg("Testando métodos com parâmentros de entrada!!!\n",8);
        somar(8789, 100);
        somarSemRetornar(8789, 100);
        somarTudo(2,3,4,5,100,100,234);
        somarTudo(23.4,44.3);
        // System.out.println(somar(9,9)); --- Para imprimir no método principal, ficar atento ao return, pois necessitará de uma variável 
    }

    public static void msg(String mensagem, int quantidade){
        for(int indice = 0; indice < quantidade; indice++){
            System.out.print(mensagem);
        }
    }
    
    public static int somar(int n1, int n2){
        System.out.printf("%d\n", n1 + n2);
        return 0;
    }

    public static void somarSemRetornar(int x, int y){
        System.out.print(x + y);
    }

    public static int somarTudo(int... numeros){
        int resultado = 0;
        for(int n : numeros){
            resultado += n;
        }
        System.out.printf("\n%d", resultado);
        return 0;

    }
    // Sobre carga com mesmo nome de método, porém a entrada tem de ser do mesmo tipo
    public static Double somarTudo(Double... numeros){
        Double resultado = 0.0;
        for(Double n : numeros){
            resultado += n;
        }
        System.out.printf("\n%.2f", resultado);
        return 0.0;

    }
    
}
