/*
Create a variable of type String with following data,
String data="Java is Object oriented. Java is platform independent.Java is simple."
Search for word "Java" and count number of occurrences.
*/

import java.io.*;
class Main
{
public static void main(String gg[])
{
String data="Java is Object oriented. Java is platform independent. Java is simple." ; 
String str[]=data.split(" ");
String search ="Java";
int count=0;
for(int i=0;i<str.length;i++)
{
  if(search.equals(str[i]))  
  {
      count++;
  }
}
System.out.println(count);
}
}