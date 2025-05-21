public class StreamTest26 {

    public static void main(String[] args) {
        String str="BhaSkar SinGh";

        /*str.chars().mapToObj(e ->
            if(Character.isLowerCase(e)) {
                return e;
        }
        return e;)*/
        str.chars().filter( e -> Character.isLowerCase(e)).mapToObj(element -> (char)element).forEach(System.out::print);

            //.collect(StringBuilder::new, StringBuilder::append);
    }

}
