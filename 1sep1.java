/******************************************************************************

1. In a String find and replace a word.

  e.g Java is Object Oriented. Java is Programming Language.

 Search for a word "Java"
 Replace "Java" with "C++";

 C++ is Object Oriented. C++ is Programming Language.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    
    	String string=sc.nextLine();
    	
    	String find_word=sc.next();
    	String replace_word=sc.next();
        String replaceString=string.replace(find_word,replace_word);
        System.out.println(replaceString);  
	}
}
