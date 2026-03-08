public class Main {
    public static void main(String[] args) {
        //ligar 
        //desligar
        //volumemais
        //volumemenos
        //play
        //pause
        //status
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.volumemais();
        c1.status();
        ControleRemoto c2 =   new ControleRemoto();
        c2.ligar();
        c2.status();
        
    }
}