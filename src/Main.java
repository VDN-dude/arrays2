import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[10][5];
        int first = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = first++;
            }
        }
        System.out.println(Arrays.deepToString(arr));

        int[][] triangle = new int[5][5];
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                if (j <= i) {
                    triangle[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(triangle[i]));
        }
        int[][] stairs = new int[5][5];
        for (int i = 0; i < stairs.length; i++) {
            for (int j = 0; j < stairs[i].length; j++) {
                if (j <= i) {
                    stairs[i][j] = 1;
                    System.out.print(stairs[i][j]);
                }
            }
            System.out.println(" ");
        }
    }
}
