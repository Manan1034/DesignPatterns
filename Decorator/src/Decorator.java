public class Decorator implements Shape
{
	Shape shape;
	public Decorator(Shape shape)
	{
		this.shape =shape;
	}
	
	public void draw()
	{
		shape.draw();
	}
}
