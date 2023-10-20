import java.io.*;
import java.util.*;

class file_copy

{
	public static void main(String[] args) throws IOException {

		Scanner sc1 = new Scanner(System.in);
		System.out.print("\n Enter first file name : ");
		String f = sc1.next();
		System.out.print("\n Enter second file name : ");
		String f1 = sc1.next();

		File k = new File(f);
		if (k.exists()) {
			System.out.println(" \n ----- File exists.------ \n  ");
		} else {
			System.out.println("File does not exist.");
		}

		FileReader f3 = new FileReader(f);
		FileWriter f4 = new FileWriter(f1);
		Scanner sc = new Scanner(f);
		String ch;
		while (sc.hasNext()) {
			ch = sc.nextLine();
			f4.write(ch);
		}
		System.out.println(" Copy Finished......");
		f3.close();
		f4.close();
	}

}


