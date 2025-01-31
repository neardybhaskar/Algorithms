import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {
        Map<Employee, String> employeeMap = new HashMap<>();
        Employee e1 = new Employee(1, "Bhaskar", "Singh", 30, "Male", "Computer", 2014, "Mumbai", 7);
        Employee e2 = new Employee(1, "Dinesh", "Singh", 55, "Male", "Security", 2000, "Mumbai", 1);
        Employee e3 = new Employee(1, "Suman", "Singh", 30, "Female", "House", 2000, "Mumbai", 2);
        Employee e4 = new Employee(1, "Varsha", "Singh", 32, "Female", "Arts", 2010, "UP", 4);
        Employee e5 = new Employee(1, "Aayushi", "Mittal", 29, "Female", "Computer", 2015, "Gujarat", 6);
        Employee e6 = new Employee(1, "Shivam", "Singh", 31, "Male", "Commere", 2013, "UP", 8);
        employeeMap.put(e1, "employee1");
        employeeMap.put(e2, "employee2");
        employeeMap.put(e3, "employee3");
        employeeMap.put(e4, "employee4");
        employeeMap.put(e5, "employee5");
        employeeMap.put(e6, "employee6");
        for(Map.Entry e: employeeMap.entrySet()) {
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }

}
