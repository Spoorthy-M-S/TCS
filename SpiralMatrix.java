package TCS;
public class SpiralMatrix {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int p1 = 0;
        int p2 = 0;
        int p3 = arr[0].length - 1;
        int p4 = arr.length - 1;
        int n = arr.length;
        int m = arr[0].length;
        while (p1 <= p3 && p2 <= p4) {
            for (int i = p1; i <= p3; i++) {
                System.out.print(arr[p2][i]+" ");
            }
            p2++;
            for (int i = p2; i <= p4; i++) {
                System.out.print(arr[i][p3]+" ");
            }
            p3--;

            if (p2 <= p4) {
                for (int i = p3; i >= p1; i--) {
                    System.out.print(arr[p4][i]+" ");
                }
            }
            p4--;
            if (p1 <= p3) {
                for (int i = p4; i >= p2; i--) {
                    System.out.print(arr[i][p1]+" ");
                }
            }
            p1++;
        }
    }

}
