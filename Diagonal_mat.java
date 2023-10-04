package javalabs;
import java.util.Scanner;
public class Diagonal_mat {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.println("Enter row and column size");
		row=sc.nextInt();
		col=sc.nextInt();
		int [][]mat=new int[row][col];
		System.out.println("Enter elements of the array:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					mat[i][j]=0;
				}
				else if(j==col-i-1) {
					mat[i][j]=0;
				}
			}
		}
		System.out.println("Needed array is");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
