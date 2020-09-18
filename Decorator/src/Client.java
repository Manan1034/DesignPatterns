public class Client 
{
	public static void main(String...args)
	{
		Shape circle=new Circle();
		
		Shape redcircle=new DecoratedShape(new Circle());
		
		Shape bluerectangle=new DecoratedShape(new Rectangle());
		
		circle.draw();
		
		redcircle.draw();
		
		bluerectangle.draw();
	}
}
