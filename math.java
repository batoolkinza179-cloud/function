package function;

public class math {
    static void main(String[] args) {
        int a = 25;
        int b = 24;
        evenodd(a);
        evenodd(b);

    }

    public static void evenodd(int x) {
        int r = x % 2;
        if (r == 0) {
            System.out.println("even");
        }
            else
                System.out.println("odd");
            }
        }

