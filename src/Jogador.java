public class Jogador {
    public int kak = 0;
    private final int MAX_VIDAS = 5;
    private int number = 0;
    private int vidas = 0;
    private int vidaExtra = 0;
    private int vidaRestante = 0;
    
    public Jogador(int number){
        this.number = number; // Para fazer referência ao atributo number da classe é necessário inserir "this."
        System.out.printf("Jogador número %d criado%n", this.number);
    }

    public int getVidas(){
        return this.vidas;
    }

    public void setVidas(int vidas){
        if(vidas > MAX_VIDAS){
            this.vidas = MAX_VIDAS;
        }
        else if(vidas < 0){
            this.vidas = 0;
        }
        else{
            this.vidas = vidas;
        }
    }

    public void addVidas(int vidaExtra){
        this.vidaExtra = vidaExtra;
        this.vidaRestante = MAX_VIDAS - this.vidas;
        if((this.vidas + this.vidaExtra) < 0){
            this.vidas = 0;
        }else if(vidaRestante >= 0 && this.vidaExtra <= vidaRestante){
            this.vidas = this.vidas + this.vidaExtra;
        }else{            
            vidas = MAX_VIDAS;
        }

    }

}
