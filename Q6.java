import java.util.Scanner;

public class Q6 {
    public void arraymethod(){
        Scanner o= new Scanner(System.in);
        System.out.println("Enter 5 numbers :");
        int arrayinp[] = new int[5];
        for (int i = 0; i <  arrayinp.length; i++) {
            arrayinp[i] =o.nextInt();
        }
        for (int i = 0; i <  arrayinp.length; i++) {
            System.out.print( arrayinp[i] + " ");
        }

    }
    public static void main(String[] args) {
        Q6 obj=new Q6();
        obj.arraymethod();
    }
}
