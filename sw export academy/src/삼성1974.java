import java.util.Scanner;

public class 삼성1974 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i<T; i++){
            int[][] arr = new int[9][9];
            int result = 1;
        
            for(int j = 0; j<9; j++){ //숫자 채우기
                for(int z = 0; z<9; z++) {
                    arr[j][z] = sc.nextInt();
                }
            }

            //가로 체크
            for(int j = 0; j<9; j++) {
                for(int z = 0; z<9; z++) {
                    int num = arr[j][z];
                   for(int k = z+1;k<9; k++) {
                    if(arr[j][k] == num) {
                        result = 0;
                        break;
                    }
                   }
                }
            }

            //세로 체크
            if(result == 1) {
                for(int j = 0; j<9; j++) {
                    for(int z = 0; z<9; z++) {
                        int num = arr[z][j];
                       for(int k = z+1;k<9; k++) {
                        if(arr[k][j] == num) {
                            result = 0;
                            break;
                        }
                       }
                    }
                }
            }

            // 3*3 박스 체크
            if (result == 1) {
                for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    boolean[] visited = new boolean[9]; // 1부터 9까지의 숫자를 방문했는지 체크할 배열
                    int startRow = j * 3;
                    int startCol = k * 3;
                    for (int row = startRow; row < startRow + 3; row++) {
                        for (int col = startCol; col < startCol + 3; col++) {
                            int num = arr[row][col];
                            if (visited[num-1]) { // 이미 방문한 숫자일 경우 중복
                                result = 0;
                                break;
                            }
                            visited[num-1] = true;
                        }
                        if (result == 0) { // 중복이 발생한 경우 더 이상 확인할 필요가 없으므로 종료
                            break;
                        }
                        }
                    }
                    if (result == 0) { // 중복이 발생한 경우 더 이상 확인할 필요가 없으므로 종료
                        break;
                    }
                }
            }


            System.out.println("#" + (i+1) + " " + result);

        }
        sc.close();
    }
}
