import java.util.Scanner;

public class 삼성1217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc<=10; tc++) {
            int T = sc.nextInt();
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println("#" + T + " " + pow(N, M));
        }
        sc.close();
    }

    public static int pow(int N, int M) {
        if(M == 1) { //N의 1승
            return N;
        }
        if(M == 0) { //N의 0승
            return 1;
        }
        return N * pow(N, M-1);
    }
}
