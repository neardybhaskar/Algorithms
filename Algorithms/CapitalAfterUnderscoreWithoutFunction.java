/**
 * @author Bhaskar on 20-01-2021
 */
public class CapitalAfterUnderscoreWithoutFunction {

    public static void capitalAfterUnserscore(String s) {

        char[] array = new char[s.length() + 1];
        boolean capitalise = false;

        for(int i=0; i<s.length(); i++) {
            array[i] = s.charAt(i);
        }

        char[] capitalisedArray = new char[s.length() + 1];
        int j = 0;

        for(int i=0;i<array.length;i++) {
            if(array[i] == '_') {
                capitalise = true;
            } else {
                if(capitalise) {
                    int asciiValue = (int)array[i];
                    asciiValue-=32;
                    capitalisedArray[j] = (char)asciiValue;
                    capitalise = false;
                } else {
                    capitalisedArray[j] = array[i];
                }
                j++;
            }
        }

        System.out.println(capitalisedArray);

    }

    public static void main(String[] args) {

        capitalAfterUnserscore("my_name_is_anthony_gonsalves");

    }

}
