import java.util.Scanner;
public class Marks {
public static void main(String [] args)
{
	int marks,grade;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks:");
	marks=sc.nextInt();
	if(marks<=100&&marks>90)
	{
		grade=10;
		System.out.println("Grade ="+grade);
	}
	else if(marks<90&&marks>80)
	{
		grade=8;
		System.out.println("Grade ="+grade);
	}
	else if(marks<80&&marks>70)
	{
		grade=7;
		System.out.println("Grade ="+grade);
	}
	else if(marks<70&&marks>60)
	{
		grade=6;
		System.out.println("Grade ="+grade);
	}
	else if(marks<60&&marks>50)
	{
		grade=5;
		System.out.println("Grade ="+grade);
	}
	else
		System.out.println("Fail");
}
}
