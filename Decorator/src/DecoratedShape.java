public class DecoratedShape extends Decorator{
	public DecoratedShape(Shape shape)
	{
		super(shape);
	}
	
	public void draw()
	{
		shape.draw();
		setdecoratorBorder(shape);
	}
	
	public void setdecoratorBorder(Shape shape)
	{
		System.out.println("Decorated Shape");
	}
}
