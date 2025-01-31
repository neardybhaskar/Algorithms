import java.util.Arrays;
import java.util.List;

public class EmployeeComparatorMain {

    public static void main(String[] args) {
        List<Employee> studentList = Arrays.asList(
                new Employee(1, "Bhaskar", "Singh", 30, "Male", "Computer", 2014, "Mumbai", 7),
                new Employee(3, "Bhaskar", "Being", 30, "Male", "Computer", 2014, "Mumbai", 7),
                new Employee(2, "Dinesh", "Singh", 55, "Male", "Security", 2000, "Mumbai", 1),
                new Employee(3, "Suman", "Singh", 30, "Female", "House", 2000, "Mumbai", 2),
                new Employee(4, "Varsha", "Singh", 32, "Female", "Arts", 2010, "UP", 4),
                new Employee(5, "Aayushi", "Mittal", 29, "Female", "Computer", 2015, "Gujarat", 6),
                new Employee(6, "Shivam", "Singh", 31, "Male", "Commere", 2013, "UP", 8)
        );
        studentList.sort(new EmployeeComparator());
    }

}
