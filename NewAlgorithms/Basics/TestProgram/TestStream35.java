import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TestStream35 {

    private final int id;
    private final String name;
    private final List<String> list;

    public TestStream35(int id, String name, List<String> list) {
        this.id = id;
        this.name = name;
        List<String> listCopy = new ArrayList<>(list);
        this.list = listCopy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getList() {
        List<String> listCopy = new ArrayList<>();
        Collections.copy(list, listCopy);
        return listCopy;
    }
}
