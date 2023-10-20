
import java.io.*;
import java.util.*;

interface cube {
	int calculate(int x);
}

class setA4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter number: ");
		int n = sc.nextInt();

		// Lambda expression to define the calculate method
		cube s = (int x) -> x * x * x;

		int ans = s.calculate(n);
		System.out.println("\n cube of < " + n + " > is : " + ans);
	}
}