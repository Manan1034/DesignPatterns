public class AudioPlayer implements MediaPlayer
{
	public void play(String audioType, String filename)
	{
		if(audioType.equalsIgnoreCase("mp3"))
		{
			System.out.println("Mp3 Player playing : "+ filename);
		}
		else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc"))
		{
			MediaAdapter mediaadapter=new MediaAdapter(audioType);
			mediaadapter.play(audioType, filename);
		}
		else
		{
			System.out.println("Unsupported Media Type : "+ audioType);
		}
	}
}
