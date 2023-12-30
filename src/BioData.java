import java.util.Scanner;

public class BioData {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int val = input.nextInt();
        double val1 = input.nextDouble();
        String s = input.nextLine();
        double[] ar = new double[5];
        int[][] mat = new int[5][5];

        System.out.println("the value is:  "+val);
        System.out.println("the double value is:  "+val1);
        System.out.println("the string is:  "+s);

        for(int i=0;i<5;++i){
            ar[i] = input.nextDouble();
        }
        for(int i=0;i<5;++i){
            System.out.print(ar[i] + " ");
        }
        for(int i=0;i<5;++i){

            for(int j=0;j<5;++j){

                mat[i][j] = input.nextInt();
            }
        }
        System.out.println();

        for(int i=0;i<5;++i){

            for(int j=0;j<5;++j){

                mat[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<5;++i){

            for(int j=0;j<5;++j){

                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
