import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 삼성5948 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc<=T; tc++) {
            int[] arr = new int[7];
            int[] sumArr = new int[35];
            String[] elements = br.readLine().split(" ");

            for (int i = 0; i < 7; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            int k = 0;
            for(int i = 0; i<7; i++) {
                int sum = 0;
                int num1 = arr[i]; // 첫번째 숫자 지정

                for(int j = i+1; j<7; j++) {
                    int num2 = arr[j]; // 두번째 숫자 지정
                    sum = num1 + num2;

                    for(int z = j+1; z<7; z++) {
                        sumArr[k] = sum + arr[z]; //세번째 숫자까지 더해서 넣기
                        k++;
                    }
                }
            }

            Arrays.sort(sumArr);
            for(int i = 0; i<34; i++) {
                if(sumArr[i] == sumArr[i+1]) { //오른쪽 숫자랑 같으면 0으로 바꿔주기
                    sumArr[i] = 0;
                }
            }

            int check = 0;
            int idx5 = 0;
            for(int i = 34; i>=0; i--) { //다섯번째로 큰 숫자 인덱스 찾기
                if(sumArr[i] !=0) {
                    check++;
                    if(check == 5) {
                        idx5 = i;
                    }
                }
            }

            System.out.println("#" + tc + " " + sumArr[idx5]);

        }

        
    }
}
