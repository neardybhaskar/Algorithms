package HackerRank;

/**
 * @author Bhaskar on 28-01-2021
 */
public class JumpingCloud {

    public static void main(String[] args) {
        int[] c = {1,1,1,0,1,1,0,0,0,0};
        int k = 3;
        int count = 100;
        boolean alreadyExecuted = false;
        int i = 1;
        while(i != 0) {
            if(!alreadyExecuted) {
                i = 0;
                alreadyExecuted = true;
            }

            if(c[i] == 1) {
                count-=2;
            }
            --count;
            i+=k;
            if(i > c.length - 1 ) {
                i=(i-(c.length));
            }
        }
        System.out.println(count);
    }

}
