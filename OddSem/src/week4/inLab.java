package week4;
import java.util.ArrayList;
import java.util.List;
interface MusicSource {
  void playMusic();
}
class LocalFileMusicSource implements MusicSource {
  private String filename;
  public LocalFileMusicSource(String filename)
  {
    this.filename = filename;
  }
  public void playMusic() 
  {
    System.out.println("Playing music from file: " + filename);
  }
}
class OnlineStreamingMusicSource implements MusicSource {
  private String url;
  public OnlineStreamingMusicSource(String url)
  {
    this.url = url;
  }

  @Override
  public void playMusic() {
    System.out.println("Playing music from streaming service: " + url);
  }
}
class RadioStationMusicSource implements MusicSource {
  private int frequency;

  public RadioStationMusicSource(int frequency) 
  {
    this.frequency = frequency;
  }

  @Override
  public void playMusic()
  {
    System.out.println("Playing music from radio station: " + frequency);
  }
}

interface MusicPlayer {
  void playMusic(MusicSource musicSource);
}

class Mp3Player implements MusicPlayer {
  @Override
  public void playMusic(MusicSource musicSource)
  {
    musicSource.playMusic();
  }
}
class AudioStreamer implements MusicPlayer 
{
  @Override
  public void playMusic(MusicSource musicSource) 
  {
    musicSource.playMusic();
  }
}
abstract class MusicDecorator implements MusicPlayer 
{
  protected MusicPlayer musicPlayer;
  public MusicDecorator(MusicPlayer musicPlayer) 
  {
    this.musicPlayer = musicPlayer;
  }
  public void playMusic(MusicSource musicSource) 
  {
    musicPlayer.playMusic(musicSource);
  }
}
class EqualizerDecorator extends MusicDecorator 
  {
  public EqualizerDecorator(MusicPlayer musicPlayer) 
  {
    super(musicPlayer);
  }

  @Override
  public void playMusic(MusicSource musicSource)
  {
    super.playMusic(musicSource);
    System.out.println("Applying equalizer...");
  }
}
class VolumeDecorator extends MusicDecorator {
  private int volume;

  public VolumeDecorator(MusicPlayer musicPlayer, int volume)
  {
    super(musicPlayer);
    this.volume = volume;
  }

  @Override
  public void playMusic(MusicSource musicSource) 
  {
    super.playMusic(musicSource);
    System.out.println("Setting volume to: " + volume);
  }
}
public class inLab {
  public static void main(String[] args) 
  {
    // Create a list of music sources
    List<MusicSource> musicSources = new ArrayList<>();
    musicSources.add(new LocalFileMusicSource("my_music.mp3"));
    musicSources.add(new OnlineStreamingMusicSource("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
    musicSources.add(new RadioStationMusicSource((int) 99.9));

    // Create a music player
    Mp3Player mp3Player = new Mp3Player();

    // Create a decorator
    EqualizerDecorator equalizerDecorator = new EqualizerDecorator(mp3Player);

    // Play music from all the music sources
    for (MusicSource musicSource : musicSources) {
      equalizerDecorator.playMusic(musicSource);
    }
  }
}

/*   Implement the scenario with the concepts of Adapter, Bridge, and Decorator:
 *   Create a music streaming application that can play music from different sources,
 *   such as local files, online streaming services, and radio stations. 
 *   Use the Adapter pattern to adapt different sources to a common interface, 
 *   the Bridge pattern to decouple the music playback from the source,
 *   and the Decorator pattern to add additional features to the music playback.
 */
/*interface Spotify
{
	void play();
	
}
class local implements Spotify
{
	public void play()
	{
		System.out.println("this song is played from your FILE");
	}
}
class onlineStream implements Spotify
{
	public void play()
	{
		System.out.println("This song is playing with your Mobile data");
	}
}
class Radio implements Spotify
{
	public void play()
	{
		System.out.println("hey YOU are hearing RADIO MIRCHI");
	}
}
class songAdapter implements Spotify
{
	song current=new song();
	public void play()
	{
		current.playing();
		//System.out.println("this song is playing");
	}
}
class song 
{
	public void playing()
	{
		System.out.println("this song is playing");
	}
}
public class inLab 
{
	public static void main(String[] args)
	{
		Spotify music=new songAdapter();
		music.play();
	}
}*/

