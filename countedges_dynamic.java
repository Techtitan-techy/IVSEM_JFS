import java.util.ArrayList;
import java.util.List;

public class countedges_dynamic {
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // undirected edges
        adj.get(0).add(1);
		adj.get(0).add(2);
		adj.get(0).add(4);
        adj.get(1).add(3);
        adj.get(2).add(4);
		adj.get(2).add(3);
    }
}
