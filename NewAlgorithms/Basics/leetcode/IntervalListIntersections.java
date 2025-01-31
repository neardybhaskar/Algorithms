import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int firstPoint = 0, secondPoint = 0;
        int firstSize = firstList.length, secondSize = secondList.length;
        int[] temp = new int[2];
        List<int[]> list = new ArrayList<>();
        while(firstPoint<firstSize && secondPoint < secondSize) {
            if((secondList[secondPoint][1] >= firstList[firstPoint][0]) && (firstList[firstPoint][1] >= secondList[secondPoint][0])) {
                int first = Math.max(firstList[firstPoint][0],secondList[secondPoint][0]);
                int second = Math.min(firstList[firstPoint][1], secondList[secondPoint][1]);
                list.add(new int[]{first, second});
            }
            if(firstList[firstPoint][1] > secondList[secondPoint][1]){
                secondPoint++;
            } else {
                firstPoint++;
            }
        }
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] firstList = new int[][] {{0,2},{5,10},{13,23},{24,25}};
        int[][] secondList = new int[][]{{1,5},{8,12},{15,24},{25,26}};
        intervalIntersection(firstList, secondList);
    }

}
