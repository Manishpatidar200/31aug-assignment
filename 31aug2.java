import java.util.*;

class Solution
{
public Static void main(String gg[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number...");
	int a= sc.nextInt();
	int reminder, result=0;
	int original=a;
	while(original !=0)
	{
		reminder= original %10;
		result= result + math.pow(reminder,3);
		original=original/10;
	}
	if(result == a)
	{
		System.out.println(" Given number is armstrong number");
	}
	else
	{
		System.out.println(" Given number is not armstrong number");
	}
	
}
}