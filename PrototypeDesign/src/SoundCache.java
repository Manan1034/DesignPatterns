import java.util.Hashtable;

public class SoundCache 
{
	private static Hashtable<String, Sound > soundMap=new Hashtable<String, Sound>();
	
	public static Sound getSound(String id)
	{
		Sound sound= soundMap.get(id);
		return (Sound) sound.clone();
	}
	
	public static void loadCache()
	{
		Guitar guitar=new Guitar();
		guitar.setId("1");
		soundMap.put(guitar.getId(),guitar);
		
		
		Drums drums=new Drums();
		drums.setId("2");
		soundMap.put(drums.getId(), drums);
	}
}
