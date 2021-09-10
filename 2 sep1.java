//1. Create an array with five scores out of 100, compute the average of the scores and compute percentage.

import java.util.*;
class Main
{
 public static void main (String[] args)
 {
    Scanner sc=new Scanner(System.in);
    int arr[]= new int[5];
    int sum=0;
    for(int i=0;i<5;i++)
    {
      if(arr[i]<=100)
      {
       arr[i]=sc.nextInt(); 
       sum = sum + arr[i]; 
          
      }
     
        
    }
    int avg = sum / 5 ;
    int percent = sum * 100 / 500;
    System.out.println(avg);
    System.out.println(percent);
    
 }
}
