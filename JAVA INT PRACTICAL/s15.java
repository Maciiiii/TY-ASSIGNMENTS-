
import java.io.*;
import java.util.*;

interface sqr {
	int calculate(int x);
}

class setA4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter number: ");
		int n = sc.nextInt();

		// Lambda expression to define the calculate method
		sqr s = (int x) -> x * x ;

		int ans = s.calculate(n);
		System.out.println("\n squre of < " + n + " > is : " + ans);
	}
}