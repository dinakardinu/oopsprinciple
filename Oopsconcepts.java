import java.io.*;

interface Interface
{
public void hello();
}


abstract class Area
{
	public void voice()
	{
	System.out.println("in abstract class voice");
	}
}

class cat extends Area
{
	public void voice()
	{
	System.out.println("cat : Meaow Meaow");
	}

}
class dog extends Area
{
	public void voice()
	{
	System.out.println("Dog : Bow Bow");
	}

}


class Polymorphism
{
	int add(int x, int y)
	{
		return (x+y);
	}
	int add(int x, int y,int z)
	{
		return (x+y+z);
	}
	double add(double x,double y)
	{
		return x+y;
	}

}



class Encapsulation
{
	private String name,phoneno,rollno;
	void setname(String t)
	{
		name=t;
	}
	void setrollno(String t)
	{
		rollno =t;
	}
	void setphoneno(String n)
	{
		phoneno=n;
	}
	public String getname()
	{
		return name;
	}
	public String getrollno()
	{
		return rollno;
	}
	public String getphoneno()
	{
		return phoneno;
	}
}

class Inheritence1
{
	public void parentclass()
	{
		System.out.println("This is parent class");
	}
	public void status()
	{
		System.out.println("This is overriden by child class");
	}
}

	//------------- implements Interface and extends abstraction -------------


class Inheritence extends Inheritence1 implements Interface
{
	public  void status()
	{
		System.out.println("overriden successfully completed by child class");
	}
	public void childclass()
	{
		System.out.println("This is child class");
	}
	public void hello()
	{
	System.out.println("This is an interface");
	}


}


class Oopsconcepts
{
public static void main(String Args[])
{
	Encapsulation o=new Encapsulation();
	Polymorphism o1=new Polymorphism();
	Inheritence1 a1=new Inheritence1();
	Inheritence a=new Inheritence();
	cat o2=new cat();
	dog o3=new dog();

System.out.println("\n-------- implements interface ---------\n");

	a.hello();

System.out.println("\n--------  implementing abstraction --------\n");

	o3.voice();
	o2.voice();
	o2.voice();

System.out.println("\n--------  implementing encapsulation  --------\n");

	o.setname("Bhanu");
	o.setrollno("17691a0515");
	o.setphoneno("9440680352");
	System.out.println("name = "+o.getname());
	System.out.println("roll no = "+o.getrollno());
	System.out.println("phone no = "+o.getphoneno());

System.out.println("\n--------  implementing method overloading(polymorphism)  --------\n");

	System.out.println("addition of 2 integer numbers 3,4 = "+o1.add(3,4));
	System.out.println("addition of 3 integer numbers  2,4,6 = "+o1.add(2,4,6));
	System.out.println("addition of 2 decimal numbers 3.45,4.54 = "+o1.add(3.45,4.54));

System.out.println("\n--------  method overriding(polymorphism) and Inheritence --------\n");

	a1.parentclass();
	a1.status();
	a.childclass();
	a.status();
	
}
}

 