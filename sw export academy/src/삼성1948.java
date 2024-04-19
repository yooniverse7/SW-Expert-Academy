import java.util.Scanner;

public class 삼성1948 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++) {
            int month1 = sc.nextInt();
            int day1 = sc.nextInt();
            int month2 = sc.nextInt();
            int day2 = sc.nextInt();
            int result = 0;

            int[] allDays = {31,28,31,30,31,30,31,31,30,31,30,31}; // 모든 달의 일 수

            if(month1 == month2) {
                result = day2 - day1 + 1;
            }
            else {
                for(int j = month2; j>=month1; j-- ) {
                    result += allDays[j-1];
                }
                result = result - day1 + 1 - (allDays[month2-1]-day2);
            }

            System.out.println("#" + (i+1) + " " + result);
        }
        sc.close();


    }
}
