import Strategy.*;
import digital.one.SingletonEager;
import digital.one.SingletonLarz;
import digital.one.SingletonLarzHolder;

public class Main {
    public static void main(String[] args) {

        //Sigleton
        SingletonLarz larz = SingletonLarz.getInstance();
        System.out.println(larz);
        larz = SingletonLarz.getInstance();
        System.out.println(larz);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLarzHolder larzHolder = SingletonLarzHolder.getInstance();
        System.out.println(larzHolder);
        larzHolder = SingletonLarzHolder.getInstance();
        System.out.println(larzHolder);

        //Stategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defencivo = new ComportamentoDefencivo();
        Comportamento agrecivo = new ComportamentoAgrecivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
    }
}