
public class Player 
{
	public static void main(String...args)
	{
		SoundFactory soundfactory=new SoundFactory();
		
		Sound sound1=soundfactory.getSound("Guitar");
		
		sound1.play();
		
		Sound sound2=soundfactory.getSound("Drums");
		
		sound2.play();
	}
}
