import java.util.Scanner;

public class 삼성2703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int[][] arr = new int[T][10];
        int[] result = new int[T];
        

        for (int i = 0; i < T; i++) {  // 배열에 추가하기
            for (int j = 0; j<10; j++) {
                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }

        for (int i = 0; i < T; i++) {
            int sum = 0;
            for (int j = 0; j<10; j++) {
                if (arr[i][j]%2 != 0) { //홀수만 더하기

                    sum += arr[i][j];
                }
                result[i] = sum;
            }
        }

        for (int i = 0; i < T; i++) { //출력하기
            System.out.println("#"+ (i+1) + " " + result[i]);
        }
        
        sc.close();


    }
}
