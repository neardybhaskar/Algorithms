import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest22 {

    public static void main(String[] args) {
        String str = "WoRlD";
        //Op: "wOrLd";
        System.out.println(str.chars().mapToObj(e -> {
            if (Character.isUpperCase(e)) {
                return Character.toLowerCase((char)e);
            } else {
                return Character.toUpperCase((char)e);
            }
        }).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString());
    }

}
