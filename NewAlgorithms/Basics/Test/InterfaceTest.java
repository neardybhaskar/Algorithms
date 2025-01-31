public interface InterfaceTest {

    void abstractTest();

    public default void defaultTest() {
        System.out.println("Inside default method");
    }

    public static void staticTest() {
        System.out.println("Inside static method");
    }

    class IClass implements InterfaceTest{

        @Override
        public void abstractTest() {
            System.out.println("Inside Abstract method");
        }

        public static void main(String[] args) {
            InterfaceTest interfaceTest = new IClass();
            interfaceTest.defaultTest();
            InterfaceTest.staticTest();
        }
    }

}
