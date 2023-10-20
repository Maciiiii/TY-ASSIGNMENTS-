
abstract class Bank {
	abstract int getbalance();
}
class Bank1 extends Bank {
	int depoA = 100;
	int  getbalance() {
		return depoA;
	}
}
class Bank2 extends Bank {
	int depoB = 150;
	int getbalance() {
		return depoB;
	}
}
class Bank3 extends Bank {
	int depoC = 200;
	int getbalance() {
		return depoC;
	}
}

class mk {
	public static void main(String args[]) {
		Bank1 obj1 = new Bank1();
		Bank2 obj2 = new Bank2();
		Bank3 obj3 = new Bank3();
		//All classes can access the method of class A
		System.out.print(" \nBalance of A is :  " +  obj1.getbalance());
		System.out.print(" \nBalance of B is :  " +  obj2.getbalance());
		System.out.print(" \nBalance of C  is :  " +  obj3.getbalance());



	}
}
