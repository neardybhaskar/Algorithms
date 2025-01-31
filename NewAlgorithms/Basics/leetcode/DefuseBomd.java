public class DefuseBomd {

    public static int[] decrypt(int[] code, int k) {
        int[] decryptArray = new int[code.length];
        if(k == 0) {
            return decryptArray;
        }
        int n = code.length;
        int[] circularArray = new int[(2 * code.length)];
        for (int i = 0; i < code.length; i++)  {
            circularArray[i] = circularArray[n + i] = code[i];
        }

        if(k > 0) {
            for (int i = 0; i < n; i++) {
                int temp = 0;
                int count = i+1;
                int sum = 0;
                while(temp < k) {
                    System.out.println(k+" "+count+" "+circularArray[count]);
                    sum = sum + circularArray[count];
                    count++;
                    temp++;
                }
                decryptArray[i] = sum;
            }
        } else {
            int var = 0;
            for(int i=n; i<circularArray.length; i++) {
                int temp = 0;
                int count = i-1;
                int sum = 0;
                while(temp < Math.abs(k)) {
                    System.out.println(k+" "+count+" "+circularArray[count]);
                    sum = sum + circularArray[count];
                    temp++;
                    count--;
                }
                decryptArray[var] = sum;
                var++;
            }
        }

        return decryptArray;
    }

    public static void main(String[] args) {
        int[] code = new int[] {2,4,9,3};
        decrypt(code, -2);
    }

}
