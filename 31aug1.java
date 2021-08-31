import java.util.*;
class Solution
{
public Static void main(String gg[])
{
	Scanner sc=new Scanner(System.in);
	int rev=0;
	int a= sc.nextInt();
	System.out.println("Reverse number is....");
	int rem = a%10;
     rev= rev* 10 + rem;
	 a=a/10;
	 System.out.println(rev);
	
}
}