import java.util.Scanner;

public class 삼성1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long[] result = new long[T];
        
        for (int i = 0; i<T; i++) {

            long sum = 0; //최대 이익 

            int n = sc.nextInt(); 
            int[] arr = new int[n]; //각 날의 매매가

            for(int j = 0; j<n;j++) { //테스트케이스 값 배열에 저장
                arr[j] = sc.nextInt();

            }
            
            int max = arr[n - 1]; // 초기 최대값 설정
            for (int j = n - 2; j >= 0; j--) { // 배열을 뒤부터 순회
                if (arr[j] > max) {
                    max = arr[j];
                } else {
                    sum += max - arr[j];
                }
            }
            result[i] = sum;
        }

        // 결과 출력
        for (int i = 0; i < T; i++) {
            System.out.println("#" + (i + 1) + " " + result[i]);
        }
        sc.close();
    }
 }

