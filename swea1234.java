import java.io.BufferedReader;
import java.io.InputStreamReader;


public class swea1234 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		for(int tc =1; tc<=10; tc++) {
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			StringBuilder sb = new StringBuilder();
			sb.append(str[1]);
			
			int a = 0;
			while (a<N) {
				a++;
				for(int i = 0; i<sb.length()-1; i++) {
					if(sb.charAt(i) == sb.charAt(i+1)) {
						sb.deleteCharAt(i);
						sb.deleteCharAt(i);
					}
				}
			}
			
			System.out.println("#" + tc + " " + sb);
		}
	}

}
