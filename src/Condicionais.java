public class Condicionais {
    public static void main(String[] args){

        // == >, <, >=, <=, !=, ! (true / false) - &&,OR
        
        int nota = 85;
        // int faltas = 4;
        // int maxFaltas = 5;
        int media = 60;
        String res;
        int outroRes;

        // Operação Ternária, e essa operação pode ser utilizada em qualquer posição 
        res=(nota>=media ? "Aprovado": "Reprovado");
        System.out.println("Resultado: " + res);
        // Outra posição para a Operação Ternária
        outroRes=(nota>=media ? 1 : 0);
        System.out.println("Resultado: " + (outroRes==1 ? "Aprovado" : "Reprovado"));

        // if(nota>=media && faltas<=maxFaltas){
        //     System.out.println("Aprovado!");
        // }else if(nota>=40){
        //     System.out.println("Recuperação!");
        // }
        // else{
        //     System.out.println("Reprovado!");
        // }
        // System.out.println("Fim do programa!");

    }
}
