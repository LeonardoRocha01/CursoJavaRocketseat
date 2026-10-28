package POO.Abstração;

public class Telegram extends SistemaMensagem {
    public void enviarMensagem() {
            System.out.println("\nenviando mensagem pelo Telegram...");
    }

    @Override
    public void receberMensagens() {
        System.out.println("recebendo mensagem pelo Telegram...");
    }
}
