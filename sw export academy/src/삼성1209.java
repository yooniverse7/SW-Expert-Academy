import java.util.Scanner;

public class 삼성1209 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int tc = 1; tc<=10; tc++) {
            int T = sc.nextInt();
            int[][] arr = new int[100][100];


            for(int i = 0; i<100; i++) { // 배열 채우기
                for(int j = 0; j<100; j++) {
                    arr[i][j] = sc.nextInt(); 
                }
            }

            int max = 0;
            for(int i = 0; i<100; i++) { // 가로 합 구하기
                int sum = 0; 
                for(int j = 0; j<100; j++) {
                    sum += arr[i][j];
                }
                if(sum>max) {
                    max = sum;
                }
            }

            for(int i = 0; i<100; i++) { // 세로 합 구하기
                int sum = 0; 
                for(int j = 0; j<100; j++) {
                    sum += arr[j][i];
                }
                if(sum>max) {
                    max = sum;
                }
            }

            int sum = 0; 
            for(int i = 0; i<100; i++) { // 하향 대각선 합 구하기
                sum += arr[i][i];
                if(sum>max) {
                    max = sum;
                }
            }

            sum = 0;
            for(int i = 0; i<100; i++) { // 상향 대각선 합 구하기
                sum += arr[i][99-i];
                if(sum>max) {
                    max = sum;
                }
            }

            System.out.println("#" + T + " " + max);
        }
        sc.close();
    }
}
