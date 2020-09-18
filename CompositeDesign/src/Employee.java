import java.util.ArrayList;
import java.util.List;

public class Employee 
{
	private String name;
	private String designation;
	private int salary;
	private List<Employee> employees;
	
	Employee(String name, String designation, int salary)
	{
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		employees=new ArrayList<Employee>();
	}
	
	public void add(Employee employee)
	{
		employees.add(employee);
	}
	
	public void remove(Employee employee)
	{
		employee.remove(employee);
	}
	
	public List<Employee> getSubordinates()
	{
		return employees;
	}
	
	public String toString()
	{
		return ("Name : "+name+" , Designation : "+designation+", Salary : "+salary);
	}
}
