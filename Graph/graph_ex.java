package Graph;
import java.util.Scanner;
public class graph_ex {
    int v,visited[],g[][];
    
    void createGraph(int Nodes){
        v=Nodes;
        Scanner scn=new Scanner(System.in);
        g=new int[v][v];  // graph array
        visited=new int[v];  //visited array
        for(int i=0;i<v;i++){
            for(int j=0; j<v;j++){
                System.out.println("Enetr value for v"+i+" to v"+j+ "(999 for infinity)");
                g[i][j]=scn.nextInt();
            }
        }
    }
    void printGraph(){
        for(int i=0;i<v;i++){
            for(int j=0; j<v;j++){
                System.out.print(g[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void resetvisited(){
        for(int i=0;i<v;i++){
            visited[i]=0;    //unvisited=0 and visited=1
        }
    }

    void DFS(int source){
        visited[source]=1;
        System.out.print("V"+source+"=>");
        for(int i=0;i<v;i++){
            if(g[source][i]==1&&visited[i]!=1){
                //neighbour  and unvisited
                DFS(i);
            }
        }
    }
    
    public static void main(String[]args){
        graph_ex gobj=new graph_ex();
        gobj.createGraph(6);
        gobj.printGraph();
        gobj.resetvisited();
        System.out.println("DFS=>");
        gobj.DFS(0);
    }
}
