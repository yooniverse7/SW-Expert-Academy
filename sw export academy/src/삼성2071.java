import java.util.Scanner;

public class 삼성2071 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] result = new int[T];
        int[] arr = new int[10];

        for (int i = 0; i<T; i++) { //입력받아서 더하기
            int sum = 0;
            for (int j = 0; j<10; j++ ) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double a = (double) sum / 10.0; //나눗셈을 할 때 double형으로 바꿔서 실수 나눗셈 진행
            result[i] = (int) Math.round(a); // 평균을 반올림해서 정수로 변환
        }

        for (int i = 0; i<T; i++) {
            System.out.println("#" + (i+1) + " " + result[i]);
        }

        sc.close();


    }
}
