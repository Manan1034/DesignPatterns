import java.util.ArrayList;
import java.util.List;

public class ObtainCriteria 
{
	public static void main(String...args)
	{
		List<Person> persons=new ArrayList<Person>();
		Person p1=new Person("Gopal","Male","Single");
		persons.add(p1);
		Person p2=new Person("Medley","Female","Married");
		persons.add(p2);
		Person p3=new Person("Bob","Male","Married");
		persons.add(p3);
		
		Criteriaa criteriamale=new CriteriaMale();
		System.out.println("Male : ");
		print(criteriamale.meetCriteria(persons));
		
		Criteriaa criteriafemale=new CriteriaFemale();
		List<Person> female=criteriafemale.meetCriteria(persons);
		System.out.println("Female : ");
		print(female);
		
	}
	
	public static void print(List<Person> persons)
	{
		for(Person person:persons)
		{
			System.out.println("Name : "+ person.getName()+"\nGender : "+person.getGender()+"\nStatus : "+person.getStatus());
		}
	}
}
