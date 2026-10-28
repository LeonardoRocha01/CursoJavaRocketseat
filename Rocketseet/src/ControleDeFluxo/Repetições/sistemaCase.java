package ControleDeFluxo.Repetições;

public class sistemaCase {
    static void main(String[] args) {
        char sigla =  'L';
        switch(sigla){
            default:
                System.out.println("Idefinido");
                break;
            case 'P':
                System.out.println("Pequeno");
                break;
                case 'M':
                    System.out.println("Médio");
                    break;
                    case 'G':
                        System.out.println("Grande");
                        break;
        }

    }
}
