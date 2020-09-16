
public class SoundFactory 
{
	public Sound getSound(String instrument)
	{
		if(instrument==null)
		{
			return null;
		}
		else if(instrument.equalsIgnoreCase("GUITAR"))
		{
			return new Guitar();
		}
		else if(instrument.equalsIgnoreCase("DRUMS"))
		{
			return new Drums();
		}
		
		return null;
	}
}
