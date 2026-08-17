import java.util.Scanner;

public class Main {

    public static class student

    {
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+" "+cgpa+"");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        s1.name="Y";
        s1.rno = 44;
        s1.cgpa = 9.0;

        System.out.println(s1.name+ s1.rno+ s1.cgpa);
        s1.print();

    }

}