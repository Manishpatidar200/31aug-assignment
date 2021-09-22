/* Create an interface with functionality of calculating simple interest,compound interest on principal amount based on given interest rates.

Provide implementation of these functionality in a class
*/
//package CalculateCIandSI;

import java.util.Scanner;

interface Calculate
{
	public double simpleIntrest(double principle, double rate,double time);

	public double compoundIntrest(double principle, double rate,double time);
}
public class CalculateSIandCI implements Calculate {

	@Override
	public double simpleIntrest(double principle, double rate,double time)
	{
		double si= (principle *rate* time)/100;
		return si;
	}
	@Override
	public double compoundIntrest(double principle, double rate, double time)
	{
		double amount=  principle *(Math.pow((1 + rate / 100), time));
		double ci= amount - principle;
		return ci;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateSIandCI c=new CalculateSIandCI();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principle amount..");
        double principle=sc.nextDouble();
        
        System.out.println("Enter  rate..");
        double rate=sc.nextDouble();
        
        System.out.println("Enter time..");
        double time=sc.nextDouble();
        
        System.out.println("Simple intrest is...."+ c.simpleIntrest(principle, rate, time) );
        System.out.println("Compound intrest is..."+ c.compoundIntrest(principle, rate, time));
        
        
	}

}
