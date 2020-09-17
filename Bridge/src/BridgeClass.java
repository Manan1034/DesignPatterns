public class BridgeClass 
{
	public static void main(String...args)
	{
		Shape redcircle=new Circle(10,20,30,new RedCircle());
		Shape yellowcircle=new Circle(20,40,60,new YellowCircle());
		
		redcircle.drawing();
		yellowcircle.drawing();
	}
}
