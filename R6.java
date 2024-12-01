public class R6 {
    public static int sumOfOddIntegers(int n) {
        int sum = 0;
        for (int i=1;i<=n;i+=2){
           sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 9;
        int sum = sumOfOddIntegers(n);
        System.out.println("Sum of odd integers up to " + n + ": " + sum);
    }
}
