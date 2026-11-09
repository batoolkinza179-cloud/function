package function;

import java.util.Scanner;

public class solution {
    static void main(String[] args) {
        int positive =0, negative=0, zero=0;
        System.out.println("press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n==1){
            System.out.println("enter your number: ");
            int no = sc.nextInt();
            if(no >0){
                positive++;

            } else if (no<0) {
                negative++;

            }
            else {
                zero++;

            }
            System.out.println("press 1 to continue and 0 to stop");
            n = sc.nextInt();
            System.out.println("positive"+positive);
            System.out.println("negative"+negative);
            System.out.println("zero"+zero);
        }
    }
}
