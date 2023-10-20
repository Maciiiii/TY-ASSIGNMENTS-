import java.io.*;
import java.util.*;


class Mul_mat {

	public static void main(String[] args) {
		int n, i, j, op = 1, m, p, q, k;

		Scanner sc = new Scanner(System.in);
		System.out.println(" \nEnter rows for matrix : ");
		m = sc.nextInt();

		System.out.println(" \n Enter cols for matrix : ");
		n = sc.nextInt();

		int [][] a = new int[m][n];

		// initialise array a with 0
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				a[i][j] = 0;

		//accepting matrix from user
		System.out.println(" \n Enter  matrix  : ");
		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				a[i][j] =   sc.nextInt();

		//display 2D array matrix
		System.out.println(" Matrix is : \n");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("   " + a[i][j] + "   ");
			}
			System.out.println(" ");
		}
		int sum = 0;
		System.out.println(" \n Digonal Elements are  : \n");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (i == j) {
					sum += a[i][j];
					System.out.print("   " + a[i][j] + "    \n");
				}
			}
			System.out.println(" ");
		}

		System.out.println(" \n Sum of Digonal Elements  is  : " + sum);

	}
}
