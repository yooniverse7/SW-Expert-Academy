import java.util.Scanner;

public class 삼성1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i<N; i++) {

          int number = i+1;
          StringBuilder result = new StringBuilder();
          String numbString = Integer.toString(number);
          boolean contains369 = false; // 3, 6, 9를 포함하는지 여부를 나타내는 변수

          for (int j = 0; j<numbString.length(); j++) {
            char digitChar = numbString.charAt(j);

            if(digitChar == '3' || digitChar == '6' || digitChar == '9') {

                result.append("-"); // 3, 6, 9가 포함된 경우 "-"를 누적시킴

                contains369 = true; // 포함되면 true로 변경
            }
          }

          if(!contains369) {
            arr[i] = numbString;
          }else {
            arr[i] = result.toString();
          }

        }

        for (String s : arr) {
            System.out.print(s+ " ");
        }
        sc.close();

    }
}
