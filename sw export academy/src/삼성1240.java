import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼성1240 {
    public static String[] code = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011", "0110111", "0001011"};

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc<=T; tc++) {
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            int[][] str1 = new int[N][M]; // 전체 배열
            int[] check = new int[56]; // 암호문 담는 배열
            int[] set = new int[8]; // 해석한 숫자 담는 배열

            for (int i = 0; i < N; i++) {
                String[] elements = br.readLine().split(""); // 공백을 기준으로 문자열을 나누어 배열로 저장
                for (int j = 0; j < M; j++) {
                    str1[i][j] = Integer.parseInt(elements[j]); // 문자열을 정수로 변환하여 배열에 저장
                }
            }

            int x = 0;
            int y = 0;
            cute : for(int i = 0; i<N; i++) { //처음으로 1이 나오는 인덱스 위치 확인
                for(int j = M-1; j>=0; j--) {
                    if(str1[i][j] == 1) {
                        x = i;
                        y = j;
                        break cute;
                    }
                }
            }

            int j =55;
            for(int i = y; i>=y-55; i--) { //암호 담기
                check[j] = str1[x][i];
                j--;
            }

            int k = 0;
            
            for(int i = 0; i<56; i+=0) {
                StringBuilder strNumBuilder = new StringBuilder();
                for(int z =0; z<7; z++) {
                    strNumBuilder.append(check[i]);
                    i++;
                }
                String strNum = strNumBuilder.toString();

                for(int z = 0; z<9; z++) {
                    if(code[z].equals(strNum)) {
                        set[k] = z;
                    }
                }
                k++;
            }

            int odd = 0; //홀수
            int even = 0; //짝수

            for(int i = 0; i<8; i++) {
                if(i%2 == 0) {
                    odd += set[i];
                }else{
                    even += set[i];
                }
            }

            int sum = odd*3 + even;
            int cnt = 0;
            if(sum%10 == 0) {
                for(int i = 0; i<8; i++) {
                    cnt += set[i];
                }
                System.out.println("#" + tc + " " + cnt);
            }else{
                System.out.println("#" + tc + " " + "0");
            }

        }
    }   
}
