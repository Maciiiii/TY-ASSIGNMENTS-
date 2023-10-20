abstract class Bank
{
   abstract void getbalance();
   
}
class Bank1 extends Bank
{
    int dep=100;
  public void getbalance()
  {
     System.out.println("The balance in bank1: "+dep);
     System.out.println("method getbal of Class Bank1");
  }
}
class Bank2 extends Bank
{
   int dep=150;
  public void getbalance()
  {
     System.out.println("The balance in bank2: "+dep);
     System.out.println("method getbal of Class Bank2");
  }
}
class Bank3 extends Bank
{
    int dep=200;
  public void getbalance()
  {
     System.out.println("The balance in bank3: "+dep);
     System.out.println("method getbal of Class Bank3");
  }
}
class slip21
{
  public static void main(String args[])
  {
     Bank1 obj1 = new Bank1();
     Bank2 obj2 = new Bank2();
     Bank3 obj3 = new Bank3();
     //All classes can access the method of class A
     obj1.getbalance();
     obj2.getbalance();
     obj3.getbalance();
  }
}