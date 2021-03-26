package HackerRank;

/**
 * @author Bhaskar on 02-02-2021
 */
public class RepeatedString {

    public static void main(String[] args) {

        String s = "aba";
        int n = 10;
        /*long stringRepeated = s.chars().filter(ch -> ch == s.charAt(0)).count();
        if(n % 2 != 0) {

        }
        System.out.println((n % s.length())+(n * stringRepeated));*/

        long size = s.length(), repeated = n/size;
        long left = n - (size * repeated);
        int extra = 0;

        int count = 0;
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == 'a'){
                ++count;
            }
        }

        for(int i = 0; i < left; i++){
            if(s.charAt(i) == 'a'){
                ++extra;
            }
        }

        repeated = (repeated * count) + extra;

        System.out.println(repeated);

    }

}
