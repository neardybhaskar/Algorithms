public class TestStream12 {

    private static final TestStream12 testStream12 = null;

    private TestStream12() {

    }

    public static TestStream12 getInstance() {
        if(testStream12 == null) {
            return new TestStream12();
        }
        return testStream12;
    }

    //System design pattern
    //Design how to improve the design

}
