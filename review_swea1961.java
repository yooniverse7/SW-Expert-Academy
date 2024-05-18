import java.io.BufferedReader;
import java.io.InputStreamReader;

public class review_swea1961 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			
			for(int i = 0; i<N; i++) {
				String[] str = br.readLine().split(" ");
				for(int j = 0; j<N; j++) {
					arr[i][j] = Integer.parseInt(str[j]);
				}
			}
			
			System.out.println("#" + tc);
			
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) { // 90도
					System.out.print(arr[N-1-j][i]);
				}
				System.out.print(" ");
				
				for(int j = 0; j<N; j++) { // 180도
					System.out.print(arr[N-1-i][N-1-j]);
				}
				System.out.print(" ");
				
				for(int j = 0; j<N; j++) { // 270도
					System.out.print(arr[j][N-1-i]);
				}
				System.out.println();
			}
			
		}
	}

}
