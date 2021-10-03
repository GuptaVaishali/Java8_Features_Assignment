/*
    Override the default method of the interface.
 */

public class Ques7 {
    public static void main(String[] args) {
        ImplementorClass obj = new ImplementorClass();

        //calling the default method of interface
        obj.newDefaultMethod();
    }
}

interface MyInterface1{
    //default method
    default void newDefaultMethod(){
        System.out.println("Newly added default method");
    }
}

class ImplementorClass implements MyInterface1{

    //overriding default method
    public void newDefaultMethod(){
        System.out.println("Overriding default method of interface");
    }
}
