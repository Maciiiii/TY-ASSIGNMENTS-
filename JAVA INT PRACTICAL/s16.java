import java.io.*;
import java.util.*;


class cust {

	int pno;
	String cnm;

	cust(int pno, String cnm) {
		this.pno = pno;
		this.cnm = cnm;
		//	this.caddr = caddr;

	}
}

class depo extends cust {

	int dacno, balnc;
	depo(int pno, String cnm,  int dacno, int balnc) {
		super(pno, cnm);
		this.dacno = dacno;
		this.balnc = balnc;

	}

}

class borrwr extends depo {

	int lno, lamt;
	borrwr(int pno, String cnm, int dacno, int balnc, int lno, int lamt) {
		super(pno, cnm, dacno, balnc);
		this.lno = lno;
		this.lamt = lamt;

	}

	public void display() {
		System.out.print("\n" + pno + "\t" + cnm + "\t" + dacno + "\t" + balnc + "\t" + lno + "\t" + lamt);
	}

}

class MK {
	public static void main(String args[]) {

		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter number of cust  : ");
		int n = sc.nextInt();
		borrwr d[] = new borrwr[n];

		for (i = 0; i < n; i++) {
			System.out.print("\n Enter  p no  : ");
			int  c = sc.nextInt();
			System.out.print(" Enter cust name  ");
			String cnm = sc.next();
			System.out.print(" Enter depositor accno. : ");
			int  ac = sc.nextInt();
			System.out.print("Enter depositor  balnc :  ");
			int  db = sc.nextInt();
			System.out.print("Enter borrower loan no :    ");
			int ln  = sc.nextInt();
			System.out.print("Enter borrower loan amt :    ");
			int am  = sc.nextInt();

			d[i] = new borrwr(c, cnm, ac, db, ln, am);

		}
		System.out.print("\ncpno\tcnm\tdacno\tdbalnc\tblno\tblamt\n ");
		for (i = 0; i < n; i++)
			d[i].display();
		//  d.accept();

	}
}
