/*2. Write a code to mask a given string.

  for e.g 

    SABBIR POONAWALA
    SAXXXX POXXXXXXX

*/
import java.io.*;
import java.util.*;

class Main{
    

public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String data= sc.nextLine();
 
        String[] arr=data.split(" ");
        
        for(String a : arr)
        {
        char ch[]=new char[a.length()];
        for(int i=0;i<a.length();i++)
        {
            ch[i]=a.charAt(i);
            if(i!=0 && i!=1)
            {
                ch[i]='X';
            }
            System.out.print(ch[i]);
        } 
        System.out.print(" ");
           
         }
    }
}