package Practise;

/**
 * @author Bhaskar Singh
 * @date 5/7/2021 7:02 PM
 */
public class InvokeVirtualTestP {


    public void callCheck() {
        System.out.println("Parent callCheck getting called");
    }

    public void changeCaller() {
        System.out.println("Inside parent changeCaller");
        callCheck();
    }

}

class InvokeVirtualTestC extends InvokeVirtualTestP {

    public void callCheck() {
        System.out.println("Child callCheck getting called");
        super.callCheck();
    }
}

class InvokeVirtualTestMain {

    public static void main(String[] args) {
//        InvokeVirtualTestP i = new InvokeVirtualTestP();
        InvokeVirtualTestP i = new InvokeVirtualTestC();
        i.changeCaller();
    }

}
