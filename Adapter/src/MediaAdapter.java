public class MediaAdapter implements MediaPlayer
{
	AdvancedMediaPlayer advancedmediaplayer;

	public MediaAdapter(String audiotype)
	{
		if(audiotype.equalsIgnoreCase("vlc"))
		{
			advancedmediaplayer=new VlcPlayer();
		}
		else if(audiotype.equalsIgnoreCase("mp4"))
		{
			advancedmediaplayer=new Mp4Player();
		}
	}
	
	public void play(String audiotype, String filename)
	{
		if(audiotype.equalsIgnoreCase("vlc"))
		{
			advancedmediaplayer.playVLC(filename);
		}
		else if(audiotype.equalsIgnoreCase("mp4"))
		{
			advancedmediaplayer.playMp4(filename);
		}
	}
}
