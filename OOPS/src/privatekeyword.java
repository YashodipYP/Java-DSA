class students{
    String name;
    private int rno;
    double cgpa;
}
public class privatekeyword {

    public static void main(String[] args) {
        students s1 = new students();
    //     s1.rno;   due to private access cant be changed
        s1.cgpa = 9.0;
        s1.name = "Y";


    }
}
