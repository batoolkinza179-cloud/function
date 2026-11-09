package function;

import java.util.Scanner;

public class curcumfrance {
    public static double getCurcumferance(double radius){
        return 2*3.14*radius;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(getCurcumferance(r));

    }
}
