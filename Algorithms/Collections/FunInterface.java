package Collections;

@FunctionalInterface
public interface FunInterface {

    public void funInterface();

}

class FunInterfaceImplementation {
    public static void main(String[] args) {
        FunInterface funInterface = () -> System.out.println("test");
        funInterface.funInterface();
    }
}
