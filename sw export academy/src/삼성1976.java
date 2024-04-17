import java.util.Scanner;

public class 삼성1976 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++) {
            int time1 = sc.nextInt();
            int min1 = sc.nextInt();
            int time2 = sc.nextInt();
            int min2 = sc.nextInt();

            int resultTime = time1 + time2;
            int resultMin = min1 + min2;

            if(resultMin > 60) {
                resultTime++;
                resultMin = resultMin - 60;
            }
            else if(resultMin == 60) {
                resultMin = 0;
            }

            if(resultTime > 12) {
                resultTime = resultTime - 12;
            }

            System.out.println("#" + (i+1) + " " + resultTime + " " + resultMin);
        }
        sc.close();
    }
}
