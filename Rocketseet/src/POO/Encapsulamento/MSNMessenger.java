package POO.Encapsulamento;

public class MSNMessenger {
    public void enviarMensagens(){
        if(validarConectadoInternet()) {
            System.out.println("Enviando Mensagem...");
        }else System.out.println("Offline");
    }
    public void receberMensagens(){
            System.out.println("Recebendo Mensagem...");
    }
    private boolean validarConectadoInternet(){
        System.out.println("Validando Conectado Internet...");
        return false;
    }
    private void salvarHistoricoMensagens(){
        System.out.println("Salvando Mensagem...");
    }
}
