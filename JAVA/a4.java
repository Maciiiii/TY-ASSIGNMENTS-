

import java.io.*;
import java.util.*;

interface Square {
    int calculate(int x);
}

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number: ");
        int n = sc.nextInt();

        // Lambda expression to define the calculate method
        Square s = (int x) -> x * x * x;

        int ans = s.calculate(n);
        System.out.println(ans);
    }
}
