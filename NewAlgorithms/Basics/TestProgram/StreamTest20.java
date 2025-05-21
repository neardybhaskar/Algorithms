public class StreamTest20 {

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,7,4,9};
        int n = arr.length;
        boolean swapped;
        for(int i=0; i<n;i++) {
            swapped=false;
            for(int j=0; j<n -1 -i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

}
