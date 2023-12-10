import java.util.*;

class loop2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        loop2 sol = new loop2();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            sol.series(a, b, n);
        }

        in.close();

    }

    void series(int a, int b, int n) {
        double sol = a;
        for (int i = 0; i < n; i++) {
            sol = sol + (Math.pow(2, i) * b);
            int ans = (int) sol;
            System.out.print(ans + " ");
        }
        System.out.println();
    }
}
