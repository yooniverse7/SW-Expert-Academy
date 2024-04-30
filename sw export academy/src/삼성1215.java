import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 삼성1215 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[8][8];

        for(int tc = 1; tc<=1; tc++) {
            int num = Integer.parseInt(br.readLine());
            char[] checkArr = new char[num]; // 회문 체크할 배열
            int sum = 0;

            for(int i = 0; i<8; i++) { // 입력값 담아주기
                String str = br.readLine();
                for(int j = 0; j<8; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            
            for(int x = 0; x<8; x++) {         // 가로 체크하기
                for(int y = 0; y<=8-num; y++) {
                    boolean checkStr = true;
                    for(int z = 0; z<num; z++) { //체크배열에 num만큼 담기
                        checkArr[z] = arr[x][y+z];
                    }

                    for(int z = 0; z<num; z++) { //확인하기
                        if(checkArr[z] != checkArr[num - z -1]) {
                            checkStr = false;
                        }
                    }

                    if(checkStr == true) {
                        sum++;
                    }

                }
            }

            for(int y = 0; y<8; y++) {         // 세로 체크하기
                for(int x = 0; x<=8-num; x++) {
                    boolean checkStr = true;
                    for(int z = 0; z<num; z++) {
                        checkArr[z] = arr[x+z][y];
                    }

                    for(int z = 0; z<num; z++) {
                        if(checkArr[z] != checkArr[num - z -1]) {
                            checkStr = false;
                        }
                    }

                    if(checkStr == true) {
                        sum++;
                    }

                }
            }

            System.out.println("#" + tc + " " + sum);
            
        }
    }
}
