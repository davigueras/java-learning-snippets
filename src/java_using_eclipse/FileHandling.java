package java_using_eclipse;
import java.io.File;
import java.io.IOException;


public class FileHandling {
	
	public static void main(String[] args) {


		try {
			File file = new File("/Users/David/dv-dev/eclipse-workspace/java-learning-snippets/testfile.txt");
			
			boolean fvar = file.createNewFile();
			if (fvar) {
				System.out.println("file created ok");
			} else {
				System.out.println("file already present");
			}
		} 
		catch (IOException e) {
			System.out.println("exception occurred");
			e.printStackTrace();
		}		
		
	
		
	
	}
}
