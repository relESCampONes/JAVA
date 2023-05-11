public class Jogador {

    private int number = 0;
    
    public Jogador(int number){
        this.number = number; // Para fazer referência ao atributo number da classe é necessário inserir "this."
        System.out.printf("Jogador número %d criado%n", number);
    }
}
