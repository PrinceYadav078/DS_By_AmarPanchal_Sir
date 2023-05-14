package Graph;
import java.util.Scanner;
public class graph_ex {
    int v,visited[],g[][];
    
    void createGraph(int Nodes){
        v=Nodes;
        Scanner scn=new Scanner(System.in);
        g=new int[v][v];
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
            visited[i]=0;
        }
    }
    
    public static void main(String[]args){
        graph_ex gobj=new graph_ex();
        gobj.createGraph(5);
        gobj.printGraph();
    }
}
