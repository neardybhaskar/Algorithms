import java.util.Comparator;

public class Employee1 implements Comparator<Employee1> {
    private String name;
    private int id;
    private long phone;

    public Employee1() {
    }

    public Employee1(String name, int id, long phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }





    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        int equals;
        if(o1.getName().equals(o2.getName())) {
            equals = o2.getId() - o1.getId();
        } else {
            equals = o1.getName().compareTo(o2.getName());
        }
        return equals;
    }
}
