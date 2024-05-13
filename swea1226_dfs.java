import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea1226_dfs {

	static int[][] arr = new int[16][16];
	static boolean[][] visited = new boolean[16][16];
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int find;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int tc = 1; tc<=1; tc++) {
			int T = Integer.parseInt(br.readLine());
			find = 0;
			
			for(int i = 0; i<16; i++) { // 미로 입력
				String[] line = br.readLine().split("");
				for(int j = 0; j<16; j++) {
					arr[i][j] = Integer.parseInt(line[j]);
				}
			}	
			visited[1][1] = true;
			dfs(1, 1);
			System.out.print("#" + T + " " + find);
			
			
		}
	}
	public static void dfs(int x, int y) {
		for(int i = 0; i<4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if(nextX>=16 || nextX<0 || nextY>=16 || nextY<0) { // 범위 확인
				continue;
			}
			
			if(visited[nextX][nextY]) { // 방문 여부 확인
				continue;
			}
			if(arr[nextX][nextY] == 1) { // 길인지 확인
				continue;
			}
			if(arr[nextX][nextY] == 3) { // 도착지점 확인
				find = 1;
				return;
			}
			
			visited[nextX][nextY] = true;
			dfs(nextX, nextY);
			
		}
	}

}
