package function;

public class callstak {
    public static void D(){
        float d = 40.5f;
        System.out.println("in method d");
    }
    public static void C(){
        double c = 30.5;
        System.out.println("in method  c");
    }
    public static void B(){
        int b=20;
        C();
        System.out.println("in method b");
    }
    public static void A(){
        int a =10;
        B();
        System.out.println("in method a");
    }

    static void main(String[] args) {
        A();
        D();
    }
}
