package Functional_Programming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Bhaskar Singh
 * @date 4/9/2021 6:26 PM
 */
public class Streams1 {
    @Override
    public int hashCode() {
        return Arrays.hashCode(new int[1]);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {

        String[] test = {"a", "b", "c", "a"};

        StringBuilder test1 = Arrays.stream(test).parallel()
                .collect(() -> new StringBuilder(), (a,b) -> a.append(b), (a1,b1) -> a1.append(b1));
        System.out.println(test1);

        String test2 = Arrays.stream(test).parallel()
                .collect(Collectors.joining());
        System.out.println(test2);

        StringBuilder test3 = Arrays.stream(test).parallel()
                .collect(StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append);
        System.out.println(test3);

        Set<String> stringSet = Arrays.stream(test).parallel()
                .collect(Collectors.toCollection(() -> new HashSet<>()));

        /**
         * Stream for getting Map out of Stream
         */
        Map<String, String> stringMap = Arrays.stream(test).parallel()
                .collect(Collectors.toMap(a -> a, a -> a,(a1, b1) -> a1, () -> new TreeMap<>()));
        for (Map.Entry<String, String> st :
                stringMap.entrySet()) {
            System.out.println(st);
        }

        Map<String, String> stringMap1 = Arrays.stream(test).parallel()
                .collect(Collectors.toMap(Function.identity(),
                        Function.identity(),
                        (a1, b1) -> a1, () -> new TreeMap<>()));

        /**
         * Can also be grouped using groupingBy() method
         */
        Map<String, List<String>> listMap = Arrays.stream(test).parallel()
                .collect(Collectors.groupingBy(a -> a));

        for (Map.Entry<String,List<String>> entry:
             listMap.entrySet()) {
            System.out.println(entry);
        }

        /**
         * Here in groupingBy()  method we are using 3 diff parameters,
         * TreeMap::new for sorting and Collectors.toSet() to store values in form of set
         */
        Map<String, Set<String>> listMap1 = Arrays.stream(test).parallel()
                .collect(Collectors.groupingBy(a -> a,TreeMap::new, Collectors.toSet()));

        for (Map.Entry<String,Set<String>> entry:
                listMap1.entrySet()) {
            System.out.println(entry);
        }

        /**
         * In this method we used "Collectors.counting()" to get the total count of elements,
         * there are also methods to get average using "Collectors.averagingDouble()"
         * Also to find min or max value we can use "Collectors.minBy(<Comparator>) or other"
         * Also to print summary(min, max, avg, total) we can use "Collectors.summarizingDouble()"
         */
        Map<String, Long> listCountingMap = Arrays.stream(test).parallel()
                .collect(Collectors.groupingBy(a -> a,Collectors.counting()));

        System.out.println(listCountingMap);

        /**
         * Here we are using Collectors.partitioningBy() which is used to partition elements
         * in particular condition, it will update values by boolean condition true or false
         * as key
         */
        Map<Boolean,List<String>> booleanListMap = Arrays.stream(test).parallel()
                .collect(Collectors.partitioningBy(a -> a == "a"));
        System.out.println(booleanListMap);
    }

}
