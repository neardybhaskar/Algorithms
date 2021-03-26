package HackerRank;

/**
 * @author Bhaskar on 29-01-2021
 */
public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {
        StringBuffer stringBuffer = new StringBuffer();
        int count = 0, commonCount = 0;
        int length = s.length() < t.length() ? s.length() : t.length();

        boolean alreadyExecuted = false;

        for (int i = 0; i<length; i++) {
            if(s.charAt(i) == t.charAt(i) && !alreadyExecuted) {
                stringBuffer.append(s.charAt(i));
                ++commonCount;
            } else {
                alreadyExecuted = true;
                ++count;
            }
        }
        int sLeftCount = s.length() - commonCount;
        int tLeftCount = t.length() - commonCount;
        if(sLeftCount + tLeftCount <= k) {
            return "Yes";
        } else {
            return "No";
        }
        /*int min = k / 2;
        String subString = s.substring(0, s.length() - min);
        if(t.substring(0, t.length() - min).equals(subString)) {
            return "Yes";
        }
        return "No";*/
    }

    public static void main(String[] args) {
        String a = "ashley";
        String b = "ash";
        int c = 2;

        System.out.println(appendAndDelete(a, b, c));
    }

}
