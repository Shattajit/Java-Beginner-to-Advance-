import java.util.Scanner;

public class Methods {

    int squere(int val){

        return val*val;
    }

    static int squere2(int val){

        System.out.println("Static is amazing");

        return val*val;
    }

    public static void main(String[] args) {

        Methods obj = new Methods();

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println("This is non_static method calling:\n"+obj.squere(n));
        System.out.println("This is static method calling:\n"+Methods.squere2(n+1));

    }
}
