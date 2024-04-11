import java.util.Arrays;
import java.util.Scanner;

public class 삼성2063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr); //정렬하기 

        System.out.println(arr[T/2]);

        sc.close();

    }
    
}
