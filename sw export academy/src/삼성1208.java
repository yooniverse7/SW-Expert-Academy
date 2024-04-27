import java.util.Arrays;
import java.util.Scanner;

public class 삼성1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int tc = 1; tc<=10; tc++) {
            int N = sc.nextInt(); // 덤프 횟수
            int[] arr = new int[100];

            for(int i = 0; i<100; i++) { // 박스 개수 입력
                arr[i] = sc.nextInt();
            }

            while (true) {

                Arrays.sort(arr); // 반복해서 정렬하기

                if(N == 0 || arr[99] - arr[0] <= 1)  
                    break;

                arr[99]--;
                arr[0]++;
                N--; // 횟수를 하나씩 줄이기

            }

            System.out.println("#" + tc + " " + (arr[99] - arr[0]));

        }
        sc.close();
    }
}
