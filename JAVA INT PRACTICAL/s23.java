

import java.io.*;
import java.util.*;



class item {
    int id, pri;
    String name;
    public static int objectCount = 0;

    item() {
        id = 0;
        name = null;
        pri = 0;
    }

    item(int id, String name, int pri) {
        this.id = id;
        this.name = name;
        this.pri =pri;
        objectCount++;
    }

    public void display() {
        System.out.print("\n" + id + "\t" + name + "\t" + pri);
    }
}

class Mk{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of Items ");
        int n = sc.nextInt();
        item []  it = new item[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter item id: ");
            int r = sc.nextInt();
            System.out.print("Enter item name: ");
            String nm = sc.next();
            System.out.print("Enter item cost: ");
            int c = sc.nextInt();

            it[i] = new item(r, nm, c);
        }

        System.out.print("\nIt_id\tIt_name\tIt_cost");
        for (int i = 0; i < n; i++)
            it[i].display();
        
        System.out.print("\n\nObject count: " + item.objectCount);
    }
}