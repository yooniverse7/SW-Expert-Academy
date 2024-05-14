import java.io.BufferedReader;
import java.io.InputStreamReader;

public class swea2814 {
    static int[][] arr;
    static boolean[] visited;
    static int N;
    static int M;
    static int result;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for (int tc = 1; tc <= T; tc++) {
            String[] str = br.readLine().split(" ");
            N = Integer.parseInt(str[0]); // 노드 개수
            M = Integer.parseInt(str[1]); // 간선 정보 개수
            result = Integer.MIN_VALUE;
            arr = new int[N+1][N+1];
        
            for(int i = 0; i < M; i++) {
                String[] info = br.readLine().split(" ");
                int num1 = Integer.parseInt(info[0]);
                int num2 = Integer.parseInt(info[1]);
                arr[num1][num2] = 1;
                arr[num2][num1] = 1;
            }
            
            for(int i = 1; i <= N; i++) {
                visited = new boolean[N+1];
                dfs(i, 1); // 현재 정점과 현재 깊이 1로 DFS 시작
            }
            
            System.out.println("#" + tc + " " + result);
        }
    }

    public static void dfs(int current, int length) {
        visited[current] = true;
        result = Math.max(result, length); // 최대 경로 길이 갱신

        for(int i = 1; i <= N; i++) {
            if(arr[current][i] == 1 && !visited[i]) {
                dfs(i, length + 1); // 다음 정점과 현재 깊이 + 1로 DFS 재귀 호출
            }
        }

        visited[current] = false; // 다른 경로 탐색을 위해 방문 해제
    }
}
