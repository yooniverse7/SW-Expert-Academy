import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼성11315 {
    static int[][] checkArr = {{0,1},{1,-1},{1,0},{1,1}}; // 가로, 세로, 왼쪽 하강, 오른쪽 하강
    static char[][] arr;
    public static int N;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스

        for(int tc = 1; tc<=T; tc++) {
            N = Integer.parseInt(br.readLine()); // 오목판
            arr = new char[N][N];

            for(int i=0; i<N; i++){
                String line = br.readLine();
                for(int j=0; j<N; j++){
                    arr[i][j] = line.charAt(j);
                }
            }

            boolean check5 = false;
            for(int x = 0; x<N; x++) {
                for(int y = 0; y<N; y++) {
                    if(arr[x][y] == 'o') {
                        for(int c = 0; c<4; c++) {
                            int cnt = check(x, y, c);
                           // System.out.println(cnt);
                            if(cnt == 5) {
                                check5 = true;
                                break;
                            }
                        }
                    }
                }
            }

            if(check5 == true) {
                System.out.println("#" + tc + " " + "YES");
            }else {
                System.out.println("#" + tc + " " + "NO");
            }

        }

        
    }
    public static int check(int x, int y, int c) { // 체크 함수
        int cnt = 1;
        int cx = x;
        int cy = y;
        cute : for(int i = 1; i<=4; i++) {
            cx = cx + checkArr[c][0];
            cy = cy + checkArr[c][1];
            if(cx>=0 && cx<N && cy>=0 && cy<N && arr[cx][cy] == 'o') {
                cnt++;
            }else {
                break cute;
            }
        }
        return cnt;
    }
}
