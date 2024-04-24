import java.util.Scanner;

public class 삼성1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[101];
        
        for(int tc = 1; tc<=T; tc++) {
            int j = sc.nextInt(); // 테스트 케이스 숫자 입력받기 주의.... 
            for(int i = 0; i<=100; i++) {
                arr[i] = 0;
            }
            for(int i = 0; i<1000; i++) { //개수 누적하기
                int num = sc.nextInt();
                arr[num] += 1;
            }

            int max = 0;
            int maxIdx = 0;
            for(int i = 0; i<=100; i++) { //max값 찾기
                if(arr[i] > max) {
                    max = arr[i];
                }
            }
            for(int i = 0; i<=100; i++) { 
                if(arr[i] == max) {
                    maxIdx = i;
                }
            }

            System.out.println("#" + j + " " + (maxIdx));

        }
        sc.close();
    }
}
