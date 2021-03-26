import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Bhaskar on 20-01-2021
 */
public class SortingTest {

    public static void main(String[] args) {

        Student student = new Student(1,1);
        Student student1 = new Student(2, 2);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student);

        Collections.sort(studentList,new SortStudent());
    }

}

class Student {

    private int id;

    private int name;

    public Student(int id, int name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}

class SortStudent implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName() - o2.getName();
    }
}
