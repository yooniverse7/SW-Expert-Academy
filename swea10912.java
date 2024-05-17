import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class swea10912 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			String str = br.readLine();
			char[] arr = new char[str.length()];
			
			for(int i = 0; i<str.length(); i++) {
				arr[i] = str.charAt(i);
			}
			
			Arrays.sort(arr); // 배열 정렬
			
			if(arr.length >1) { // 만약 길이가 1이상이라면,
				for(int i = 0; i<arr.length-1; i++) {
					if(arr[i] == arr[i+1]) { // 오른쪽 옆의 문자와 같다면 둘다 0으로 바꿈
						arr[i] = '0';
						arr[i+1] = '0';
					}
				}
			}
			
			boolean check = false;
			for(int i = 0; i<arr.length; i++) {
				if(arr[i] != '0') { // 0이 아닌 문자가 있다면 true
					check = true;
				}
			}

			if(check == false) { // 남은 문자가 없다면 Good 출력
				System.out.println("#" + tc + " " + "Good");
			}else { 
				System.out.print("#" + tc + " ");
				for(int i = 0; i<arr.length; i++) {
					if(arr[i] != '0') { // 0이 아닌 문자만 출력
						System.out.print(arr[i]);
					}
				}
				System.out.println();
			}
		}

	}

}
