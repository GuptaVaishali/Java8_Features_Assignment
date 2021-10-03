/*
    Create and access default and static method of an interface.
 */

public class Ques6 {
    public static void main(String[] args) {
         Implementor obj = new Implementor();

        //calling the default method of interface
        obj.newDefaultMethod();

        //calling the static method of interface
        MyInterface.newStaticMethod();

        //calling the abstract method of interface
        obj.existingMethod("existing abstract method");
    }
}

interface MyInterface{
    //default method
    default void newDefaultMethod(){
        System.out.println("Newly added default method");
    }

    //static method
    static void newStaticMethod(){
        System.out.println("Newly added static method");
    }

    /* Already existing public and abstract method
     * We must need to implement this method in
     * implementation classes.
     */
    void existingMethod(String str);
}

class Implementor implements MyInterface{
    // implementing abstract method
    public void existingMethod(String str){
        System.out.println("String is: "+str);
    }
}