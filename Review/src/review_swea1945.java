import java.io.BufferedReader;
import java.io.InputStreamReader;

public class review_swea1945 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] num = new int[5];
			
			while (true) {
					if(N%11 == 0) {
						num[4] += 1;
						N = N/11;
					}else {
						break;
					}
			}
			
			while (true) {
				if(N%7 == 0) {
					num[3] += 1;
					N = N/7;
				}else {
					break;
				}
			}
			
			while (true) {
				if(N%5 == 0) {
					num[2] += 1;
					N = N/5;
				}else {
					break;
				}
			}
			while (true) {
				if(N%3 == 0) {
					num[1] += 1;
					N = N/3;
				}else {
					break;
				}
			}
			while (true) {
				if(N%2 == 0) {
					num[0] += 1;
					N = N/2;
				}else {
					break;
				}
			}
			
			System.out.print("#" + tc + " ");
			
			for(int i = 0; i<5; i++) {
				System.out.print(num[i] + " ");
			}
			
		
		}
	}

}
