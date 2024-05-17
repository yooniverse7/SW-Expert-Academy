import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class review_baekjoon2178 {
	static int N, M;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]); 
		M = Integer.parseInt(str[1]);
		
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0; i<N; i++) { // 미로 채우기
			String[] elements = br.readLine().split("");
			for(int j = 0; j<M; j++) {
				map[i][j] = Integer.parseInt(elements[j]);
			}
		}
		visited[0][0] = true; // 0,0번째부터 시작이니 방문했다고 바꿔줌
		bfs(0, 0);
		
		System.out.print(map[N-1][M-1]);
		
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>(); // 큐 생성
		q.add(new int[] {x, y}); // 큐에 담아줌
		while (!q.isEmpty()) { // 큐가 빌 때 까지
			int now[] = q.poll(); // 큐에서 하나를 빼서 저장
			int nowX = now[0];
			int nowY = now[1];
			for(int i = 0; i<4; i++) {
				int nextX = nowX + dx[i]; // 방향 바꿔줌
				int nextY = nowY + dy[i];
				
				if(nextX<0 || nextX>=N || nextY<0 || nextY>=M) { // 범위 벗어난다면 continue
					continue;
				}
				if(map[nextX][nextY] == 1 && !visited[nextX][nextY]) { // 길이 있고 방문하지 않았다면,
					visited[nextX][nextY] = true; // 방문 바꿔주고
					q.add(new int[] {nextX, nextY}); // 큐에 저장
					map[nextX][nextY] = map[nowX][nowY]+1; // 기존위치의 값에 1 더해서 저장해줌
				}
			}
		}
		
		
	}

}
