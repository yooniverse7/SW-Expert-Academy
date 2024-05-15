import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class review_swea2001 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[][] map = new int[N][N]; // 파리 배열 
			
			for(int i = 0; i<N; i++) { // 파리 수 넣기
				String[] elements = br.readLine().split(" ");
				for(int j = 0; j<N; j++) {
					map[i][j] = Integer.parseInt(elements[j]);
				}
			}
			
			int max = 0;
			
			for(int i = 0; i<=N-M; i++) {
				for(int j = 0; j<=N-M; j++) {
					int sum = 0;
					for(int k = 0; k<M; k++) {
						for(int z = 0; z<M; z++) {
							sum += map[i+k][j+z];
						}
					}
					if(sum > max) {
						max = sum;
					}
				}
			}
			
			System.out.println("#" + tc + " " + max);
			
		}

	}

}
