/**
 * @author Bhaskar on 19-01-2021
 */
public class MajorityElement {

    public static int findMajorityElement(int a[]){
        int max = a[0];
        for(int i=0; i<a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {10, 8, 12, 16, 4, 7};
        System.out.println(findMajorityElement(a));
    }

}
