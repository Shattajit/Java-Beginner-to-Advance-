public class CallByReference {

    String name;

    void change(CallByReference r){

        r.name = "Shattajit";
    }

    public static void main(String[] args) {
        CallByReference obj = new CallByReference();

        obj.name = "Ghosh";

        System.out.println("Current name is: "+obj.name);

        obj.change(obj);

        System.out.println("Changed name: "+obj.name);
    }
}
