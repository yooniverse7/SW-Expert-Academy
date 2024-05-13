import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea9229 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]); // 과자 개수
			int M = Integer.parseInt(str[1]); // 최대 무게
			int[] arr = new int[N];
			int[] result = new int[N*(N-1)/2];
			
			String[] elements = br.readLine().split(" ");
			
			for(int i = 0; i<N; i++) { // 배열 채우기
				arr[i] = Integer.parseInt(elements[i]);
			}
			
			int k = 0;
			for(int i = 0; i<N-1; i++) { // 2개씩 더해주기
				for(int j = i+1; j<N; j++) {
					result[k] = arr[i] + arr[j];
					k++;
				}
			}

			int max = 0;
			
			for(int i = 0; i<result.length; i++) {
				if(result[i] > max && result[i]<=M) { // max보다 크고 최대 무게보다 작거나 같다면,
					max = result[i];
				}
			}
			if(max == 0) {
				System.out.println("#" + tc + " " + "-1");
			}else {
				System.out.println("#" + tc + " " + max);
			}
			
		}
	}

}
