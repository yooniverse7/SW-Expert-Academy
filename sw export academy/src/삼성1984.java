import java.util.Arrays;
import java.util.Scanner;

public class 삼성1984 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[10];
        int[] result = new int[T];

        for(int i = 0; i<T; i++) {

            for(int j = 0; j<10; j++) { //배열 입력받기
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr); //배열 정렬

            int sum = 0;
            for(int j = 1; j<9;j++) { //0번째, 9번째 인덱스를 제외한 중간값들의 합 구하기
                sum += arr[j];
            }

            double average = (double) sum / 8;

            result[i] = (int) Math.round(average); //소수점 첫째 자리에서 반올림하기 
        }

        for(int i = 0; i<T; i++) { //출력 
            System.out.println("#" + (i+1) + " " + result[i]);
        }
        
        sc.close();


    }
}
