public class Client 
{
	private static String Colour[]= {"Black","Red","Blue"};
	public static void main(String...args)
	{
		for(int i=0;i<3;i++)
		{
			Circle circle=(Circle) ShapeFactory.getColor(Colour[(int)Math.random()*Colour.length]);
			circle.setX(20);
			circle.setY(40);
			circle.setRadius(20);
		
			circle.draw();
		}
	}
}
