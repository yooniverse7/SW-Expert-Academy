import java.util.Scanner;

public class 삼성1945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] result = new int[5];

        for(int tc = 0; tc<T; tc++) {
            int N = sc.nextInt();

            for(int i = 0; i<5; i++) { // 결과 배열 0으로 초기화
                result[i] =0;
            }
            
            while (N % 11 == 0) {
                result[4]++;
                N = N/11;
            }
            while (N % 7 == 0) {
                result[3]++;
                N = N/7;
            }
            while (N % 5 == 0) {
                result[2]++;
                N = N/5;
            }
            while (N % 3 == 0) {
                result[1]++;
                N = N/3;
            }
            while (N % 2 == 0) {
                result[0]++;
                N = N/2;
            }


            System.out.print("#" + (tc+1) + " ");

            for(int j = 0; j<5; j++) {
                System.out.print(result[j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
