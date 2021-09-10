//From an array find 3rd highest value.

import java.util.*;
class Main
{
	public static void main(String gg[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a= s.nextInt();
		int temp;
		int arr[]= new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
			
		}
		for(int j=0;j<a;j++)
		{
			for(int k=j+1;k<a;k++)
			{
			    if(arr[j] < arr[k])
			    {
			        temp=arr[k];
			        arr[k]=arr[j];
			        arr[j]=temp;
			    }
			}
		}
		
		    System.out.println("Third Heighest number is " + arr[2]);
		

	}
}
