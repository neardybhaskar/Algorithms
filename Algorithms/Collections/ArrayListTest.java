package Collections;

import java.util.ArrayList;

/**
 * @author Bhaskar on 02-01-2021
 */

class ArrayTest {
    int a;

    int b;
}

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(20);
        arrayList.add("bhaskar");
        arrayList.add("dinesh");
        arrayList.add(1,"singh");
        System.out.println(arrayList.toString());

    }

}
