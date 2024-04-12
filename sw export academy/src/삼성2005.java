import java.util.Scanner;

public class 삼성2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i<N; i++) {
            int num = sc.nextInt();
            System.out.println("#" + (i+1));
            int[][] arr = new int[num][num];

            for(int j = 0; j<num; j++) {
                for(int k = 0; k<num; k++) {
                    arr[j][k] = j;
                }
            }

                 // 2차원 배열 출력
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k <=j; k++) {
                    arr[j][0] = 1;  //출력 시 맨앞, 맨끝 1로 변경
                    arr[j][j] = 1;
                    System.out.print(arr[j][k] + " ");

                }
                System.out.println(); // 다음 줄로 넘어감
            }
        }
        
    }
}
