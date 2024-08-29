package TCS;
public class PrintPattern2 {
    /*
     * PATTERN
     * 
     * Enter n:
     * 4
     * 
     * 1
     * 2*2
     * 3*3*3
     * 4*4*4*4
     * 4*4*4*4
     * 3*3*3
     * 2*2
     * 1
     */

    public static void solution1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
                if (j != i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(n - i);
                if (j != n - i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void solution(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * i; j++) {
                if (j % 2 != 0) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 != 0) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = 4;
        solution(n);
    }
}
