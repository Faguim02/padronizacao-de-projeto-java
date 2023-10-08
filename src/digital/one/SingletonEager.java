package digital.one;

/*Singleton Apressado
   @author fagner
 * */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
