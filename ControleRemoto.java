public class ControleRemoto {
    int volume;
    boolean ligado;
    boolean tocando;


    void ligar(){
        this.ligado = true;
    }


    void desligar(){
        this.ligado = false;
    }


    void volumemais(){
        if (this.ligado) {
            volume++;
        }
    }


    void volumemenos(){
        if (this.ligado) {
            volume--;
        }
    }

    void play(){
        if(this.ligado==true){
            tocando=true;
        }
    }

    void pause(){
        if(this.ligado==true){
            tocando=false;
        }
    }

    void status(){
        if (this.ligado==true){
            System.out.println("STATUS DO SEU CONTROLE REMOTO: ");
            System.out.println("SEU VOLUME ESTA EM :" + this.volume);
            if (this.tocando==true) {
                System.out.println("ESTA NO PLAY ");
            }else{
                System.out.println("ESTA NO PAUSE");
            }
        }else{
            System.out.println("O CONTROLE REMOTO ESTA DESLIGADO");
        }
    }





}