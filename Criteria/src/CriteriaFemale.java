import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteriaa
{
	@Override
	public List<Person> meetCriteria(List<Person> persons)
	{
		List<Person> maleperson=new ArrayList<Person>();
		
		for(Person person:persons)
		{
			if(person.getGender().equalsIgnoreCase("female"))
			{
				maleperson.add(person);
			}
		}
		
		return maleperson;
	}
}
