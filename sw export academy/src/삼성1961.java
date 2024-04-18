import java.util.Scanner;

public class 삼성1961 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            for(int x = 0; x<N; x++) {
                for(int y = 0; y<N; y++) {
                    arr[x][y] = sc.nextInt();
                }
            }
            System.out.println("#" + (i+1));

            for(int x = 0; x<N; x++) { //90돌리기, 180도돌리기, 270도돌리기
                for(int y = 0; y<N; y++) {
                    System.out.print(arr[N-1-y][x]);
                }
                System.out.print(" ");
                for(int y = 0; y<N; y++) {
                    System.out.print(arr[N-1-x][N-1-y]);
                }
                System.out.print(" ");
                for(int y = 0; y<N; y++) {
                    System.out.print(arr[y][N-1-x]);
                }
                System.out.println();

            }


        }
        sc.close();
    }
}
