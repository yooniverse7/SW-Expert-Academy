import java.util.Scanner;

public class 삼성2805 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc = 1; tc<=T; tc++) {
            int N = sc.nextInt();
            sc.nextLine();
            int[][] arr = new int[N][N+1];

            for(int i = 0; i<N; i++) { //String으로 입력된 숫자를 배열에 저장
                String num = sc.nextLine();
                for(int j = 0; j<num.length(); j++) {
                    arr[i][j] = num.charAt(j) - '0'; //문자이므로 '0'을 빼줘야 입력된 숫자로 저장됨
                }
            }

            int sum = 0;
            int x = N/2;
            int y = N/2;

            for(int i = 0; i<N; i++) { //이 부분,, 마름모 별찍기와 같은 원리,, 공부하기
                for(int j = x; j<=y; j++) {
                    sum += arr[i][j];
                }
                if(i < N/2) {
                    x--;
                    y++;
                }else {
                    x++;
                    y--;
                }
            }

            
            System.out.println("#" + tc + " " + sum);

            
        }
        sc.close();
    }
}
