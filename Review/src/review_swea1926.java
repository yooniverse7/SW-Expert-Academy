import java.io.BufferedReader;
import java.io.InputStreamReader;

public class review_swea1926 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 숫자 개수 입력
		
		for(int num = 1; num <= N; num++) {
			int sum = 0; // 369 개수
			String str = Integer.toString(num);
			for(int i = 0; i<str.length(); i++) {
				char num1 = str.charAt(i);
				if(num1 == '3' || num1 == '6' || num1 == '9') { // 369가 있다면,
					sum++;
				}
			}
			if(sum == 0) { // 369 숫자가 아니라면 원래 숫자 출력
				System.out.print(num + " ");
			}else if(sum > 0) { // 369 숫자라면 개수만큼 바 출력
				for (int i = 0; i < sum; i++) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}
	}

}
