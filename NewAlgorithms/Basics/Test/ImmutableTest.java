public final class ImmutableTest {

    private String value1;

    private String value2;

    private Employee employee;

    public ImmutableTest(String value1, String value2, Employee employee) {
        this.value1 = value1;
        this.value2 = value2;
        this.employee = new Employee(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getAge(), employee.getGender(), employee.getDepartmantName(), employee.getJoinedYear(), employee.getCity(), employee.getRank());
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }

    public Employee getEmployee() {
        return new Employee(employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getAge(), employee.getGender(), employee.getDepartmantName(), employee.getJoinedYear(), employee.getCity(), employee.getRank());
    }

    @Override
    public String toString() {
        return "ImmutableTest{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", employee=" + employee +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Bhaskar", "Singh", 30, "Male", "Computer", 2014, "Mumbai", 7);
        ImmutableTest immutableTest = new ImmutableTest("Value1", "Vaule2", employee1);
        System.out.println(immutableTest);
        employee1.setLastName("Bhai");
        employee1.setDepartmantName("IT");
        System.out.println(immutableTest);
    }

}
