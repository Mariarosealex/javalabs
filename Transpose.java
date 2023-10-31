import java.util.Scanner;
public class Transpose {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.println("Enter order of the matrix");
		row=sc.nextInt();
		col=sc.nextInt();
		int [][] matrix = new int[row][col];
		int [][]trans=new int[row][col];
		System.out.println("Enter elements of the matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
			}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				trans[i][j]=matrix[j][i];
				System.out.print(trans[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
