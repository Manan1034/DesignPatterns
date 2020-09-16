
public abstract class Sound implements Cloneable
{
	private String id;
	protected String type;
	
	abstract void play();
	
	public String getType()
	{
		return type;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id=id;
	}
	
	public Object clone()
	{
		Object clone=null;
		
		try
		{
			clone=super.clone();
		}
		catch(CloneNotSupportedException ex)
		{
			ex.printStackTrace();
		}
		
		return clone;
	}
}
