import java.io.*;
import java.util.*;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj = new File("/Users/shalinipriyar/Desktop/Simplilearn/Simplilearn.txt");
			myObj.createNewFile();
			
			FileWriter myWrite = new FileWriter("/Users/shalinipriyar/Desktop/Simplilearn/Simplilearn.txt");
			myWrite.write("Simplilearn courses: ");
			myWrite.close();
			
			System.out.println("Before append: ");
			Scanner myRead = new Scanner(myObj);
			while(myRead.hasNextLine()) {
				String data = myRead.nextLine();
				System.out.println(data);
			}
			myRead.close();
			
			FileWriter myAppend = new FileWriter("/Users/shalinipriyar/Desktop/Simplilearn/Simplilearn.txt", true);
			BufferedWriter bw = new BufferedWriter(myAppend);
			bw.write("Java, C, ROR");
			bw.newLine();
			bw.close();
			
			System.out.println();
			System.out.println("After Append: ");
			
			File myObj2 = new File("/Users/shalinipriyar/Desktop/Simplilearn/Simplilearn.txt");
			Scanner myRead1 = new Scanner(myObj2);
			while(myRead1.hasNextLine()) {
				String data = myRead1.nextLine();
				System.out.println(data);
			}
			myRead.close();

		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
