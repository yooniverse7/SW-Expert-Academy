import java.util.Scanner;

public class 삼성1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc = 1; tc<=T; tc++) {
            int P = sc.nextInt(); // A사 리터당 요금
            int Q = sc.nextInt(); // B사 기본요금
            int R = sc.nextInt(); // B사 경계 리터수
            int S = sc.nextInt(); // B사 리터당 요금
            int W = sc.nextInt(); // 사용 리터

            int chargeA = P*W;
            int chargeB = 0;

            if(W<=R) {
                chargeB = Q;
            }
            else {
                chargeB = (W - R)*S + Q;
            }

            if(chargeA > chargeB) {
                System.out.println("#" + tc + " " + chargeB);
            }
            else {
                System.out.println("#" + tc + " " + chargeA);
            }

        }
        sc.close();
    }
}
