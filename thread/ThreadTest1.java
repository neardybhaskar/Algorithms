package thread;

/**
 * @author Bhaskar on 31-12-2020
 */
public class ThreadTest1 implements Runnable {
    private Thread t;
    String thread;

    public ThreadTest1(String thread) {
        this.thread = thread;
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(this.thread);
        }

    }

    public void start() {
        if(t == null) {
            t = new Thread(this, thread);
            t.start();
        }
    }
}

class TestThread {

    public static void main(String[] args) {
        ThreadTest1 threadTest1 = new ThreadTest1("A");
        ThreadTest1 threadTest11 = new ThreadTest1("B");
        threadTest11.start();
        threadTest1.start();
    }

}