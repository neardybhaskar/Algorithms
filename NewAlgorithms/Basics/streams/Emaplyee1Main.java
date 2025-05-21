import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Emaplyee1Main {

    public static void main(String[] args) {
        Employee1 emp1 = new Employee1("ramesh", 23, 123452627);
        Employee1 emp2 = new Employee1("suresh", 43, 797975412);
        Employee1 emp3 = new Employee1("Naresh", 51, 888888233);
        Employee1 emp4 = new Employee1("Naresh", 55, 999999993);
        List<Employee1> employee1List = Arrays.asList(emp1,emp2,emp3,emp4);
        //employee1List.stream().filter(e -> String.valueOf(e.getPhone()).contains("23")).forEach(System.out::println);
        //employee1List.stream().sorted(Collections.sort()).forEach(System.out::println);
        employee1List.sort(new Employee1());
        employee1List.stream().forEach(System.out::println);
    }

}
