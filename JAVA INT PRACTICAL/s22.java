//buffered Reader



import java.io.*;
import java.util.*;
class stud {
	int rno;
	String nm;
	String std;
	double per;
	stud() {
		rno = 0;
		nm = "";
		std = "";
		per = 0;
	}
	stud(int rno, String nm, String std, double per) {
		this.rno = rno;
		this.nm = nm;
		this.std = std;
		this.per = per;
	}

	void display() {
		System.out.println(" Rno : " + rno + "\nName : : " + "\n Standard : " + std + "\n percentage : " + per);


	}
}
public class slip21 {
	public static void main(String[] args)throws IOException {
		//stud s = new stud();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rno  :");
		int r = Integer.parseInt(br.readLine());
		System.out.println("Enter name :");
		String n = br.readLine();
		System.out.println("Enter class :");
		String c = br.readLine();
		System.out.println("Enter per  : ");
		double p = Double.parseDouble(br.readLine());
		stud s1 = new stud(r, n, c, p);
		s1.display();
	}
}