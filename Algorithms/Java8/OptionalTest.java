package Java8;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * @author Bhaskar Singh
 * @date 5/4/2021 11:49 PM
 */
public class OptionalTest {

    public static Optional<Set<String>> test() {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        return Optional.of(set);
    }

    public static void main(String[] args) {

        if(test().isPresent()) {
            System.out.println(test().get());
        } else {
            System.out.println("The object is null");
        }

    }

}
