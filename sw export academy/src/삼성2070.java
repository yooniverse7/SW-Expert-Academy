import java.util.Scanner;

public class 삼성2070 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        char[] result = new char[T];
        

        for(int i = 0; i<T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a<b) {
                result[i] = 60;
            }
            else if(a==b) {
                result[i] = 61;
            }
            else {
                result[i] = 62;   
            }
        }

        for (int i = 0; i<T; i++) {
            System.out.println("#" + (i+1) + " " +result[i]);
        }

        sc.close();
    }
}
