import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class StreamTest67 {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "HR", 50000),
                new Employee("Charlie", "IT", 70000),
                new Employee("David", "Finance", 80000),
                new Employee("Eve", "HR", 55000)
        );

        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department));

        employeesByDept.forEach((dept, empList) ->
                System.out.println(dept + " -> " + empList));
        /*employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartment,);*/
        Map<String, List<String>> map = new HashMap<>();
        for(Employee employee: employees) {
            if(map.containsKey(employee.getDepartment())) {
                map.get(employee.getDepartment()).add(employee.name);
            } else {
                List<String> list = new ArrayList<>();
                list.add(employee.getName());
                map.put(employee.getDepartment(),list);
            }
        }


    }
}