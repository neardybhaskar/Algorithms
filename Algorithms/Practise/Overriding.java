package Practise;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Bhaskar on 04-03-2021
 */
public abstract class Overriding implements Cloneable {

    private int test = 1;

    public int getTest() {
        return test;
    }

    @Override
    public Overriding clone() {
        try {
            return (Overriding) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    private String s;

    public String getS() {
        return s;
    }

    public Overriding() {    }

    public Overriding(String s) {
        this.s = s;
    }

    public void test1() {
        System.out.println("Inside test1");
    }

    public static void test3() {
        System.out.println("Static method");
    }

    public abstract void test();

}

class Test1 extends Overriding {

    int test = 0;

    public void test2() {
        System.out.println("Inside test2");
    }

    @Override
    public void test1() {
        System.out.println("Inside test2");
    }

    @Override
    public void test() {
        System.out.println("inside test method");
    }

    public static void testStatic() {
        /*Overriding overriding = new Overriding();
        overriding.getTest();*/
    }

}

class MainClass {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.test1();
        /*Overriding o1 = new Overriding("Bhaskar");
        Overriding o2 = new Overriding("Bhaskar");
        System.out.println(o1.getS() == o2.getS());
        Overriding o3 = new Test1();
        o3.clone();
        o3.test1();*/

        Set<String> test = new TreeSet<>((a,b) -> {return  a.compareTo(b);});
    }

}
