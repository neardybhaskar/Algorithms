package Practise;

import java.io.Serializable;

/**
 * @author Bhaskar Singh
 * @date 3/29/2021 12:43 PM
 */
public class GenericsTest <T extends Serializable> {

    private int id;

    private T value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {

        GenericsTest<String> genericsTest = new GenericsTest<>();
        genericsTest.setValue("abc");
        GenericsTest<int[]> genericsTest1 = new GenericsTest<>();
        genericsTest1.setValue(new int[]{1,2});
    }
}
