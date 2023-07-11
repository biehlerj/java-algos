package fibonacci;

/**
 * Finds the nth number in the fibonacci sequence
 * 
 * @author Jacob Biehler (https://github.com/biehlerj)
 */
public class fibonacci {
    /**
     * Code to find the nth fibonacci
     * 
     * @param n the depth of the fibonacci sequence to find
     * @return the fibonacci number at the nth position
     */
    static int fib(int n) {
        int f[][] = new int[][] { { 1, 1 }, { 1, 0 } };
        if (n == 0)
            return 0;
        power(f, n - 1);

        return f[0][0];
    }

    /**
     * Multiply two matrices
     * 
     * @param f first matrix
     * @param m second matrix
     */
    static void multiply(int f[][], int m[][]) {
        int x = f[0][0] * m[0][0] + f[0][1] * m[1][0];
        int y = f[0][0] * m[0][1] + f[0][1] * m[1][1];
        int z = f[1][0] * m[0][0] + f[1][1] * m[1][0];
        int w = f[1][0] * m[0][1] + f[1][1] * m[1][1];

        f[0][0] = x;
        f[0][1] = y;
        f[1][0] = z;
        f[1][1] = w;
    }

    /**
     * Finds the power of n in a matrix
     * 
     * @param f matrix to use
     * @param n the number find the power of
     */
    static void power(int f[][], int n) {
        if (n == 0 || n == 1)
            return;
        int m[][] = new int[][] { { 1, 1 }, { 1, 0 } };

        power(f, n / 2);
        multiply(f, f);

        if (n % 2 != 0)
            multiply(f, m);
    }

    // Driver code
    public static void main(String[] args) {
        int n = 9;
        System.out.println(fib(n));
    }
}