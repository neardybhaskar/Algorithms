import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest32 {

    public static void main(String[] args) {
        /*list.stream().sorted(Comparator.comparing(Employee::getName).
                thenComparing(Employee::getDesignation)).collect(Collectors.toList());*/
        String str = "java welcome";
        Set<Character> set = new HashSet<>();
        System.out.println(str.chars().mapToObj(c -> (char)c).filter(e -> !set.add(e)).findFirst().get());

        //select * from employee e inner join department d on e.department_id = d.department_id where e.salary >= 10000
    }

}
