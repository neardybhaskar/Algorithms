package HackerRank;

import java.util.*;

/**
 * @author Bhaskar on 26-01-2021
 */
public class ClimbingLeaderboard {

    public static Map<Integer, Integer> arrageAsPerRank(List<Integer> arr) {
        int count = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int a:arr) {
            if(map.containsKey(a)) {

            } else {
                map.put(a,++count);
            }
        }
        return map;
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static List<Integer> getRank(List<Integer> arr, Map<Integer, Integer> ranks) {
        Map<Integer, Integer> newRanks = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> rank: ranks.entrySet()) {
            for (int i = arr.size() - 1; i >= 0; i--) {
                int count = 1;
                if(arr.get(i) < rank.getKey()) {
                    if(newRanks.containsKey(arr.get(i))) {
                        count = newRanks.get(arr.get(i));
                        newRanks.put(arr.get(i), ++count);
                    } else {
                        newRanks.put(arr.get(i), ++count);
                    }
                    count++;
                } else {
                    if(arr.get(i) >= getKeyByValue(ranks,count)) {
                        newRanks.put(arr.get(i), count);
                    }

                }
            }
        }
        List<Integer> finalRanks = new ArrayList<>(newRanks.values());
        Collections.reverse(finalRanks);

        return finalRanks;
    }

    public static void main(String[] args) {
        List<Integer> intArr = new ArrayList<>();
        intArr.add(110);
        intArr.add(90);
        intArr.add(90);
        intArr.add(60);
        intArr.add(50);
        intArr.add(20);

        List<Integer> findRankArr = new ArrayList<>();
        findRankArr.add(10);
        findRankArr.add(15);
        findRankArr.add(40);
        findRankArr.add(100);
        findRankArr.add(120);
        findRankArr.add(150);
        Map<Integer, Integer> map = arrageAsPerRank(intArr);
        System.out.println(getRank(findRankArr, map));
    }

}
