import java.util.Scanner;

public class 삼성2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] result = new int[T];
        int[] arr = new int[10];

        for (int i = 0; i<T; i++) {
            int max = 0;
            for (int j = 0; j<10; j++) {
                arr[j] = sc.nextInt();
                if(max<arr[j]) {
                    max = arr[j];
                }
            }
            result[i] = max;
        }

        for (int i = 0; i<T; i++) {
            System.out.println("#" + (i+1) + " " + result[i]);
        }
    }
}
