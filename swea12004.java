import java.io.BufferedReader;
import java.io.InputStreamReader;

public class swea12004 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[81];
			
			int k = 0;
			for(int i = 1; i<10; i++) {
				for(int j = 1; j<10; j++) {
					arr[k] = i*j;
					k++;
				}
			}
			boolean check = false;
			for(int i = 0; i<81; i++) {
				if(N == arr[i]) {
					check = true;
				}
			}
			if(check == true) {
				System.out.println("#" + tc + " " + "Yes");
			}else {
				System.out.println("#" + tc + " " + "No");
			}
		}
	}

}
