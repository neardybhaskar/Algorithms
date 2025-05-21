import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentBuilderMain {

    public static void main(String[] args) {
        //StudentBuilder.builder().name("Amol").;
        List<StudentBuilder> studentBuilders = new ArrayList<>();
        StudentBuilder studentBuilder = new StudentBuilder("Amol", 21);
        StudentBuilder studentBuilder1 = new StudentBuilder("Rahul", 11);
        StudentBuilder studentBuilder2 = new StudentBuilder("Rahuls", 11);
        studentBuilders.add(studentBuilder);
        studentBuilders.add(studentBuilder1);
        studentBuilders.add(studentBuilder2);
        studentBuilders.stream()//.collect(Collectors.groupingBy(e -> e.getAge() > 20, Function.identity()))
                .collect(Collectors.partitioningBy(e -> e.getAge() > 20)).
                entrySet().forEach(e -> System.out.println("key -> "+e.getKey()+" value -> "+e.getValue().size()));
    }

}
