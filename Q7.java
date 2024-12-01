import java.util.Scanner;

public class Q7 {
    public static class Student {
        int ID;
        String name ;
        String major;
        public Student(int id, String name, String major) {
            this.ID = ID;
            this.name = name;
            this.major = major;
        }

        public int getId() {
            return ID;
        }

        public void setId(int id) {
            this.ID= ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }
        @Override
        public String toString() {
            return "Student{" + "id=" + ID + ", name='" + name + '\'' + ", major='" + major + '\'' + '}';
        }
    }

    public static void main(String[] args) {

            Scanner in= new Scanner(System.in);
            Student array[]= new Student[5];
        System.out.println("Enter id number and name and major for 5 Students:");
            for (int i = 0; i <array.length ; i++) {
                array[i]=new Student(in.nextInt(), in.next() , in.next());
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
    }
}
