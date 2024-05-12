import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 삼성1226_bfs {

	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		for(int tc = 1; tc<=10; tc++) {
			int T = Integer.parseInt(br.readLine());
			arr = new int[16][16];
			visited = new boolean[16][16];
			
			for(int i = 0; i<16; i++) { // 미로 입력
				String[] line = br.readLine().split("");
				for(int j = 0; j<16; j++) {
					arr[i][j] = Integer.parseInt(line[j]);
				}
			}	
			
			System.out.print("#" + T + " ");
			
			bfs(1, 1);
			
			
		}
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y});
		visited[1][1] = true;
		
		while (!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i = 0; i<4; i++) {
	            int nextX = nowX + dx[i]; // 현재 좌표에서 하상 계산 { 1, -1, 0, 0 }
	            int nextY = nowY + dy[i]; // 현제 좌표에서 좌우 계산 { 0, 0, -1, 1 }
	            
	            if(arr[nextX][nextY] == 0 && visited[nextX][nextY] == false) { // 길이 있다면, 큐에 추가
	            	q.add(new int[] {nextX, nextY});
	            	visited[nextX][nextY] = true;
	            }
	            if(arr[nextX][nextY] == 3) {
	            	System.out.println("1");
	            	return;
	            }
			}
			
		}
		
		System.out.println("0");
	}

}
