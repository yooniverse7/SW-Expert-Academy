import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 삼성1220 {
    /**
     * @param args
     * @throws IOException 
     * @throws NumberFormatException 
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        
        for(int tc = 1; tc<=1; tc++) {
            int T = Integer.parseInt(br.readLine());
            int result = 0;
            String[][] a = new String[T][T];

            for(int i = 0; i<T; i++) { // 배열 채우기
                a[i] = br.readLine().split(" ");    
            }

            for(int i = 0; i<T; i++) {
                StringBuilder sb = new StringBuilder();

                for(int j = 0; j<T; j++) {
                    if(a[j][i].equals("1")||a[j][i].equals("2")) {
                        sb.append(a[j][i]);
                    }                    
                }
                for(int j = 0; j<sb.length()-1; j++) {
                    if(sb.charAt(j) == '1' && sb.charAt(j+1) == '2') { 
                        result++;
                    }
                }

            }



            System.out.println("#" + tc + " " + result);

            
        }
    }
}
