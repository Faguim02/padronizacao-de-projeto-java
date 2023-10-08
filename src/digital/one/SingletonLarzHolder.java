package digital.one;

public class SingletonLarzHolder {

    private static class InstanceHolder {
        public static SingletonLarzHolder instance = new SingletonLarzHolder();
    }

    private SingletonLarzHolder() {
        super();
    }

    public static SingletonLarzHolder getInstance(){
        return InstanceHolder.instance;
    }
}
