package function;

import java.util.Scanner;

public class premutation {
    public static int fact(int x){
        int xfact = 1;
        for (int i = 1; i <=x ; i++) {
            xfact *=i;

        }
        return xfact;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int npr = fact(n)/ fact(n-r);
        System.out.println(npr);
    }
}

