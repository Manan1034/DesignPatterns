
public class Client 
{
	public static void main(String...args)
	{
		SoundCache soundcache=new SoundCache();
		soundcache.loadCache();
		
		Sound sound1=soundcache.getSound("1");
		System.out.println("Sound : "+ sound1.getType());
		sound1.play();
		
		Sound sound2=soundcache.getSound("2");
		System.out.println("Sound : "+ sound2.getType());
		sound2.play();
		
		Sound sound3=soundcache.getSound("1");
		System.out.println("Sound :"+ sound3.getType());
		sound3.play();
	}
}
