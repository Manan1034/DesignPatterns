import java.util.HashMap;

public class ShapeFactory 
{
	private static HashMap circleMap=new HashMap<String, Shape>();
	
	public static Shape getColor(String color)
	{
		Circle circle=(Circle)circleMap.get(color);
		
		if(circle==null)
		{
			circle=new Circle(color);
			circleMap.put(color,circle);
			System.out.println("Color of Circle is :"+ color);
		}
		
		return circle;
	}
}
