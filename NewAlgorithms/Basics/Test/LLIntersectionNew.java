import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;


/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class LLIntersectionNew {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        StringBufferInputStream s = new StringBufferInputStream("a->b\n+" +
                "r->s\n"+
                "b->c\n"+
                "x->c\n"+
                "q->r\n"+
                "y->x\n"+
                "w->z\n"+
                "a,q,w\n"+
                "a,c,r\n"+
                "y,z,a,s\n"+
                "a,w\n");

        System.setIn(s);
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        Map<String, String> graph = new HashMap<>();
        List<List<String>> startingSets = new ArrayList<>();
        String line;
        boolean readingEdges = true;
        while ((line = in.readLine()) != null && !line.isEmpty()) {
            if(!line.contains("->")) {
                readingEdges = false;
            }
            if(readingEdges) {
                String[] parts = line.split("->");
                graph.put(parts[0], parts[1]);
            } else {
                List<String> starters = Arrays.asList(line.split(","));
                startingSets.add(starters);
            }
        }
        for(List<String> starts: startingSets) {
            Set<String> visited = new HashSet<>();
            boolean cycleDetected = false;
            boolean intersectionDetected = false;
            Map<String, String> visitedBy = new HashMap<>();
            for(String start: starts) {
                String curr = start;
                Set<String> localVisited = new HashSet<>();
                while(curr != null) {
                    if(localVisited.contains(curr)) {
                        cycleDetected = true;
                        break;
                    }
                    if(!visitedBy.containsKey(curr)) {
                        visitedBy.put(curr, start);
                    } else if(!visitedBy.get(curr).equals(start)) {
                        intersectionDetected = true;
                        break;
                    }
                    localVisited.add(curr);
                    visited.add(curr);
                    //visitedBy.put(curr, start);
                    curr = graph.get(curr);
                }
                if(cycleDetected || intersectionDetected) {
                    break;
                }
                if(cycleDetected) {
                    System.out.println("CYCLE");
                } else if(intersectionDetected) {
                    System.out.println("INTERSECTION");
                } else {
                    System.out.println("OK");
                }
            }
        }
    }
}
