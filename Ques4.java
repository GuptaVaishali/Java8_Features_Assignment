/*
    Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
    and get the instance of the Class using constructor reference
 */

public class Ques4 {
    public static void main(String[] args) {
        EmployeeInstances employee = Employee::new;
        Employee emp= employee.getEmployee("vaishali", 24,"Faridabad");
        System.out.println(emp);
    }
}

class Employee{
    String name;
    int age;
    String city;

    Employee(){}

    Employee(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

interface EmployeeInstances{
    Employee getEmployee(String name,int age,String city);
}
