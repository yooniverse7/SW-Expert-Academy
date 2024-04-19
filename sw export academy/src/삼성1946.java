import java.util.Scanner;

public class 삼성1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++) {
            int N = sc.nextInt();
            int[] Ki = new int[N];
            char[] Ci = new char[N];
            
            int x = 0;
            int y = 0;

            for(int j = 0; j<N; j++) {
                Ci[j] = sc.next().charAt(0); //알파벳들 입력받기
                Ki[j] = sc.nextInt(); //알파벳 개수들 입력받기
            }

            int sum = 0;
            for(int j = 0; j<N; j++) { //알파벳 전체 개수 확인
                sum +=Ki[j];
            }

            int len = sum/10;
            if(sum%10!=0) {
                len+=1;
            }
            char[][] arr = new char[len][10]; //알파벳 담을 배열 생성


            for(int j=0;j<N; j++) {
                for(int z = 0; z<Ki[j]; z++) {
                    arr[x][y] = Ci[j];
                    y++;
                    if(y==10) {
                        y=0;
                        x++;
                    }
                }
            }

            System.out.println("#" + (i+1));

            for(int j = 0; j<len; j++) {
                for(int z = 0; z<10; z++) {
                    System.out.print(arr[j][z]);
                }
                System.out.println();
            }


        }
        sc.close();
    }
}
