import java.util.Scanner;

public class 삼성2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수를 입력 받음
        int[] result = new int[T]; // 각 테스트 케이스의 결과를 저장할 배열

        // 각 테스트 케이스에 대해 반복
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 배열의 크기 N을 입력 받음
            int M = sc.nextInt(); // 그룹의 크기 M을 입력 받음
            int[][] arr = new int[N][N]; // N x N 크기의 배열 선언

            // 배열의 요소를 입력 받음
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }

            int maxSum = Integer.MIN_VALUE; // 각 테스트 케이스에서의 최대 합을 초기화

            // 그룹의 왼쪽 상단 인덱스를 이동하면서 각 그룹의 합을 계산
            for (int j = 0; j <= N - M; j++) {
                for (int k = 0; k <= N - M; k++) {
                    int sum = 0;
                    // 현재 그룹 내의 모든 요소를 합산
                    for (int z = 0; z < M; z++) {
                        for (int l = 0; l < M; l++) {
                            sum += arr[j + z][k + l];
                        }
                    }
                    // 현재 그룹의 합이 최대 합보다 크면 최대 합을 갱신
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
            
            // 결과 배열에 최대 합을 저장
            result[i] = maxSum;
        }

        // 각 테스트 케이스의 결과를 출력
        for(int i = 0; i < result.length; i++) {
            System.out.println("#" + (i + 1) + " " + result[i]);
        }

        sc.close();
    }
}
