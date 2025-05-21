import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Coforge L1
 */

public class StreamTest8 {

    public static void main(String[] args) throws IOException {

        String str= "I am going to london";
        String op = "london";
        int c;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = new FileReader("Basics/input.txt");
        while((c = fileReader.read()) != -1) {
            sb.append((char)c);
        }
        fileReader.close();
        String[] strArray = sb.toString().split(" ");
        StringBuilder reverse = new StringBuilder();
        for(int i=strArray.length-1;i>=0; i--) {
            reverse.append(strArray[i]+" ");
        }
        String reverseString = reverse.toString();
        FileWriter fileWriter = new FileWriter("Basics/reverseTest.txt");
        for(int i=0; i<reverseString.length(); i++) {
            fileWriter.write(reverseString.charAt(i));
        }
        fileWriter.close();
    }

}
