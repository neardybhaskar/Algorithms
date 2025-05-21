import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class StreamApiTest {

    public static void main(String[] args) {
        List<Students> array = List.of(
                new Students(1,"Bhaskar", "Singh", 30, "Male", "IT", 2018, "Mumbai", 111),
                new Students(2,"Abhi", "Singh", 31, "Male", "IT", 2017, "Pune", 112),
                new Students(3,"Jayesh", "Singh", 32, "Male", "IT", 2016, "Mumbai", 114),
                new Students(4,"Shivam", "Singh", 33, "Male", "IT", 2015, "Mumbai", 115),
                new Students(5,"Pankaj", "Singh", 34, "Male", "IT", 2014, "Mumbai", 116),
                new Students(6,"Dinesh", "Singh", 35, "Male", "IT", 2013, "Mumbai", 117),
                new Students(7,"Anil", "Singh", 36, "Male", "IT", 2012, "Delhi", 118),
                new Students(8,"Sunil", "Singh", 37, "Male", "IT", 2011, "Delhi", 119),
                new Students(9,"Raj", "Singh", 38, "Male", "IT", 2010, "Delhi", 120),
                new Students(10,"Shekhar", "Singh", 39, "Male", "IT", 2019, "Delhi", 121),
                new Students(11,"Aarti", "Singh", 40, "Female", "IT", 2020, "Mumbai", 122),
                new Students(12,"Aayushi", "Singh", 41, "Female", "IT", 2021, "Pune", 123),
                new Students(13,"Pranjal", "Singh", 42, "Female", "IT", 2022, "Mumbai", 124),
                new Students(14,"Varsha", "Singh", 43, "Female", "IT", 2023, "Pune", 125),
                new Students(15,"Suman", "Singh", 44, "Female", "IT", 2024, "Pune", 126)
        );
        String s = "This is java code This is java code java";
        Integer[] i = {1,2,3,5,6,7,9};
        int[] j = {1,2,3,4,5,6,7,8,9};
        List list = new ArrayList();
        Stream.of(i).forEach(e->list.add(e));
        String[] strings = s.split(" ");
        IntStream.range(1,9).filter(element -> !list.contains(element)).forEach(e -> System.out.println(e));
        Stream.of(strings).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream().max(Map.Entry.comparingByValue());
        System.out.println(Stream.of(strings).collect(groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()));
        Map<String, List<Students>> listMap = array.stream().collect(groupingBy(Students::getGender));
        Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
    }

}
