import java.util.Stack;
import java.util.*;
public class Main {
    static boolean[] visited=new boolean[1001]; //노드 방문표시
    static int[][] graph=new int[1001][1001];
    static int V;
    static int E;

    public static void dfs(int index) //index : 현재 노드
    {
        if(visited[index]==true) //방문한적 있는 노드면
        {
            return; //그냥 넘어가
        }
        else //방문한 적 없는 노드면
        {
            visited[index]=true; //방문 표시하고
            for (int i=1;i<=V;i++)
            {
                if(graph[index][i]==1) //[index][i]현재 노드에 연결된 노드들
                {
                    dfs(i);
                }
            }
        }



    }
    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);

        V = sc.nextInt();
        E = sc.nextInt();

        int a,b;
        for(int i = 0; i < E; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            // 간선 연결
            graph[a][b] = graph[b][a] = 1;
        }

        int result = 0 ;

        // dfs 탐색
        for(int i = 1; i <= V; i++) {
            if(visited[i] == false) { // 방문한 적 없는 노드라면 dfs.
                dfs(i);
                result++;
            }
        }

        System.out.println(result);

        sc.close();
        return;

    }
}
