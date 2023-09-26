import java.util.Scanner;
public class attendance {
public static void main(String [] args)
{
	int attendance,marks;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter attendance:");
	attendance= sc.nextInt();
	if(attendance>90&&attendance<=100)
	{
		marks=10;
	    System.out.println("Marks is "+marks);
	}
	else if(attendance>80&&attendance<90)
	{
		marks=8;
	    System.out.println("Marks is "+marks);
   }
	else if(attendance>70&&attendance<80)
	{
		marks=7;
		System.out.println("Marks is "+marks);
	}
	else if(attendance>60&&attendance<70)
	{
		marks=6;
		System.out.println("Marks is "+marks);
	}
	else if(attendance>50&&attendance<60)
	{
		marks=5;
		System.out.println("Marks is "+marks);
	}
	else 
		System.out.println("Attendance not enough");
		
}
}
