import java.util.Scanner;

public class 삼성1288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수 입력
    
        for (int tc = 1; tc <= T; tc++) { // 테스트 케이스 반복
            int N = sc.nextInt(); // 입력받은 숫자 N
            int num = 1; // 초기값 설정
            int[] check = new int[10]; // 숫자 체크 배열
    
            // 숫자 체크 배열 초기화
            for (int i = 0; i < 10; i++) {
                check[i] = 0;
            }
    
            while (true) { // 무한루프
                int checkNum = N * num; // N에 num을 곱한 값
                String str = Integer.toString(checkNum); // 곱한 값의 문자열 변환
    
                // 곱한 값의 각 자릿수를 숫자 체크 배열에 표시
                for (int i = 0; i < str.length(); i++) {
                    int a = str.charAt(i) - 48;
                    check[a] = 1; 
                }
    
                // 숫자 체크 배열의 모든 요소가 1인지 확인
                boolean allOnes = true;
                for (int i = 0; i < 10; i++) {
                    if (check[i] != 1) { // 숫자 체크 배열의 요소가 1이 아닌 경우
                        allOnes = false;
                        break;
                    }
                }
    
                // 모든 요소가 1인 경우 출력하고 반복문 탈출
                if (allOnes) {
                    System.out.println("#" + tc + " " + num * N);
                    break;
                }
                num++; // num 증가
            }
        }
        sc.close();
    }

    //boolean값 활용하기
    
}
