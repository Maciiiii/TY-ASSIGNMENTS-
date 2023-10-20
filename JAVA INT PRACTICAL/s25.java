import java.io.File;
import java.util.Scanner;

class FileP {
	public static void main(String args[ ]) {

		Scanner sc1 = new Scanner(System.in);
		System.out.print("\n Enter file name : ");
		String fname = sc1.next();
		File f1 = new File(fname);
		System.out.println("File Name: " + f1.getName());
		f1.setWritable(false);
		System.out.println(f1.exists() ? "File exists" : "File does not exist");
		System.out.println(f1.canWrite() ? "File is writeable" : "File is not writeable");
		System.out.println(f1.canRead() ? "File is readable" : "File is not readable");
		System.out.println("File size: " + f1.length() + " Bytes");

		String fileName = f1.toString();
		int index = fileName.lastIndexOf('.');
		if (index > 0) {
		} else {
		}
		String type = fileName.substring(index + 1);
		System.out.println("File type is " + type);

	}
}