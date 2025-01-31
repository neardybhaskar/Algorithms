import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCount {
    //{ 1, 2, 3, 4, 5 ,6, 7, 8, 2 5, 6, 6, 8}
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5 ,6, 7, 8, 2, 5, 6, 6, 8});
        list.stream().filter(number -> Collections.frequency(list, number) > 1).collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
