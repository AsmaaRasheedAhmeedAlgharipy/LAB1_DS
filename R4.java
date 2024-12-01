public class R4 {
    public static boolean isEven(int i) {
        return i==0 || (i & 1) == 0;}
    public static void main(String[] args) {
        int number = 10;
        boolean isEven = isEven(number);

        if (isEven) {
            System.out.println(number + " true the number is even.");
        } else {
            System.out.println(number + " false the number is odd.");
        }
    }
}
