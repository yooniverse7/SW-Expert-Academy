import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class review_swea1226 {

	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int tc = 1; tc <=10; tc++) {
			int T = Integer.parseInt(br.readLine());
			arr = new int[16][16];
			visited = new boolean[16][16];
			
			for(int i = 0; i<16; i++) { // 배열 채우기
				String[] str = br.readLine().split("");
				for(int j = 0; j<16; j++) {
					arr[i][j] = Integer.parseInt(str[j]);
				}
			}
			
			System.out.print("#" + T + " ");
			visited[1][1] = true;
			bfs(1, 1); // 1,1부터 시작
		}
	
	}
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();// 큐 생성
		q.add(new int[] {x, y}); // 큐에 담기
		while (!q.isEmpty()) { // 큐가 빌 때 까지
			int now[] = q.poll(); // 큐에서 빼오기
			int nowX = now[0];
			int nowY = now[1];
			for(int i = 0; i<4; i++) {
				int nextX = nowX + dx[i]; // 좌표 바꾸기
				int nextY = nowY + dy[i];
				
				if(nextX<0 || nextX>=16 || nextY<0 || nextY>=16) { // 범위 벗어나면 continue
					continue;
				}
				if(arr[nextX][nextY] == 0 && !visited[nextX][nextY]) { //  길이 있고 방문하지 않았다면,
					visited[nextX][nextY] = true; // 방문 여부 변경
					q.add(new int[] {nextX, nextY}); // 큐에 넣기
				}
				if(arr[nextX][nextY] == 3) { // 도착한다면,
					System.out.println("1"); // 1 출력 후 return
					return;
				}
			}
		}
		System.out.println("0");
	}

}
