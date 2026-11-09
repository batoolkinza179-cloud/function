package function;

import java.util.Scanner;

public class GCD {
    static int gcd(int a,int b){
        while (b!=0){
            int temp =b;
            b=a%b;
            a= temp;
        }
        return a;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y = sc.nextInt();
        int result = gcd(x,y);
        System.out.println("gcd ="+result);
    }
}
