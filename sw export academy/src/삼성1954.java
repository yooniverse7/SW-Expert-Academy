import java.util.Scanner;

public class 삼성1954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            int num = 1;

            int right = 0; //오른쪽으로 갈 때
            int left = N-1; //왼쪽으로 갈 때
            int up = 0; // 올라갈 때
            int down = N-1; // 내려갈 때
            int dir = 0;
            
            while (num <=N*N) {

                for(int y = up; y<N-dir; y++) { //오른쪽으로 갈 때
                    arr[right][y] = num;
                    num++;
                }
                right++;

                for(int x = right; x<N-dir; x++) { //내려갈 때
                    arr[x][down] = num;
                    num++;
                }
                down--;

                for(int y = down; y>=0+dir; y--) { //왼쪽으로 갈 때
                    arr[left][y] = num;
                    num++;
                }
                left--;

                for(int x = left; x>0+dir; x-- ) { //올라갈 때
                    arr[x][up] = num;
                    num++;
                }
                up++;

                dir++;

            }


            System.out.println("#" + (i+1)); //출력
            for(int j = 0; j<N; j++) {
                for(int z = 0; z<N; z++) {
                    System.out.print(arr[j][z] + " ");
                }
                System.out.println();
            }

        }

        sc.close();

    }
}
