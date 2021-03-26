package Comparable;

import java.util.Hashtable;
import java.util.TreeSet;

/**
 * @author Bhaskar on 02-01-2021
 */

class Student implements Comparable<Student> {

    int a;

    int b;

    public Student(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Student student) {
        if(this.a == student.a) {
            return 0;
        } else if(this.a > student.a) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class ComparableTest {

    public static void main(String[] args) {

        TreeSet<Student> treeSet = new TreeSet<>();
        Hashtable hashtable = new Hashtable();
        treeSet.add(new Student(1,1));
        treeSet.add(new Student(5,5));
        treeSet.add(new Student(4,5));
        System.out.println(13 >> 1);
        int n = 100 - 1;
        System.out.println(n |= n >>> 1);
        System.out.println(n |= n >>> 2);
        System.out.println(n |= n >>> 4);
        System.out.println(n |= n >>> 8);
        System.out.println(n |= n >>> 16);
        System.out.println("a".hashCode());

    }

}
