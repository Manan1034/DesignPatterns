abstract class Emp
{
	String name;
	public abstract boolean hasName();
}
class Client extends Emp
{
	@Override
	public boolean hasName()
	{
		return true;
	}
	
}

class NullClient extends Emp
{
	@Override
	public boolean hasName()
	{
		return false;
	}
}

class Check
{
	String[] names= {"A", "B", "C"};
	
	public Emp checkName(String name)
	{
		for(int i=0;i<names.length;i++)
		{
			if(names[i].equals(name))
			{
				return new Client();
			}
		}
		return new NullClient();
	}
}

public class NullObjectDesign {
	public static void main(String...args)
	{
		String[] name= {"A","B","C","D"};
		
		Check c=new Check();
		
		Emp e1=c.checkName(name[0]);
		Emp e2=c.checkName(name[1]);
		Emp e3=c.checkName(name[2]);
		Emp e4=c.checkName(name[3]);
		
		System.out.println(e1.hasName());
		System.out.println(e2.hasName());
		System.out.println(e3.hasName());
		System.out.println(e4.hasName());
	}

}
