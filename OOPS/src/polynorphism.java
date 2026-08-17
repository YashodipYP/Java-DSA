public class polynorphism {
    public static class dog{
        void speak(){
            System.out.println("bhau bahu");
        }

    }
    public static class cat{
        void speak(){
            System.out.println("meow mewo");
        }

    }
    public static class mouse{
        void speak(){
            System.out.println("wdj eiofni");
        }

    }
    public static void main(String[] args) {
        dog d = new dog();
        cat c = new cat();
        mouse m = new mouse();

        d.speak();
        c.speak();
        m.speak();

    }
}
