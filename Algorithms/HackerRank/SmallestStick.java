package HackerRank;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Bhaskar on 01-02-2021
 */
public class SmallestStick {

    public static int[] removeArray(int index, int[] mArray) {
        int[] tempArr = new int[mArray.length - 1];
        for(int i=0,k=0; i<mArray.length; i++) {
            if(i == index)
                continue;
            tempArr[k++] = mArray[i];
        }
        return tempArr;
    }

    public static void main(String[] args) {

        int[] arr = {6,3,3,1,6,4,4};
        int[] modifiedArray = arr;
        int[] tempModifiedArray = arr;
        int[] removeArrayIndex = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                System.out.println(arr.length - i);
            }
        }

        SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i],arr[i]);
        }
        Map.Entry<Integer,Integer> entry = map.entrySet().iterator().next();
        int mapFirstValue = entry.getKey();
        map.values();
        int[] stickModificationCount = new int[map.size() + 1];
        for (int i = 0 ; i < map.size() + 1; i++) {
            int count = 0;
            int temp = modifiedArray.length;
            for(int j = 0,k=0; j < tempModifiedArray.length; j++) {
                if(modifiedArray[j] == map.entrySet().iterator().next().getKey()) {
                    removeArrayIndex[k] = j;
                    tempModifiedArray = removeArray(j, modifiedArray);
                    ++k;
                } else {
                    /*tempModifiedArray[j] = tempModifiedArray[j] - map.entrySet().iterator().next().getKey();*/
                    ++count;
                }
            }
            stickModificationCount[i] = count;
            map.remove(map.entrySet().iterator().next().getKey());
//            System.out.println(count);
            /*for(int l = 0; l<removeArrayIndex.length; l++) {
                modifiedArray = removeArray(removeArrayIndex[l],modifiedArray);
            }*/
            modifiedArray = tempModifiedArray;
        }
        /*for(int k = 0; k < stickModificationCount.length; k++) {
            System.out.println(stickModificationCount[k]);
        }*/
        /*int[] arr = {5,4,4,2,2,8};*/
        /*int[] arr = {1,2,3,4,3,3,2,1};
        Arrays.sort(arr);
        Map<Number, Number> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], arr[i]);
        }
        while(map.size() != 0) {
            for (Map.Entry<Number, Number> m: map.entrySet()) {

                *//*map.put(m.getKey() - map.values().toArray()[0], m.getValue().intValue() - map.values().toArray()[0]);*//*
            }
        }*/

        /*for(int i=1; i<arr.length;i++) {
            if(arr[i] != arr[i - 1] ) {
                System.out.println(arr.length - 1);
            }
        }*/

        /*List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        List<Integer> newlist = list.stream().distinct().collect(Collectors.toList());
        int count = 0;
        int j = 0;
        int[] arr2 = new int[newlist.size()];
        while (count != newlist.size()) {
            int value = 0;
            for(int i = 0; i<list.size(); i++) {
                if(list.get(i) != 0) {
                    if(list.get(i) - newlist.get(0) < 0) {
                        list.set(i, 0);
                        ++value;
                    } else {
                        list.set(i, list.get(i) - newlist.get(0));
                        ++value;
                    }
                }
                arr2[j] = value;
            }
            ++count;
            ++j;
        }*/

    }

}
