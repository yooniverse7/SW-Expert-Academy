import java.io.BufferedReader;
import java.io.InputStreamReader;

public class swea6190 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine()); // 숫자 개수
			String[] str = br.readLine().split(" "); 
			int[] arr = new int[N]; // 숫자 배열
			int max = -1; 
			
			for(int i = 0; i<N; i++) { // 배열 채우기
				arr[i] = Integer.parseInt(str[i]);
			}
			
			for(int i = 0; i<N-1; i++) {
				for(int j = i+1; j<N; j++) {
					int num = arr[i]*arr[j]; // 두 수 곱하기
					String num1 = Integer.toString(num); // 수 string으로 변환

					boolean check =true;
					for(int z = 0; z<num1.length()-1; z++) {
						if(num1.length()==1) {
							break;
						}
						char first = num1.charAt(z);
						char second = num1.charAt(z+1);
						
						if(first<=second) {
							check = true;
						}else {
							check = false;
							break;
						}
					}

					if(check == true) {
						if(max<num) {
							max = num;
						}
					}
				}
			}
			
			System.out.println("#" + tc + " " + max);

		}
	}

}
