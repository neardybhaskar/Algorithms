import Practise.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest29 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
        String str = "abc";
    }
}
