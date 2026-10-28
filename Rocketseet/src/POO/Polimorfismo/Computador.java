package POO.Polimorfismo;


import POO.Abstração.Facebook;
import POO.Abstração.SistemaMensagem;
import POO.Abstração.Telegram;

public class Computador {
    static void main(String[] args) {
        SistemaMensagem smi = null;
        String appEscolhido = "Telegram";
        if (appEscolhido.equals("Telegram")) {
            smi = new Telegram();
        }else {
            appEscolhido.equals("Facebook");
            smi = new Facebook();
        }
        smi.enviarMensagem();
        smi.receberMensagens();
    }
}
