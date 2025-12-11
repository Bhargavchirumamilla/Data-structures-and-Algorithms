package collections;
import java.util.*;


public class Banana {
	
	

	    static class Node {
	        Map<Character, Edge> children = new HashMap<>();
	    }

	    static class Edge {
	        int start, end;     // substring s[start..end]
	        Node next;

	        Edge(int s, int e) {
	            this.start = s;
	            this.end = e;
	            this.next = new Node();
	        }
	    }

	    public static List<Map<String, Integer>> buildSuffixTree(String s) {
	        s += "$";  // unique terminator to ensure proper suffix separation
	        Node root = new Node();

	        // Insert each suffix
	        for (int i = 0; i < s.length(); i++) {
	            insertSuffix(root, s, i);
	        }

	        // Collect compressed edges (start,end)
	        List<Map<String, Integer>> result = new ArrayList<>();
	        collectEdges(root, result);
	        return result;
	    }

	    private static void insertSuffix(Node root, String s, int startIndex) {
	        Node current = root;
	        int i = startIndex;

	        while (i < s.length()) {
	            char c = s.charAt(i);

	            if (!current.children.containsKey(c)) {
	                // no edge → create new edge
	                current.children.put(c, new Edge(i, s.length() - 1));
	                return;
	            }

	            Edge edge = current.children.get(c);
	            int k = edge.start;

	            // walk along edge characters
	            while (k <= edge.end && i < s.length() && s.charAt(k) == s.charAt(i)) {
	                k++;
	                i++;
	            }

	            if (k > edge.end) {
	                // fully matched edge → continue on next node
	                current = edge.next;
	            } else {
	                // split edge
	                Edge newEdge = new Edge(edge.start, k - 1);
	                newEdge.next.children.put(s.charAt(k), new Edge(k, edge.end));
	                newEdge.next.children.get(s.charAt(k)).next = edge.next;

	                edge.start = i;
	                newEdge.next.children.put(s.charAt(i), edge);

	                current.children.put(c, newEdge);
	                return;
	            }
	        }
	    }

	    private static void collectEdges(Node node, List<Map<String, Integer>> result) {
	        for (Edge e : node.children.values()) {
	            Map<String, Integer> map = new HashMap<>();
	            map.put("start", e.start);
	            map.put("end", e.end);
	            result.add(map);
	            collectEdges(e.next, result);
	        }
	    }

	    // Demo
	    public static void main(String[] args) {
	        String input = "banana";
	        List<Map<String, Integer>> edges = buildSuffixTree(input);
	        System.out.println(edges);
	    }
	}



