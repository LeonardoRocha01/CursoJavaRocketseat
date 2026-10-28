package POO.Abstração;

public class Computador {
    static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.enviarMensagem();
        facebook.receberMensagens();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagens();
    }
}
