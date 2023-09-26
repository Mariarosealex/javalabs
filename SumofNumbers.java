/*
 * File        : Sum of Numbers    
 * Description : Finding sum of two numbers
 * Author      : Maria
 * Version     : 1.0
 * Date        : 26/09/2023
 */
import java.util.Scanner;
public class SumofNumbers {
public static void main(String [] args)
{
	int num1,num2,sum;
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter two numbers:");
	num1=sc.nextInt();
	num2=sc.nextInt();
	sum=num1+num2;
	System.out.println("Sum of numbers is "+sum);

}
}
