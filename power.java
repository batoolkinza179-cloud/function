package function;

import java.util.Scanner;

public class power {
    static long power(int x,int n){
        long result = 1;
        for (int i = 1; i <=n ; i++) {
            result = result *x;


        }
        return result;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        long ans=power(x,n);
        System.out.println(ans);
    }
}
