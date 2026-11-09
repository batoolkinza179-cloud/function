package function;
import java.util.Scanner;
public class add {
    public static int calculteSum(int a, int b) {
        int sum = a + b;
        return sum;
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculteSum(a, b);
        System.out.println("sum of 2 number is:" + sum);

    }
}
