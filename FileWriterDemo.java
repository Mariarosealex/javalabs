
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {
	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("input.txt");
			String data = new String();
			data = "Hello";
			fr.write(data);
			fr.close();
			System.out.println("The file is written successfully");
		} catch (IOException e) {
			System.out.println("An IO Exception has occured.");
			e.printStackTrace();
		}
	}
}