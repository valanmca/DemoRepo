
import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Employee {
   int id;
   String name;
   float salary;

   Employee(int id, String name, float salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
   }

  void display() {
     System.out.println("Employee ID : " + id);
     System.out.println("Employee Name : " + name);
     System.out.println("Employee Salary : " + salary);
  }
}
public class MyClass {
   public static void main(String args[]) {
     Employee emp1 = new Employee(101, "Valan", 2000.0f);
     emp1.display();

     Employee emp2 = new Employee(102, "Arasu", 3000.0f);
     emp2.display();
  }
}