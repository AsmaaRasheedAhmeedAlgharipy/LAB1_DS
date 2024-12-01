public class R3 {

        public static boolean isMultiple(long n, long m) {
            return n % m == 0;
        }
    public static void main(String[] args) {
        long n = 47;
        long m = 5;

        boolean isMultiple = isMultiple(n, m);

        if (isMultiple) {
            System.out.println(n + " is a multiple of " + m);
        } else {
            System.out.println(n + " is not a multiple of " + m);
        }
    }
    }

