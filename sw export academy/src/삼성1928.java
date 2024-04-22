import java.util.Base64;
import java.util.Scanner;

public class 삼성1928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int tc = 1; tc<=T; tc++) {
            String str = sc.nextLine().trim();
            String result = new String(Base64.getDecoder().decode(str));
            System.out.println("#" + tc + " " + result);
        }
        sc.close();
    }

    //라이브러리 사용법을 익혀야할 것 같은 문제,, 이렇게나 쉽게 풀 수 있다고 합니다.
}
