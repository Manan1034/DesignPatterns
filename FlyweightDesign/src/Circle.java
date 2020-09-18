public class Circle implements Shape
{
	private int x;
	private int y;
	private int r;
	private String color;
	
	public Circle(String color)
	{
		this.color=color;
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	
	public void setY(int y)
	{
		this.y=y;
	}
	
	public void setRadius(int r)
	{
		this.r=r;
	}
	public void draw()
	{
		System.out.println("Drawing Circle with Color "+color+" with (" +x+ ","+ y + ") and radius "+r);
	}
}
