import java.util.Scanner;

public class 삼성1970 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++) {
            int money = sc.nextInt();
            int[] result = new int[8];
            
            for(int j = 0; j<8; j++) {
                result[j] = 0;
            }

            if(money>=50000) {
                result[0] = money/50000;
                money = money - (result[0] * 50000);
            }
            if(10000<= money && money < 50000) {
                result[1] = money/10000;
                money = money - (result[1] * 10000);
            } 
            if(5000<=money && money < 10000) {
                result[2] = money/5000;
                money = money - (result[2] * 5000);
            }
            if(1000<=money && money < 5000) {
                result[3] = money/1000;
                money = money - (result[3] * 1000);
            }
            if(500<=money && money < 1000) {
                result[4] = money/500;
                money = money - (result[4] * 500);
            }
            if(100<=money && money < 500) {
                result[5] = money/100;
                money = money - (result[5] * 100);
            }
            if(50<=money && money < 100) {
                result[6] = money/50;
                money = money - (result[6] * 50);
            }
            if(10<=money && money < 50) {
                result[7] = money/10;
                money = money - (result[7] * 10);
            }

            System.out.println("#" + (i+1));
            
            for(int j = 0; j<8; j++) {
                System.out.print(result[j] + " ");
            }
            System.out.println();
            

        }
        sc.close();
    }
}
