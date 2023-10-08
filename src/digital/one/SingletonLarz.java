package digital.one;

/**Singleton preguiçoso
 *
 * @author fagner
 */

public class SingletonLarz {

    private static SingletonLarz instancia;

    public SingletonLarz() {
    }

    public static SingletonLarz getInstance(){
        if(instancia == null){
            instancia = new SingletonLarz();
        }

        return instancia;
    }
}
