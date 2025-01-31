import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamEmployeeMainTest {

    public static void main(String[] args) {
        List<Employee> studentList = Arrays.asList(
                new Employee(1, "Bhaskar", "Singh", 30, "Male", "Computer", 2014, "Mumbai", 7),
                new Employee(1, "Dinesh", "Singh", 55, "Male", "Security", 2000, "Mumbai", 1),
                new Employee(1, "Suman", "Singh", 30, "Female", "House", 2000, "Mumbai", 2),
                new Employee(1, "Varsha", "Singh", 32, "Female", "Arts", 2010, "UP", 4),
                new Employee(1, "Aayushi", "Mittal", 29, "Female", "Computer", 2015, "Gujarat", 6),
                new Employee(1, "Shivam", "Singh", 31, "Male", "Commere", 2013, "UP", 8)
        );

        /**
         * Sum of Age with map key as Total
         */
        studentList.stream().collect(Collectors.summarizingInt(Employee::getAge)).toString();
    }

}
