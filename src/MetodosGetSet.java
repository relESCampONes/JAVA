public class MetodosGetSet {
    public static void main(String[] args) {
        
        int num = 0;

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);

        j1.setVidas(0);
        j2.setVidas(0);
        j3.setVidas(0);

        j1.addVidas(-3);
        j2.addVidas(-1);
        j3.addVidas(3);

        System.out.printf("%nVidas do jogador 1: %d",j1.getVidas());
        System.out.printf("%nVidas do jogador 2: %d",j2.getVidas());
        System.out.printf("%nVidas do jogador 3: %d",j3.getVidas());
 

        // System.out.printf("%nVidas do jogador 1: %d",j1.num);
            



    }    




}
