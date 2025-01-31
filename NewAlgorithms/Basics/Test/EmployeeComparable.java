import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

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

    public EmployeeComparable(int id, String firstName, String lastName, int age, String gender, String departmantName, int joinedYear, String city, int rank) {
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

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(EmployeeComparable employeeComparable) {
        return this.getFirstName().compareTo(employeeComparable.getFirstName());
    }

    public static void main(String[] args) {
        List<EmployeeComparable> studentList = Arrays.asList(
                new EmployeeComparable(1, "Bhaskar", "Singh", 30, "Male", "Computer", 2014, "Mumbai", 7),
                new EmployeeComparable(3, "Bhaskar", "Being", 30, "Male", "Computer", 2014, "Mumbai", 7),
                new EmployeeComparable(2, "Dinesh", "Singh", 55, "Male", "Security", 2000, "Mumbai", 1),
                new EmployeeComparable(3, "Suman", "Singh", 30, "Female", "House", 2000, "Mumbai", 2),
                new EmployeeComparable(4, "Varsha", "Singh", 32, "Female", "Arts", 2010, "UP", 4),
                new EmployeeComparable(5, "Aayushi", "Mittal", 29, "Female", "Computer", 2015, "Gujarat", 6),
                new EmployeeComparable(6, "Shivam", "Singh", 31, "Male", "Commere", 2013, "UP", 8)
        );
        Collections.sort(studentList);
    }
}
