public class Palestra {
    private Luz L;

    Palestra(Luz p){
        L = p;
    }

    Luz getPassagem(){
        return L;
    }

    public void acessa(){
        switch (L){
            case VERMELHO:
                System.out.println("Palestra indisponivel no momento\n");
                break;
            case AMARELO:
                System.out.println("Palestra sendo liberada ,aguarde\n");
                break;
            case VERDE:
                System.out.println("Palestra disponivel ,siga em frente\n");
                break;
        }
    }
}
