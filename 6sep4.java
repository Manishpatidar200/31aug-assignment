/*Create a class Student with following attributes
   
   Student
 =============
   rollNo int
   studentFirstName String
   studentLastName  String
   studentAge int
 
 Override toString(),equals(),hashCode() without using tool.

*/
 import java.util.*;
 import java.io.*;
 class Main
     {
  public static void main (String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        int roll=sc.nextInt();
        String studentFirstName= sc.next();
        String studentLastName=sc.next();
        int age= sc.nextInt();
        
         if(studentFirstName.equals(studentLastName))
          {    
            System.out.println("Student first name and last name are equal, and their respective hashvalues are:") ;
            System.out.println( studentFirstName.hashCode() + " & " + studentLastName.hashCode());  
          
          }  
         else
         {    
            System.out.println("Student first name and last name are not equal, and their respective hashvalues are:"); 
            System.out.println( studentFirstName.hashCode() + " & " + studentLastName.hashCode());  
          
         }  
         //String age1= age.toString();
         System.out.println("String representation of age is "+Integer.toString(age)
         +" and  roll no. is "+Integer.toString(roll));


     }
 }
