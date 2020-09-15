class Sit
{
	String name;
	public String getName()
	{
		return name;
	}
}

class A extends Sit
{
	@Override
	public String getName()
	{
		return "A";
	}
}

class B extends Sit
{
	@Override
	public String getName()
	{
		return "B";
	}
}

class FacadeClass
{
	public String getNameA()
	{
		A a=new A();
		return a.getName();
	}
	
	public String getNameB()
	{
		B b=new B();
		return b.getName();
	}
}
public class Facade 
{
	public static void main(String...args)
	{
		FacadeClass fc=new FacadeClass();
		System.out.println(fc.getNameA());
		System.out.println(fc.getNameB());
	}
}


