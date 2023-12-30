import java.util.Scanner;

public class BioData {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int val = input.nextInt();
        double val1 = input.nextDouble();
        String s = input.nextLine();

        System.out.println("the value is:  "+val);
        System.out.println("the double value is:  "+val1);
        System.out.println("the string is:  "+s);

    }
}
