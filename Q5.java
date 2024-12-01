public class Q5 {
    public void ArrayM() {
        int [] arraynum={10,7,2,5,3};
        String [] arrayname={"Asmaa","Afnan","ala","Nora","Mawadah"};
        for (int i=0;i< arraynum.length;i++) {
            System.out.println(arraynum[i]+" :"+arrayname[i]);}
    }
    public static void main(String[] args) {
        Q5 obj=new Q5();
        obj.ArrayM();
    }
}
