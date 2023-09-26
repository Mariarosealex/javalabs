import java.util.Scanner;
public class SumofPositiveNos {
public static void main(String []args)
{
	int num,sum=0;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("Enter a number:");
		num=sc.nextInt();
		if(num>0)
		sum=sum+num;
	}while(num>0);
	System.out.println("Sum of positive numbers is "+sum);
}
}
