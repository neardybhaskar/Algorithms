import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/*import java.util.Arrays;
import java.util.List;

public class Main{

    public static void main(String args[]){
        int remainder = -1;
        List<Integer> myList =
                Arrays.asList(1,8,2123, 789, 321, 614, 987,81);

        for(Integer listValue: myList) {
            if(listValue<11) {
                continue;
            }
            System.out.println(listValue>);
        }
    }

}*//*


import java.rmi.server.Operation;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        String str = "I am here for the interview";
        String[] s = str.split(" ");
        Map<Integer, String> map = new HashMap<>();
        //Stream.of(s).map(string -> map.put(string.length(), string)).collect(Collectors.toMap()).sorted((o1, o2) -> o2 - o1).stream().count();
        System.out.println(Stream.of(s).sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList()));
        System.out.println(Stream.of(s).map(string -> new Operation(string)).max(Comparator.comparingInt(Operation::g))
    }

}
*/
class Main {

    public static void main(String[] args) {
        Instant now = Instant.now();
        int number = 20;
        Random readingRandomiser = new Random();
        for (int i = 0; i < number; i++) {
            double positiveRandomValue = Math.abs(readingRandomiser.nextGaussian());
            BigDecimal randomReading = BigDecimal.valueOf(positiveRandomValue).setScale(4, RoundingMode.CEILING);
            System.out.println();
            //ElectricityReading electricityReading = new ElectricityReading(now.minusSeconds(i * 10L), randomReading);
            //readings.add(electricityReading);
        }

        //readings.sort(Comparator.comparing(ElectricityReading::time));
    }
}