package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        /*List<Integer> result = Stream.of(1, 2, 3, 4)
                .peek(x -> list.add(x))
                .map(x -> x * 2)
                .collect(Collectors.toList());*/

        Stream<Integer> result = Stream.of(1, 2, 3, 4)
                .peek(x -> list.add(x))
                .map(x -> x * 2)
                .filter(x -> x > 8);

        System.out.println(list);
        System.out.println(result);
        Stream.of(1,2,3).collect(Collectors.toList()).sort(Comparator.comparing(a->a));
        Stream.of(1,2,3).mapMulti((number, consumer) -> {
            consumer.accept(number+"a");
            consumer.accept(number+"b");
        }).forEach(System.out::println);
        FunInterface fun = () -> System.out.println("Test");
    }
}
