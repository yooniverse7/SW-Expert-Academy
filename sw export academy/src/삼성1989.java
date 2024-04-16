import java.util.Scanner;

public class 삼성1989 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] result = new int[T];

        for(int i = 0; i<T; i++) {
            result[i] = 1;
        }

        for(int i = 0; i<T; i++) {
            String test = sc.next(); //널값을 받으면 T-1개의 값만 받아들이므로 next()사용하여 해소
            char[] arr = test.toCharArray();
            char[] rra = new char[arr.length];

            for(int j = arr.length-1; j>=0; j--) { //역순정렬
                rra[arr.length-j-1] = arr[j];
            }

            for(int j = 0; j<arr.length; j++) {
                if(arr[j] != rra[j]) {
                    result[i] = 0;
                }
            }

        }

        for(int i = 0; i<T; i++) {
            System.out.println("#" + (i+1) + " " + result[i]);
        }
        sc.close();

    }
}
