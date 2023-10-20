import java.io.*;
import java.util.*;

class  file_cnt

{
	public static void main(String[] args) throws IOException {

		String file = args[0];
		File k = new File(file);
		if (k.exists()) {
			System.out.println(" \n ----- File exists.------ \n  ");
		} else {
			System.out.println("File does not exist.");
		}
		String line;
		int wcount = 0;
		int lc = 0;
		FileReader f = new FileReader(file);
		Scanner sc = new Scanner(f);
		BufferedReader br = new BufferedReader(f);
		while ((line = br.readLine()) != null) {
			//Splits each line into words
			String words[] = line.split(" ");
			wcount = wcount + words.length;

		}
		// line count
		while (sc.hasNextLine()) {
			sc.nextLine();
			lc++;
		}

		System.out.println("Number of words present in given file: " + wcount);
		System.out.println("Total Number of Lines: " + lc);

		br.close();
	}

}


