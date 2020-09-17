
public class Circle extends Shape{
	int x,y,radius;
		
	public Circle(int x,int y, int radius,Draw draw)
	{
		super(draw);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	public void drawing()
	{
		draw.draw(x, y, radius);
	}

}
