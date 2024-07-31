package test_240730;

import java.util.*;

public class DijkstraExample 
{
	static class Edge
	{
		int dest;
		int weight;
		
		public Edge(int dest, int weight) {
			super();
			this.dest = dest;
			this.weight = weight;
		}
	}
	
	static class Node
	{
		int vertex;
		int distance;
		
		public Node(int vertex, int distance) {
			super();
			this.vertex = vertex;
			this.distance = distance;
		}
	}
	
	public static int[] dijkstra(int[][] graph, int start)
	{
		int vNum = graph.length;
		int[] dist = new int[vNum];
		boolean[] visited = new boolean[vNum];
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>(Comparator.comparingInt(n -> n.distance));
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		
		pq.add(new Node(start, 0));
		
		while(!pq.isEmpty())
		{
			Node curr = pq.poll();
			int u = curr.vertex;
			
			if(visited[u])
				continue;
			
			visited[u] = true;
			
			for(int i = 0; i < vNum; i++)
			{
				if(graph[u][i] != 0 && !visited[i])
				{
					int newDist = dist[u] + graph[u][i];
					
					if(newDist < dist[i])
					{
						dist[i] = newDist;
						pq.add(new Node(i, newDist));
					}
				}
			}
		}
		
		return dist;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] graph = {
                {0, 7, 9, 0, 0, 14},
                {7, 0, 10, 15, 0, 0},
                {9, 10, 0, 11, 0, 2},
                {0, 15, 11, 0, 6, 0},
                {0, 0, 0, 6, 0, 9},
                {14, 0, 2, 0, 9, 0}
            };

            int startVertex = 0;
            int[] distances = dijkstra(graph, startVertex);

            System.out.println("Shortest distances from vertex " + startVertex + ":");
            for (int i = 0; i < distances.length; i++) {
                System.out.println("To vertex " + i + " : " + (distances[i] == Integer.MAX_VALUE ? "INF" : distances[i]));
            }
	}

}
