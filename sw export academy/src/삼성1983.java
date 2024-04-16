import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 삼성1983 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //테스트 케이스 개수
        String[] result = new String[T]; //테스트 케이스 결과 저장 

        for(int i = 0; i<T; i++) {
            int N = sc.nextInt(); //학생 수
            int K = sc.nextInt(); //알고싶은 학생의 번호
            Integer[] arr = new Integer[N]; // 총점개수 

            for(int j = 0; j<N; j++) {
               int Midterm = sc.nextInt(); //중간고사 성적
               int Finals = sc.nextInt(); //기말고사 성적
               int homework = sc.nextInt(); //과제 성적

               int total = (Midterm*35) + (Finals*45) + (homework*20); //총점
               arr[j] = total;
            }

            int Kscore = arr[K-1]; //K의 총점
            int Kidx = 0; // 정렬 후 K의 인덱스 번호

            Arrays.sort(arr, Collections.reverseOrder()); //배열 내림차순 정렬

            for(int j = 0; j<N; j++) { //정렬 후 K의 인덱스 번호 저장
                if(arr[j] == Kscore) {
                    Kidx = j;
                }
            }

            int m = N/10;

            if(Kidx < m) {
                result[i] = "A+";    
            }
            else if(m <= Kidx && Kidx < 2*m) {
                result[i] = "A0";
            }
            else if(2*m <= Kidx && Kidx < 3*m) {
                result[i] = "A-";
            }
            else if(3*m <= Kidx && Kidx < 4*m) {
                result[i] = "B+";
            }
            else if(4*m <= Kidx && Kidx < 5*m) {
                result[i] = "B0";
            }
            else if(5*m <= Kidx && Kidx < 6*m) {
                result[i] = "B-";
            }
            else if(6*m <= Kidx && Kidx < 7*m) {
                result[i] = "C+";
            }
            else if(7*m <= Kidx && Kidx < 8*m) {
                result[i] = "C0";
            }
            else if(8*m <= Kidx && Kidx < 9*m) {
                result[i] = "C-";
            }
            else{
                result[i] = "D0";
            }
            
        }

        for(int i = 0; i<T; i++) {
            System.out.println("#" + (i+1) + " " + result[i]);
        }

        sc.close();
    }
}
