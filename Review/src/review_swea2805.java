import java.io.BufferedReader;
import java.io.InputStreamReader;

public class review_swea2805 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine()); //농장의 크기
			int[][] arr = new int[N][N];
			
			for(int i = 0; i<N; i++) {
				String[] str = br.readLine().split("");
				for(int j = 0; j<N; j++) {
					arr[i][j] = Integer.parseInt(str[j]);
				}
			}
			
			int num = N/2; // 가운데
			int sum = 0;
			int z = 0;
			for(int i = 0; i<N; i++) {
				if(i<num) { // 절반에 닿기 전까지 ++
					for(int j = num-z; j<=num+z; j++) {
						sum += arr[i][j];
					}
					z++;
				} else { // 절반 이후로 --
					for(int j = num-z; j<=num+z;j++) {
						sum+= arr[i][j];
					}
					z--;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
	}

}
