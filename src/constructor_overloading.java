import java.util.Scanner;

public class constructor_overloading {

    String name;
    int id;

    constructor_overloading(){
        System.out.println("No arguments");
    }

    constructor_overloading(String s, int val){
        name = s;
        id = val;
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }

    constructor_overloading(String s){
        name = s;
        System.out.println("Name: "+name);
        //System.out.println("Id: "+id);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int id = input.nextInt();

        constructor_overloading obj = new constructor_overloading();
        constructor_overloading obj1 = new constructor_overloading(s, id);
        constructor_overloading obj2 = new constructor_overloading(s);
    }
}
