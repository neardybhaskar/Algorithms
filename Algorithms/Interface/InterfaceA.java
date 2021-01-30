package Interface;

/**
 * @author Bhaskar on 30-01-2021
 */
interface InterfaceBegin {
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
    }

}

class CallingClass implements InterfaceC {

    @Override
    public void play() {
        InterfaceC.super.play();
    }

    public static void main(String[] args) {

        CallingClass callingClass = new CallingClass();
        callingClass.play();

    }

}
