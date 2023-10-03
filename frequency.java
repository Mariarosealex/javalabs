import java.util.Scanner;
public class frequency {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		String word=new String();
		System.out.println("Enter a string:");
		word=sc.nextLine();
		word=word.toLowerCase();
		char [] wordTwo =word.toCharArray();
		System.out.println("Enter the character to be searched:");
		String letter =sc.next();
		letter=letter.toLowerCase();
		char [] letterTwo = letter.toCharArray();
		int len=word.length();
		int value=frequency(letterTwo,wordTwo,len);
		System.out.println("No of occurences of given character "+value);
		
	}
	static int frequency(char [] letterTwo,char [] word,int len){
		int count=0;
		for(int i=0;i<len;i++) {
			if(word[i]==letterTwo[0]) {
				count++;
			}
		}
		return count;
		
		
		
	}

}
