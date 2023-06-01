public class MetodosGetSet {
    public static void main(String[] args) {
        
        int num = 0;

        Jogador j1 = new Jogador(++num);
        Jogador j2 = new Jogador(++num);
        Jogador j3 = new Jogador(++num);
        Jogador j4 = new Jogador(++num);

        j1.setVidas(5);
        j2.setVidas(3);
        j3.setVidas(0);
        j4.setVidas(0);

        j1.addVidas(-3);
        j2.addVidas(-1);
        j3.addVidas(3);
        j4.addVidas(2);

        num = 0;

        System.out.printf("%nVidas do jogador %d/%d: %d",++num,Jogador.quantidadeTotalJogadores,j1.getVidas());
        System.out.printf("%nVidas do jogador %d/%d: %d",++num,Jogador.quantidadeTotalJogadores,j2.getVidas());
        System.out.printf("%nVidas do jogador %d/%d: %d",++num,Jogador.quantidadeTotalJogadores,j3.getVidas());
        System.out.printf("%nVidas do jogador %d/%d: %d",++num,Jogador.quantidadeTotalJogadores,j4.getVidas());

        // System.out.printf("%nVidas do jogador 1: %d",j1.num);
        // Atributos=propriedades=variaveis
        // Métodos=funções

            



    }    




}
