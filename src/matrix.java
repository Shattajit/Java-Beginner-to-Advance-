import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] mat = new int[n][n];

        for(int i=0;i<n;++i){

            for(int j=0;j<n;++j){

                mat[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<n;++i){

            for(int j=0;j<n;++j){

                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
