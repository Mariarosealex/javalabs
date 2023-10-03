import java.util.Scanner;
public class Palindrome {
public static void main(String [] args)
{
	Scanner sc=new Scanner(System.in);
	String word=new String ();
	System.out.println("Enter a string:");
	word=sc.next();
	boolean value=isPalindrome(word);
	if(value) {
		System.out.println(word+"\tis palindrome");
	}
	else {
		System.out.println(word+"\tis not palindrome");
	}

}	
		static boolean isPalindrome(String word){
	
			char [] wordTwo =word.toCharArray();
			int length =word.length();
			for(int i=0;i<length/2;i++) {
				if (wordTwo[i]!=wordTwo[length-i-1]){
					return false;
				}
				}
			return true;
	}	
}

