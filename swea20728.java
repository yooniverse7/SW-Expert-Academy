import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class swea20728 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]); // 주머니 개수
			int K = Integer.parseInt(str[1]); // 나눠줄 주머니 수 
			int[] arr = new int[N];
			int min = Integer.MAX_VALUE; // 차이의 최솟값
			
			
			String[] elements = br.readLine().split(" ");
			for(int i = 0; i<N; i++) { // 배열 채우기
				arr[i] = Integer.parseInt(elements[i]);
			}
			
			Arrays.sort(arr);
			
			if(N != K) { //둘이 같지 않다면
				for(int i = 0; i<=N-K; i++) {
					if((arr[i+K-1] - arr[i])<min) {
						min = arr[i+K-1] - arr[i];
					}
				}
			} else { // 같다면
				min = arr[N-1] - arr[0];
			}
			
			
			System.out.println("#" + tc + " " + min);
		}
	}

}
