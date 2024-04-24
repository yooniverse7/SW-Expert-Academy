import java.util.Scanner;

public class 삼성1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int tc = 1; tc<=10; tc++) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for(int i = 0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            
            for(int i = 2; i<N-2; i++) {
                if(arr[i]>arr[i+1] && arr[i]>arr[i+2] && arr[i]>arr[i-1] && arr[i]>arr[i-2]) { 
                    int max = 0;
                    
                    if(arr[i+1]>max) {
                        max = arr[i+1];
                    }
                    if(arr[i+2]>max) {
                        max = arr[i+2];
                    }
                    if(arr[i-1]>max) {
                        max = arr[i-1];
                    }
                    if(arr[i-2]>max) {
                        max = arr[i-2];
                    }
                    
                    sum = sum + (arr[i] - max);
                    
                }
            }
            System.out.println("#" + tc + " " + sum);
        }
        sc.close();
    }
}
