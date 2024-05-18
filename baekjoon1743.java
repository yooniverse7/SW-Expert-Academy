import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class baekjoon1743 {

	static int N,M;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]); // 세로길이
		M = Integer.parseInt(str[1]); // 가로길이
		int K = Integer.parseInt(str[2]); // 음식물 개수
		arr = new int[N][M];
		visited = new boolean[N][M];
			
		for(int i = 0; i<K; i++) {
			String[] elements = br.readLine().split(" ");
			
			int num1 = Integer.parseInt(elements[0])-1;
			int num2 = Integer.parseInt(elements[1])-1;
			arr[num1][num2] = 1;
			
		}
		
		
		int max = 0;
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				if(arr[i][j] == 1 && !visited[i][j]) {
					visited[i][j] = true;
					max = Math.max(max, bfs(i, j));
				}
			}
		}
		
		System.out.print(max);
	}
	
	public static int bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});
		int cnt= 1;
		while (!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			for(int i = 0; i<4; i++) {
				int nextX =nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY]) {
					continue;
				}
				if(arr[nextX][nextY] != 1) {
					continue;
				}
				if(arr[nextX][nextY] == 1 && !visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					q.add(new int[] {nextX, nextY});
					cnt++;
				}
			}
			
		}
		return cnt;
		
	}

}
