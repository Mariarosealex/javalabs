import java.util.Scanner;
public class Positive {
public static void main(String []args)
{
Scanner sc= new Scanner (System.in);
int num,sum=0;
System.out.println("Enter a number :");
num=sc.nextInt();
while(num>0)
{
	sum=sum+num;
	System.out.println("Enter next number:");
	num=sc.nextInt();
}
System.out.println("Sum of positive numbers is "+sum );
}
}
