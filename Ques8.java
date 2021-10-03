/*
    Implement multiple inheritance with default method inside interface.
 */

public class Ques8 {
    public static void main(String[] args) {
        implementor1 obj = new implementor1();
        obj.display();
    }
}

interface MyInterface_1{
    public static int num = 100;
    public default void display() {
        System.out.println("display method of MyInterface1");
    }
}
interface MyInterface_2{
    public static int num = 1000;
    public default void display() {
        System.out.println("display method of MyInterface2");
    }
}
class implementor1 implements MyInterface_1, MyInterface_2{
    public void display() {
        MyInterface_1.super.display();
        MyInterface_2.super.display();
    }
}


