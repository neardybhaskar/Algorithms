public class Exception_Test {

    public void checkingException() throws ArithmeticException {
        try {
            throw new ArithmeticException("aritmetic exception");
        } finally {
            System.out.println("Inside finally");
        }
    }

    public static void main(String[] args) {

        try {
            Exception_Test exception_test = new Exception_Test();
            exception_test.checkingException();
            System.out.println("Test");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
