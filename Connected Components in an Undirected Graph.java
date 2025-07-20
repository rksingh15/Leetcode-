
class Solution {
         private void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> component) {
        visited[node] = true;
        component.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, component);
            }
        }
    }
    
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i =0 ;i< V;i++)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int edge[] : edges)
        {
            int u= edge[0];
            int v= edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
         ArrayList<ArrayList<Integer>> All = new ArrayList<>();
         
         boolean[] vis = new boolean[V];
         
         for(int i =0 ; i<V; i++)
         {
              ArrayList<Integer> aa =  new ArrayList<>(); 
             if(!vis[i])
             {
                 dfs(i,adj,vis,aa);
                 
                 All.add(aa);
             }
         }
         return All;
        
    }
}
