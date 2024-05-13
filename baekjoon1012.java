import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon1012 {

	static int M, N, K;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int cnt;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			String[] str = br.readLine().split(" ");
			M = Integer.parseInt(str[0]); // x축 길이
			N = Integer.parseInt(str[1]); // y축 길이
			K = Integer.parseInt(str[2]); // 배추 개수
			arr = new int[M][N];
			visited = new boolean[M][N];
	
			
			for(int i = 0; i<M; i++) { // 배열 다 0으로 채우기
				for(int j = 0; j<N; j++) {
					arr[i][j] = 0;
				}
			}
			
			for(int i = 0; i<K; i++) { // 배추 위치에 1로 바꾸기
				String[] elements = br.readLine().split(" ");
				int x = Integer.parseInt(elements[0]);
				int y = Integer.parseInt(elements[1]);
				
				arr[x][y] = 1;
				
			}
			cnt = 0;
			
			for(int i = 0; i<M; i++) { // 배열 다 0으로 채우기
				for(int j = 0; j<N; j++) {
					if(arr[i][j] == 1 && visited[i][j] == false) {
						visited[i][j] = true;
						bfs(i, j);
					}
				}
			}
			
			System.out.println(cnt);
			
		}
	}
	
	public static void bfs(int x, int y) {
			Queue<int[]> q = new LinkedList<>();
			q.add(new int[] {x, y});
			while (!q.isEmpty()) {
				int now[] = q.poll();
				int nowX = now[0];
				int nowY = now[1];
				
				for(int i = 0; i<4; i++) {
		            int nextX = nowX + dx[i]; // 현재 좌표에서 하상 계산 { 1, -1, 0, 0 }
		            int nextY = nowY + dy[i]; // 현제 좌표에서 좌우 계산 { 0, 0, -1, 1 }
		            
		            if(nextX >= M || nextX < 0 || nextY >= N || nextY < 0) {
		            	continue;
		            }
		            
		            if(arr[nextX][nextY] == 1 && visited[nextX][nextY] == false) { // 길이 있다면, 큐에 추가
		            	q.add(new int[] {nextX, nextY});
		            	visited[nextX][nextY] = true;
		            }
				}
			}
			cnt++;
	}

}
