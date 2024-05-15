import java.io.BufferedReader;
import java.io.InputStreamReader;

public class review_swea2005 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			System.out.println("#" + tc);
			int[][] arr = new int[N][N];
			arr[0][0] = 1; // 첫 번째 줄은 항상 숫자 1
			
			for(int i = 1; i<N; i++) {
				for(int j = 0; j<=i; j++)  {
					if(j == 0 || j == i) { // 각 줄의 끝은 1
						arr[i][j] = 1;
					}else {
						arr[i][j] = arr[i-1][j-1] + arr[i-1][j]; // 자신의 왼쪽과 오른쪽 위의 숫자의 합
					}
				}
			}
			
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<=i; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
