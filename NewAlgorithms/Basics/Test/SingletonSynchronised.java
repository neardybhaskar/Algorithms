public class SingletonSynchronised {

    public static SingletonSynchronised singletonSynchronised;

    private SingletonSynchronised() {}

    public static SingletonSynchronised getInstance() {
        if(singletonSynchronised == null) {
            synchronized (SingletonSynchronised.class) {
                if(singletonSynchronised == null) {
                    return new SingletonSynchronised();
                }
            }
        }
        return singletonSynchronised;
    }

    public static void main(String[] args) {
        getInstance();
    }

}
