package IOStream;

import java.io.*;

/**
 * @author Bhaskar on 01-01-2021
 */

class Test implements Serializable {
    String a;
    String b;

    public Test() {
    }

    public Test(String a, String b) {
        this.a = a;
        this.b = b;
    }
}

public class IOStreamTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        /*InputStream inputStream = new FileInputStream("e:\\learning\\Java_core.txt");
        int data = inputStream.read();
        while (inputStream.read() != -1) {
            System.out.println(inputStream.read());
        }*/

        OutputStream outputStream = new FileOutputStream("e:\\test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        Test test = new Test("a","b");
        objectOutputStream.writeObject(test);

        FileInputStream fileInputStream = new FileInputStream("e:\\test.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Test test1 = (Test)objectInputStream.readObject();
        System.out.println(test1);

    }

}
