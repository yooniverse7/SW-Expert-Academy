import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 삼성1225 {
    /**
     * @param args
     * @throws NumberFormatException
     * @throws IOException
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> q = new LinkedList<>(); 

        for(int tc = 1; tc<=10; tc++) {
            int T = Integer.parseInt(bf.readLine());
            st = new StringTokenizer(bf.readLine(), " "); //들어온 문자열 나눠서 담기

            while (st.hasMoreTokens()) { //다음에 읽을 토큰이 있으면 true, 없으면 false 리턴
                q.add(Integer.parseInt(st.nextToken()));
            }

            int cycle = 1;
            while (true) {
                int now = q.poll() - cycle;

                if(now <= 0) break;
                q.add(now);

                cycle++;
                if(cycle > 5)cycle = 1;
            }
            q.add(0);

            System.out.print("#" + tc + " ");
            while (!q.isEmpty()) {
                System.out.print(q.poll() + " ");
            }
            System.out.println(); 

        }


        // for(int tc = 1; tc<=1; tc++) {
        //     int T = Integer.parseInt(bf.readLine());
        //     String[] inputLine = bf.readLine().split(" "); // 한 줄을 읽고 공백으로 분할
        //     int[] arr = new int[8];

        //     for(int i = 0; i<8; i++) {
        //         arr[i] = Integer.parseInt(inputLine[i]); //각 문자열을 숫자로 변환
        //     }

        //     boolean isAllZeroOrNegative = false; // 모든 요소가 0 이하인지 확인하기 위한 변수

        //     while (!isAllZeroOrNegative) {
        //         isAllZeroOrNegative = true;
    
        //         for(int i = 0; i <8; i++) {
        //             int num = arr[0];
        //             arr[0] = arr[1];
        //             arr[1] = arr[2];
        //             arr[2] = arr[3];
        //             arr[3] = arr[4];
        //             arr[4] = arr[5];
        //             arr[5] = arr[6];
        //             arr[6] = arr[7];
        //             arr[7] = num - i + 1;
    
        //             if(arr[i] <= 0) {
        //                 arr[i] = 0;
        //                 isAllZeroOrNegative = false;
        //             }
        //         }
        //     }

        //     bw.write("#" + tc + " ");

        //     for(int i = 0; i<8; i++) {
        //         bw.write(arr[i] + " ");
        //     }
        //     bw.write("\n");
            

        // bw.flush();
        // bw.close();
        // bf.close();
        }

}

// 제출한게 문제가 아니라 난 큐를 쓸줄 모르는데,,, 라이브러리도 외워야하고,,