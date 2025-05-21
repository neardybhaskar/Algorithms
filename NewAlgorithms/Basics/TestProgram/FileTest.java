import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest  {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/bhaskar/Documents/Side project/Intellij_Workspace/Code_Practise/Algorithms/NewAlgorithms/Basics/TestProgram/test.csv";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bf = new BufferedReader(fileReader);
        String eachLine = null;
        while((eachLine = bf.readLine()) != null) {
            System.out.println(eachLine);
        }
    }

}