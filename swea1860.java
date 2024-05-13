import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class swea1860 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc =1; tc<=T; tc++) {
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]); // 손님 수
			int M = Integer.parseInt(str[1]); // 시간
			int K = Integer.parseInt(str[2]); // 붕어빵 수
			int[] arr = new int[N];
			
			String[] elements = br.readLine().split(" ");
			for(int i = 0; i<N; i++) { // 손님이 오는 시간
				arr[i] = Integer.parseInt(elements[i]);
			}
			
			Arrays.sort(arr); // 배열 정렬
			
			boolean check = true;
			cute : for(int i = 0; i<N; i++) {
				if(arr[i]<M) {
					check = false;
					break cute;
				}
				
				int num = arr[i]/M * K - i; // 남은 붕어빵 계산
				
				if(num > 0) { 
					check = true;
				
				} else {
					break; // 붕어빵이 안남았으면 빠져나오기
				}
			}
			
			if(check == true) {
				System.out.println("#" + tc + " " + "Possible");
			}else {
				System.out.println("#" + tc + " " + "Impossible");
			}
		}
	}

}
