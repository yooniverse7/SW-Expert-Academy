import java.util.Scanner;

public class 삼성1979 {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] result = new int[T];

        for(int i = 0; i<T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] arr = new int[N][N];

            for(int j = 0; j < N; j++) { // 0,1 채우기
                for(int z = 0; z < N; z++) {
                    arr[j][z] = sc.nextInt();
                }
            }

            int sum = 0; // 들어갈 수 있는 자리 개수

            //가로 확인
            for(int j = 0; j < N; j++) {
                int num = 0; //누적되는 블록 개수
                for(int z = 0; z<N; z++) {
                    if(arr[j][z] == 1) {
                        num++;
                    } else {
						if(num == K) {
							sum++;
						}
                        num = 0;
                    }
					if(j== N-1&&num == K) { // 00111일 경우
						sum++;
					}

                }
            }

            //세로 확인
            for(int j = 0; j<N; j++) {
                int num = 0; //누적되는 블록 개수
                for(int z = 0; z<N; z++) {
                    if(arr[z][j] == 1) { // 블록이 1이면 카운트
							num++;
					}
					else {
						if(num == K) {
							sum++;
						}
						num = 0;
					}
					if(z== N-1&&num == K) {
							sum++;
						}
	                }
    	        }
        	
			result[i] = sum;
		}

        for(int i = 0; i < T; i++) {
            System.out.println("#" + (i+1) + " "+ result[i]);
        }

        sc.close();

		
    }
}
