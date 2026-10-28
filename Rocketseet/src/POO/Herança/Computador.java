package POO.Herança;

public class Computador {
    static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.enviarMensagens();
        facebook.receberMensagens();

        Telegram telegram = new Telegram();
        telegram.enviarMensagens();
        telegram.receberMensagens();
    }
}
