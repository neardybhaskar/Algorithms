import java.util.Optional;
import java.util.stream.Stream;

public class CharCount {

    private Integer integer;
    public CharCount(Integer integer) {
        this.integer=integer;
    }

    public void testMethodReference(String integer) {
        System.out.println("Method Reference test");
    }

    public static String charCount(String input) {
        for(int i=0; i<input.charAt(i); i++) {
            
        }
        return "";
    }

    public static void main(String[] args) {
        CharCount charCount = new CharCount(12);
        Stream.of(1,2,3).mapMulti((number, consumer) -> {
            consumer.accept(number+"a");
            consumer.accept(number+"b");
        }).forEach(charCount::testMethodReference);
        Stream.of(1,2,3).map(CharCount::new);
        String s = null;
        Optional<String> optionalS = Optional.ofNullable(s);
        if(optionalS.isPresent()){
            System.out.println(optionalS.get());
        }
    }

    private void testMethodReference(Object o) {
    }

}
