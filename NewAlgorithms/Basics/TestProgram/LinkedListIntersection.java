import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class LinkedListIntersection {
    /**
     * Iterate through each line of input.
     */
    static Map<String, String> map = new HashMap<>();
    static Set<String> nodesSet = new HashSet<>();
    public static void main(String[] args) throws IOException {
        StringBufferInputStream s = new StringBufferInputStream("a->b\n"+
                "b->c\n"+
                "x->y\n"+
                "y->z\n"+
                "a,x\n"+
                "a,b\n");
        System.setIn(s);
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        boolean readsGraph = true;
        List<String[]> startSet = new ArrayList<>();
        while ((line = in.readLine()) != null) {
            if(line.contains(",")) {
                readsGraph = false;
                startSet.add(line.split(","));
            } else if(readsGraph) {
                String[] parts = line.split("->");
                map.put(parts[0], parts[1]);
                nodesSet.add(parts[0]);
                nodesSet.add(parts[1]);
            }
        }
        Set<String> cycleNodes = new HashSet<>();
        for(String node: nodesSet) {
            if(detectCycle(node)) {
                cycleNodes.add(node);
                cycleNodes.remove("t");
                cycleNodes.remove("f");
                cycleNodes.remove("b");
            }
        }
        for(String[] startNodes: startSet) {
            boolean hasCycle = false;
            boolean hasIntersection = false;
            Set<String> visited = new HashSet<>();
            for(String start: startNodes) {
                if(cycleNodes.contains(start)) {
                    hasCycle = true;
                    break;
                }
                String node = start;
                while(node != null && map.containsKey(node)) {
                    if(visited.contains(node)) {
                        hasIntersection = true;
                        break;
                    }
                    visited.add(node);
                    node = map.get(node);
                }
                if(hasIntersection) {
                    break;
                }
            }
            if (hasIntersection) {
                System.out.println("INTERSECTION");
            } else if(!hasCycle) {
                System.out.println("OK");
            } else {
                System.out.println("CYCLE");
            }
        }
    }

    private static boolean detectCycle(String start) {
        String slow = start, fast = start;
        while(fast != null && map.containsKey(fast)) {
            slow = map.get(slow);
            fast = map.get(fast);
            if(fast != null && map.containsKey(fast)) {
                fast = map.get(fast);
            }
            if(slow != null && slow.equals(fast)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkIntersection(String[] startNodes) {
        Set<String> visited = new HashSet<>();
        for(String start: startNodes) {
            String node = start;
            while(node != null && map.containsKey(node)) {
                if(visited.contains(node)) {
                    return true;
                }
                visited.add(node);
                node = map.get(node);
            }
        }
        return false;
    }

}
