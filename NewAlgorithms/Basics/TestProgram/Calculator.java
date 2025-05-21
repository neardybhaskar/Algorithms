import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public interface Calculator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        List<String> newlist = new ArrayList<>();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("a");
        copyOnWriteArrayList.add("b");
        copyOnWriteArrayList.add("c");
        copyOnWriteArrayList.add("d");
        newlist.add("a");
        newlist.add("b");
        newlist.add("c");
        newlist.add("d");
        copyOnWriteArrayList.parallelStream().forEach( e -> {
            boolean a = copyOnWriteArrayList.remove("a");
        });
    }


}
