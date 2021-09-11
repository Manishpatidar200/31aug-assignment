/*1.  Replace a character a with e in following string without using inbuilt method.

  Halo

  Replace character at 3rd index pos in upper case.
*/
import java.io.*;
class Main{
    

public static void main (String[] args) 
    {
        String data="Halo";
        int length=data.length();
        char[] ch = new char[data.length()];
        for (int i = 0; i < length; i++) 
        {
            ch[i] = data.charAt(i);
            if(ch[i]=='a')
            {
                ch[i]='e';
            }
            if(i==2)
            {
                int ascii=(int)ch[i];
            
                ascii= ascii - 32;
                ch[i] = (char)ascii;
            }
            System.out.print(ch[i]);
        }
        
    }
}