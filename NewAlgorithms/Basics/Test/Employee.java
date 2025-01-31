import java.util.Objects;

public class Employee {

    /** The id. */
    private int id;

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The age. */
    private int age;

    /** The gender. */
    private String gender;

    /** The departmant name. */
    private String departmantName;

    /** The joined year. */
    private int joinedYear;

    /** The city. */
    private String city;

    /** The rank. */
    private int rank;

    public Employee(int id, String firstName, String lastName, int age, String gender, String departmantName, int joinedYear, String city, int rank) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.departmantName = departmantName;
        this.joinedYear = joinedYear;
        this.city = city;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && joinedYear == employee.joinedYear && rank == employee.rank && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(gender, employee.gender) && Objects.equals(departmantName, employee.departmantName) && Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + getId();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getRank();
        result = 31 * result + getAge();
        result = 31 + result + getJoinedYear();
        result = 31 + result + getDepartmantName().hashCode();
        result = 31 + result + getGender().hashCode();
        return result;
        //return Objects.hash(id, firstName, lastName, age, gender, departmantName, joinedYear, city, rank);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartmantName() {
        return departmantName;
    }

    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", departmantName='" + departmantName + '\'' +
                ", joinedYear=" + joinedYear +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
