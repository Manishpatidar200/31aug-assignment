// Check if given string starts with A and Endwith t.

import java.io.*;
import java.util.*;

class Main{
    

public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String data= sc.next();
        
        char arr[]=new char[data.length()];
        for(int i=0;i<data.length();i++)
        {
            arr[i]=data.charAt(i);
        }   
            if ((arr[0]=='A'||arr[0]=='a') && (arr[data.length()-1]=='T' || arr[data.length()-1]=='t'))
            {
                
                     System.out.println("Yes");
              }
                 else 
            {
                System.out.println("NO");
                
            }
        }
}