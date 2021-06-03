package Interface;

/**
 * @author Bhaskar on 30-01-2021
 */
interface InterfaceBegin {
    int a = 10;
    default void play() {
        System.out.println("In InterfaceBegin");
    }
}

public interface InterfaceA extends InterfaceBegin {

    default void play() {
        InterfaceBegin.super.play();
        System.out.println("In InterfaceA");
    }

}

interface InterfaceB extends InterfaceA {

    default void play() {
        System.out.println("In InterfaceB");
    }

}

interface InterfaceC extends InterfaceA {

    default void play() {
        InterfaceA.super.play();
        System.out.println("In InterfaceC");
        int a = 10;
        a++;
    }

    void play1(String a);

    void play1(String a, String b);



}

class CallingClass implements InterfaceC {

    @Override
    public void play() {
        InterfaceC.super.play();
    }

    @Override
    public void play1(String a) {

    }

    @Override
    public void play1(String a, String b) {

    }

    public static void main(String[] args) {

        InterfaceC callingClass = new CallingClass();
        callingClass.play();

    }

}
