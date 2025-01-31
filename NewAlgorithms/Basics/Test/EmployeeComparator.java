import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        int n = 0;
        n = e1.getFirstName().compareTo(e2.getFirstName());
        if(n != 0) {
            return n;
        }
        n = e1.getLastName().compareTo(e2.getLastName());
        if(n != 0) {
            return n;
        }
        n = e1.getId() - e2.getId();
        if(n != 0) {
            return n;
        }
        return n;
    }

}
