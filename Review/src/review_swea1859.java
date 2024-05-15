import java.io.BufferedReader;
import java.io.InputStreamReader;

public class review_swea1859 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int tc = 1; tc<=T; tc++ ) {
			int N = Integer.parseInt(br.readLine()); // 요일 수
			String[] str = br.readLine().split(" "); 
			int[] arr = new int[N]; // 요일별 매매가
			long sum = 0; // 합산 이익 크기 고려하여 long
			
			for(int i = 0; i<N; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			
			int max = arr[N-1]; // 맨마지막을 max값으로 설정
			for(int i = N-2; i>=0; i--) {
				if(max<arr[i]) { 
					max = arr[i];
				}else {
					sum += max - arr[i];
				}
			}
			
			System.out.println("#" + tc + " " + sum);
		}
			
	}

}
