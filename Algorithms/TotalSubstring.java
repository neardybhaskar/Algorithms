/**
 * @author Bhaskar on 20-01-2021
 */
public class TotalSubstring {

    public static void substringCreated(String string) {

        for(int i = 0; i<string.length(); i++) {
            for(int j = i + 1; j<=string.length(); j++ ) {
                System.out.println(string.substring(i,j));
            }
        }

    }

    public static void main(String[] args) {
        substringCreated("abcd");
    }

}
