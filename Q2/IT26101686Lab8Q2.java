public class IT26101686Lab8Q2 {
    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Add arrays A and B and store in C
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Display array C
        System.out.println("Contents of Array C:");
        for (int i = 0; i < C.length; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}