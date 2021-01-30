/**
 * @author Bhaskar on 20-01-2021
 */
public class CapitalAfterUnderscore {

    public static void capitalAfterUnderscore(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean captial =false;
        char[] array = s.toCharArray();

        for (char c:array) {
            if(c == '_') {
                captial = true;
            } else {
                if(captial) {
                    stringBuffer.append(Character.toUpperCase(c));
                    captial = false;
                } else {
                    stringBuffer.append(c);
                }
            }
        }
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        capitalAfterUnderscore("bhaskar_singh");
    }

}
