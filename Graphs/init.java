package Graphs;

import java.util.*;

public class init {
    int n=7;
    public static void main(String[] args) {
        int adj[][]={
            {0,0,0,0,0,0,0,0},
            {0,0,1,1,1,0,0,0},
            {0,1,0,1,0,0,0,0},
            {0,1,1,0,1,1,0,0},
            {0,1,0,1,0,1,0,0},
            {0,0,0,1,1,0,1,1},
            {0,0,0,0,0,1,0,0},
            {0,0,0,0,0,1,0,0}
        };
        
        init obj=new init();
        obj.BFS(1, adj);
        System.out.println();
        System.out.print("DFS : ");
        obj.DFS(1, adj,new int[8]);
    }

     void BFS(int i,int adj[][])
    {
        int visited[]=new int[8];
        System.out.print("BFS : ");
        System.out.print(i+" ");
        visited[i]=1;
        Queue<Integer> q= new LinkedList<>();
        //.add() --> enqueue
        //.remove() --> dequeue
        //.peek() --> head of the queue
        //.size() --> current size of the queue
        q.add(i);
        while(!q.isEmpty())
        {
           int u=q.remove();
            for(int v=1;v<=n;v++)
            {
                if(adj[u][v]==1 && visited[v]==0)
                {
                    visited[v]=1;
                    System.out.print(v+" ");
                    q.add(v);
                }
            }
        }
    }
    void DFS(int u,int adj[][],int visited[])
    {
        if(visited[u]==0)
        {
            System.out.print(u+" ");
            visited[u]=1;
            for(int v=1;v<=n;v++)
            {
                if(adj[u][v]==1 && visited[v]==0)
                    DFS(v, adj,visited);
            }
        }
    }
}
 