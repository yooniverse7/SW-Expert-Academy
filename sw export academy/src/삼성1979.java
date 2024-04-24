import java.util.Scanner;

public class 삼성1979 {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
    

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
                    if(arr[j][z] == 0) {
                        if(num == K) {
                            sum += 1;
                        }
                        num = 0;
                    } else {
                        num++;
                    }
                }
				if (num == K) {
                    sum += 1;
                }
                
            }

            //세로 확인
            for(int j = 0; j<N; j++) {
                int num = 0; //누적되는 블록 개수
                for(int z = 0; z<N; z++) {
                    if(arr[z][j] == 1) { // 블록이 1이면 카운트
							num++;
					}else {
						if(num == K) {
							sum++;
						}
						num = 0;
					}

	                }
                if(num == K) { //위치가 여기에 있어야하는 이유는..??
                  sum++;
                    
                }

    	    }
        	
            System.out.println("#" + (i+1) + " " + sum);    
			
		}

       

        sc.close();

		
    }
}

