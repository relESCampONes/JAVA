public class Classes {
    public static void main(String[] args) {

        int num = 0;

        Jogador player1 = new Jogador(++num); // Neste caso, incrementa(++) 1 primeiro e depois usa o atributo "num" = resultando em 1
        Jogador player2 = new Jogador(num++); // Neste caso, ele usa primeiro o atributo(continuando a ser 1), e depois incrementa para se tornar 2
        Jogador player3 = new Jogador(++num); 

        // player1.number = 10;
        // player2.number = 5;
        // player3.number = 23;

        // System.out.println(player1.number);
        // System.out.println(player2.number);
        // System.out.println(player3.number);



    }
}
