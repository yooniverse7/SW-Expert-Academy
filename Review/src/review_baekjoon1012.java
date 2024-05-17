import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class review_baekjoon1012 {
	static int[][] map; // 배추밭
	static int M, N, K; // 가로, 세로, 배추 개수
	static boolean[][] visited;
	static int cnt;
	static int[] dx = {-1, 1, 0, 0}; // 상하
	static int[] dy = {0, 0, -1, 1}; // 좌우

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			String[] str = br.readLine().split(" ");
			M = Integer.parseInt(str[0]); 
			N = Integer.parseInt(str[1]);
			K = Integer.parseInt(str[2]);
			map = new int[M][N];
			visited = new boolean[M][N];
			cnt = 0;
			
			for(int i = 0; i<K; i++) { // K번 만큼 배추 채우기
				String[] elements = br.readLine().split(" ");
				int x = Integer.parseInt(elements[0]);
				int y = Integer.parseInt(elements[1]);
				map[x][y] = 1;
				
			}
			
			for(int i = 0; i<M; i++) {
				for(int j = 0; j<N; j++) {
					if(map[i][j] == 1 && !visited[i][j]) { // 배추가 있으면서 방문하지 않았다면,
						visited[i][j] = true; // 방문으로 바꾸기
						bfs(i,j);
					}
				}
			}
			System.out.println(cnt);
		}

	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>(); // 큐 만들기
		q.add(new int[] {x, y}); // 큐에 좌표 넣기
		while (!q.isEmpty()) { // 큐가 빌 때까지 진행
			int now[] = q.poll(); // 값 빼주기
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i = 0; i<4; i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextX <0 || nextX >=M || nextY <0 || nextY >= N) { // 범위를 넘어간다면,
					continue; // 다음 for문 돌림
				}
				if(map[nextX][nextY] == 1 && visited[nextX][nextY] == false) { // 배추가 있고 방문한 적 없다면,
					q.add(new int[] {nextX, nextY}); // 큐에 넣기
					visited[nextX][nextY] = true;
				}
			}
		}
		cnt++;
	}

}
