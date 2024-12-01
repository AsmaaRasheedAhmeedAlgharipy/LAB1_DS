public class R7 {

        public static int sumOfSquares(int n) {
            return n * (n + 1) * (2 * n + 1) / 6;
        }
        public static void main(String[] args) {
            int n = 5;
            int sum = sumOfSquares(n);
            System.out.println("Sum of squares of integers up to " + n + ": " + sum);
        }
}

