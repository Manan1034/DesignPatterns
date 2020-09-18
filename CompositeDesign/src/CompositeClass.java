public class CompositeClass 
{
	public static void main(String...args)
	{
		Employee ceo=new Employee("Gopal","CEO",125000);
		
		Employee financeexpert=new Employee("Mehak","Finance Expert", 100000);
		
		Employee financer=new Employee("XYZ","Financer",90000);
		
		Employee clerk= new Employee ("New","Clerk", 25000);
		
		ceo.add(financeexpert);
		ceo.add(financer);
		
		financeexpert.add(clerk);
		
		System.out.println("CEO group involves : ");
		for(Employee employee:ceo.getSubordinates())
		{
			System.out.println(employee);
		}
	}
}
