import java.util.Scanner;
class A
{
	int id,roll;
        String name;
	A()
	{
	  Scanner sc = new Scanner(System.in);
          System.out.println("Enter id");
	  id= sc.nextInt();
	  System.out.println("Enter roll");
	  roll= sc.nextInt();
	  System.out.println("Enter name");
          name = sc.next();

	}
        void display(){
         System.out.println("id"+id);
 	  System.out.println(" roll"+roll);
	 System.out.println("name"+name);
	}
    
	
}
class Dev extends A
{
	Dev()
        {}
}
class B extends A
{
    B()
	{}
}
class DDD
{
  public static void main(String args[])
  {
     A a = new A();
     a.display();
     Dev d = new Dev();
     d.display();
     B b = new B();
     b.display();
}}
     