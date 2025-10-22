package controlstructures;

public class HeavyComputation {
    static { System.loadLibrary("heavy"); }

    // Pure Java version (still 2D)
    public double[][] multiplyMatricesJava(double[][] a, double[][] b) {
        int n = a.length;
        double[][] result = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    // Native method using 1D arrays
    public native double[] multiplyMatricesNative(double[] a, double[] b, int n);

    // Benchmark helper
    public void benchmark(int size) {
        double[][] a2D = new double[size][size];
        double[][] b2D = new double[size][size];
        double[] a = new double[size * size];
        double[] b = new double[size * size];

        // Fill matrices
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                double valA = Math.random();
                double valB = Math.random();
                a2D[i][j] = valA;
                b2D[i][j] = valB;
                a[i * size + j] = valA;
                b[i * size + j] = valB;
            }

        // Java version
        long start = System.nanoTime();
        multiplyMatricesJava(a2D, b2D);
        long end = System.nanoTime();
        System.out.println("Java: " + (end - start)/1e6 + " ms");

        // C++ version
        start = System.nanoTime();
        multiplyMatricesNative(a, b, size);
        end = System.nanoTime();
        System.out.println("C++ via JNI: " + (end - start)/1e6 + " ms");
    }

    public static void main(String[] args) {
        new HeavyComputation().benchmark(500);
    }
}
