class Emp
{
	String name;
	int id =-1;
	
	public Emp setName(String name)
	{
		this.name=name;
		return this;
	}
	
	public Emp setId(int id)
	{
		this.id=id;
		return this;
	}
	
	@Override
	public String toString()
	{
		return "id = " + this.id +" name = " + this.name;
	}
}
public class BuilderUser {

	public static void main(String...args)
	{
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp e3=new Emp();
		
		e1.setName("Gopal").setId(5);
		e2.setId(2);
		e3.setName("Veer");

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
