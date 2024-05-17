import java.io.BufferedReader;
import java.io.InputStreamReader;

public class review_swea11315 {
	
	static int N;
	static char[][] map;
	static int[][] dd = {{0,1}, {1,0}, {1,-1}, {1,1}}; //오른쪽, 아래, 왼쪽 대각선, 오른쪽 대각선 
	static int cnt;
	static boolean YN;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			N = Integer.parseInt(br.readLine());
			map = new char[N][N];
			cnt = 0;
			YN = false;
			
			for(int i = 0; i<N; i++) { // 배열 채우기
				String str = br.readLine();
				for(int j = 0; j<N; j++) {
					map[i][j] = str.charAt(j);
				}
			}
			
			System.out.print("#" + tc + " ");
			
			cute : for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					if(map[i][j] == 'o') {
						check(i, j);
					}
					if(YN == true) {
						break cute;
					}
				}
			}
			
			if(YN == true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
	}
	public static void check(int x, int y) {
		for(int i = 0; i<4; i++) {
			int nx = x; 
			int ny = y;
			cnt = 1;
			for(int j = 0; j<4; j++) {
				nx = nx + dd[i][0]; // 계속 좌표 바꿔주기,,
				ny = ny + dd[i][1];
				
				if(nx<0 || nx>=N || ny<0 || ny>=N || map[nx][ny] != 'o') {
					cnt = 1;
					break;
				} else {
					cnt++;
				}
				if(cnt == 5) {
					YN = true;
					return;
				}
			}
		}
	}

}
