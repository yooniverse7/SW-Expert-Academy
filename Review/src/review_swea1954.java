import java.io.BufferedReader;
import java.io.InputStreamReader;

public class review_swea1954 {

	static int[] dx = {0, 1, 0, -1}; // x축
	static int[] dy = {1, 0, -1, 0}; // y축
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int tc = 1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			
			int dir = 0; // 방향 바꾸기 위한 변수
			int x = 0; // 초기 x값
			int y = 0; // 초기 y값
			int cnt = 1; // 채울 숫자
			
			while (cnt <= N*N) {
				arr[x][y] = cnt;
				cnt++;
				int nx = x + dx[dir];
				int ny = y + dy[dir];
				
				if(nx < 0|| nx >=N || ny <0 || ny >= N || arr[nx][ny] != 0) { //범위안에 없거나 숫자가 차있다면,
					dir = (dir + 1) % 4; // 방향 바꾸기
					nx = x + dx[dir]; //바꾼 값 더하기
					ny = y + dy[dir];
				}
				x = nx;
				y = ny;
				
			}
			
			System.out.println("#" + tc);
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
