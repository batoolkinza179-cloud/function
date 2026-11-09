package function;

public class passingArguments {
    public static void greet(String name){
        System.out.println("good morning" + name);
    }
    static void main(String[] args) {
        greet("ashraf");
        sum(2,3);
    }
    public static  void sum(int a, int b){
        System.out.println(a+b);
    }
    }
