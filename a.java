class A
{
  int a = 100;
  int b = 200;
  void m1()
  {
	System.out.println("Hi"+(a+b));
  }
  void m2(){}
}
class B extends A
{
  int c = 50;
  int a = 1000;
  int d = 10;
  void m2(int a)
  {
    System.out.println("Hi B:"+(a+b));
    System.out.println("Hi B super:"+(super.a+b));
    System.out.println("Hi B this:"+(this.a+b));
  }
}
class C
{
   public static void main(String args[])
   {
     A a = new A();
     a.m1();
     a.m2();
     B b  = new B();
     b.m2(20);
   }
}


   
   