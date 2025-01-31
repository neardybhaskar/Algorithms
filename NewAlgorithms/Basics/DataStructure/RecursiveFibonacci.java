public class RecursiveFibonacci {

    public static int j=0,k=1,l;

    public static void fibo(int count) {
        int n=count;
        if(n==0)
            return;
        //System.out.println(j);
        /*System.out.println(k);
        for(int i=0; i<count; i++) {
            l=j+k;
            j=k;
            k=l;
            System.out.println(l);
        }*/
        l=j+k;
        j=k;
        k=l;
        System.out.println(l);
        fibo(n-1);
    }

    public static void main(String[] args) {
        System.out.println(j);
        System.out.println(k);
        fibo(5);
    }

}
