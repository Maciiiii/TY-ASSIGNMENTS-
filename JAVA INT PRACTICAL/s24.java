

import java.util.*;
import java.io.*;

class Employee
{
      String nm;
      int id;
      float sal;
      void accept()
      {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter id : ");
            id=s.nextInt();
            System.out.print("Enter Name: ");
            nm=s.next();
            System.out.print("Enter salary : ");
            sal=s.nextFloat();
      }
      
      float getsalary()
      {
            
            return sal;
      }
}

class Manager extends Employee
{    
      int ta,hr;
      float s1;
   
      float getsalary()
      {
            super.accept();
            s1=super.getsalary();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter travelling allownces : ");
            ta=sc.nextInt();
            System.out.print("Enter house rent : ");
            hr=sc.nextInt();
            System.out.println("Salary after adding="+(s1+ta+hr));
            return s1+ta+hr;
      }
      
       void display()
      {
            float a=getsalary();
        }
}

class Man_sal
{
      public static void main(String a[])
      {
            Manager ob=new Manager();
            ob.display();
      }
}    
