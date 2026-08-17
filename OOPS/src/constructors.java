public class constructors {

    public static class Car{
        int seats;
        String name;
        double length;
        Car(){//default constructor

        }
        Car(int x, String s , double d){//parameterized constructor
            seats =x;
            name = s;
            length =d;
        }
        void print(){
            System.out.println(seats+""+name+""+length+"");
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5,"Kia",3.99);
        c1.print();

    }
}
