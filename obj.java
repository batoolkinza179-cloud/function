package function;

public class obj {
    public void display(){
        System.out.println("method without parameters");
    }
    public void display2(int a){
        System.out.println("method with single parameter");
    }

    static void main(String[] args) {
      obj obj = new   obj();
      obj.display();
      obj.display2(24);
    }
}
