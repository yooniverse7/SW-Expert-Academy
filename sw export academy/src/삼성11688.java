import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼성11688 {
    public static char L;
    public static char R;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for(int tc = 1; tc<=T; tc++) {
            String str = bf.readLine();
            int left = 1;
            int right = 1;
            for(int i = 0; i<str.length(); i++) {
                

                if(str.charAt(i) == 'L') {
                    right = left + right;
                }else {
                    left = left + right;
                }

            }
            System.out.print("#" + tc + " " + left + " " + right);
            System.out.println();
        }
    }
}
