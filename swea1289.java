import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea1289 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			
			String[] str = br.readLine().split("");
			int[] arr = new int[str.length];
			int cnt = 0;
			
			for(int i = 0; i<arr.length; i++) {
				arr[i] = Integer.parseInt(str[i]);
			}
			if(arr[0] == 1) {
				cnt++;
			}

			for(int i = 1; i<arr.length; i++) {
				if(arr[i] != arr[i-1]) {
					cnt++;
				}
			}
			
			System.out.println("#" + tc + " " + cnt);
		}
	}

}
