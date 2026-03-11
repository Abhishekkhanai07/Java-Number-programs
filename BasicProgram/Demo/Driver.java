package Demo;

public class Driver {
    public static void main(String[] args) {
        
        A1 s1=new A1();

        s1.sound();

        A2 a=new A2();
        a.sound();

        A1 s2 = a;
        s2.sound();
    }
}
