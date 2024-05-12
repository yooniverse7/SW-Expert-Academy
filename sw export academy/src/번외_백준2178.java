import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class 번외_백준2178 {

	static int[][] map;
	   static int N;
	   static int M;
	   static boolean[][] visited;
	   static int[] dx = { 1, -1, 0, 0 }; // x방향배열-하상
	   static int[] dy = { 0, 0, -1, 1 }; // y방향배열-좌우

	   public static void main(String[] args) throws Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st = new StringTokenizer(br.readLine());

	      N = Integer.parseInt(st.nextToken());
	      M = Integer.parseInt(st.nextToken());
	      map = new int[N][M]; // int형으로 미로 저장

	      for (int i = 0; i < N; i++) {
	         String s = br.readLine();
	         for (int j = 0; j < M; j++) {
	            map[i][j] = s.charAt(j) - '0';
	         }
	      }

	      visited = new boolean[N][M]; // 방문 확인
	      visited[0][0] = true; // (1,1)부터 시작이므로 인덱스 (0,0) = 방문함
	      bfs(0, 0);
	      System.out.println(map[N - 1][M - 1]);
	   }

	   public static void bfs(int x, int y) {
	      Queue<int[]> q = new LinkedList<>();
	      q.add(new int[] { x, y }); // 큐에 쌍으로 입력

	      while (!q.isEmpty()) { // 큐에 데이터가 있다면
	         int now[] = q.poll(); // 최근에 들어 온 데이터 가져온 후 큐에서 삭제
	         int nowX = now[0]; // x저장
	         int nowY = now[1]; // y저장

	         for (int i = 0; i < 4; i++) { // 좌표 검사 
	            int nextX = nowX + dx[i]; // 현재 좌표에서 하상 계산 { 1, -1, 0, 0 }
	            int nextY = nowY + dy[i]; // 현제 좌표에서 좌우 계산 { 0, 0, -1, 1 }

	            // N,M 범위 넘어서면 continue
	            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
	               continue;
	            }
	            // 방문도 안했고 맵에서도 0이라면 이동할 수 없는 곳이니 continue
	            if(visited[nextX][nextY] || map[nextX][nextY]==0) {
	               continue;
	            }
	            
	            // 큐에 계산된 좌표 저장
	            q.add(new int[] {nextX, nextY});
	            // 거리 계산을 위해 현재 좌표 값+1을 계산된 좌표에 저장
	            map[nextX][nextY] = map[nowX][nowY] + 1;
	            // 방문 체크
	            visited[nextX][nextY] = true;
	         }
	      }
	   }



}
