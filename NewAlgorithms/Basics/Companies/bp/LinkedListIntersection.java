package bp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class LinkedListIntersection {

    static Map<String, String> graph = new HashMap<>(); // Stores SLL mappings
    static Set<String> allNodes = new HashSet<>(); // Tracks all visited nodes

    public static void main(String[] args) throws IOException {
        /*StringBufferInputStream s = new StringBufferInputStream("a->b\n" +
                "b->c\n" +
                "f->g\n" +
                "x->y\n" +
                "c->d\n" +
                "r->s\n" +
                "z->s\n" +
                "y->z\n" +
                "d->a\n" +
                "t->u\n" +
                "s->t\n" +
                "e->f\n" +
                "a,b\n" +
                "x,e\n" +
                "t,f\n" +
                "e,y,r");*/
        StringBufferInputStream s = new StringBufferInputStream("a->b\n"+
                "b->c\n"+
                "x->y\n"+
                "y->z\n"+
                "a,x\n"+
                "a,b\n"
        );

        System.setIn(s);
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(reader);
        String line;
        boolean readingGraph = true;
        List<String[]> startSets = new ArrayList<>();

        // Read input and construct graph
        while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
            if (line.contains(",")) {  // Identifies starting nodes input
                readingGraph = false;
                startSets.add(line.split(","));
            } else if (readingGraph) {
                String[] parts = line.split("->");
                graph.put(parts[0], parts[1]); // Store directed edge
                allNodes.add(parts[0]);
                allNodes.add(parts[1]);
            }
        }

        // Detect cycles first
        Set<String> cycleNodes = new HashSet<>();
        for (String node : allNodes) {
            if (detectCycle(node)) {
                cycleNodes.add(node);
            }
        }

        // Process each set of starting nodes
        for (String[] startNodes : startSets) {
            boolean hasCycle = false;
            boolean hasIntersection = false;
            Set<String> visited = new HashSet<>();

            for (String start : startNodes) {
                if (cycleNodes.contains(start)) {
                    hasCycle = true;
                    break; // Stop processing this set if a cycle is found
                }

                // Check for intersection
                String node = start;
                while (node != null && graph.containsKey(node)) {
                    if (visited.contains(node)) {
                        hasIntersection = true;
                        break; // Stop processing if intersection is found
                    }
                    visited.add(node);
                    node = graph.get(node);
                }

                if (hasIntersection) break;
            }

            // Print appropriate result
            if (hasCycle) {
                System.out.println("CYCLE");
            } else if (hasIntersection) {
                System.out.println("INTERSECTION");
            } else {
                System.out.println("OK");
            }
        }
    }

    // Floyd's Cycle Detection Algorithm
    private static boolean detectCycle(String start) {
        String slow = start, fast = start;
        while (fast != null && graph.containsKey(fast)) {
            slow = graph.get(slow); // Move one step
            fast = graph.get(fast);
            if (fast != null && graph.containsKey(fast)) {
                fast = graph.get(fast); // Move another step
            }
            if (slow != null && slow.equals(fast)) return true;
        }
        return false;
    }

}
