import java.util.Scanner;

public class ObterDadosTeclado {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        float n1=0,n2=0,n3=0,n4=0;
        double mediaAluno=0;
        final float MEDIA_NOTA = 7.0f;
        String res="",nome="";
        int cont=0;
        int quantidadeAluno=0;

        System.out.print("Digite a quantidade de alunos que terminaram todas as provas: ");
        quantidadeAluno=entrada.nextInt();

        // for(int cont=0 ; cont<=3 ; cont++){  
        while(cont<quantidadeAluno){
            System.out.print("\nDigite o nome do aluno: ");
            nome=entrada.next();
            System.out.print("Digite a primeira nota: ");
            n1=entrada.nextFloat();
            System.out.print("Digite a segunda nota: ");
            n2=entrada.nextFloat();
            System.out.print("Digite a terceira nota: ");
            n3=entrada.nextFloat();
            System.out.print("Digite a quarta nota: ");
            n4=entrada.nextFloat();
            mediaAluno=(n1+n2+n3+n4)/4;
        
            if(mediaAluno<MEDIA_NOTA){
                res="REPROVADO";
            }else if(mediaAluno>=MEDIA_NOTA){
                res="APROVADO";
            }
        
            System.out.printf("A Média da faculdade é: %.2f e %s teve a nota: %.2f, portanto está %s!!!%n",MEDIA_NOTA,nome,mediaAluno,res);
            cont++;
    
       }
    }
}
