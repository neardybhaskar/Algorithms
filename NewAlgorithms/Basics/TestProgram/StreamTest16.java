import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest16 {

    public static void main(String[] args) {
        List<EmployeeStreamTest> list = new ArrayList<>();
        list.stream().
                collect(Collectors.groupingBy(EmployeeStreamTest::getDepartment, Collectors.averagingDouble(EmployeeStreamTest::getSalary)))
                .forEach(System.out::printf);

    }

}
