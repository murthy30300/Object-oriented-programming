package adapter;
interface MediaPlayer 
{
	   public void play(String audioType, String fileName);
}
interface advancedMediaPlayer
{
	public void playVlc(String fileName);
	public void playMp4(String fileName);
	
}
class vlcPlayer implements advancedMediaPlayer
{
	public void playVlc(String fileName)
	{
		System.out.println("Playing vlc file. Name:"+fileName);
	}
	public void playMp4(String fileName) 
	{
		//eat 5Star do Nothing
	}
}
class mp4Player implements advancedMediaPlayer
{
	public void playVlc(String fileName) 
	{
		
	}
	public void playMp4(String fileName) 
	{
		System.out.println("Playing mp4 file. name:"+fileName);
	}
}
class MediaAdapter implements MediaPlayer
{
	advancedMediaPlayer advancedMusicPlayer;
	MediaAdapter(String audioType)
	{
		if(audioType.equalsIgnoreCase("vlc"))
		{
			advancedMusicPlayer=new vlcPlayer();
		}
		else if(audioType.equalsIgnoreCase("mp4"))
			advancedMusicPlayer=new mp4Player();
	}
	public void play(String audioType, String fileName)
	{
		if(audioType.equalsIgnoreCase("vlc"))
		  {
	         advancedMusicPlayer.playVlc(fileName);
	      }
	      else if(audioType.equalsIgnoreCase("mp4"))
	      {
	         advancedMusicPlayer.playMp4(fileName);
	      }
	}
}
class AudioPlayer implements MediaPlayer
{
	MediaAdapter mediaAdapter; 
	   public void play(String audioType, String fileName) {		
	      if(audioType.equalsIgnoreCase("mp3"))
	      {
	         System.out.println("Playing mp3 file. Name: " + fileName);			
	      } 
	      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4"))
	      {
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      else
	      {
	         System.out.println("Invalid media. " + audioType + " format not supported");
	      }
	   }   
}
public class musicDemo
{
	public static void main(String[] args) 
	{
		AudioPlayer audioPlayer = new AudioPlayer();
	      audioPlayer.play("mp3", "LAAhiri Lahiri laahirilo.mp3");
	      audioPlayer.play("mp4", "MAAAYABAZAR.mp4");
	      audioPlayer.play("vlc", "AKHANDA.VLC");
	      audioPlayer.play("avi", "");
	}
}