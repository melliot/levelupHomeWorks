package game2;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Sound{
	public static final AudioClip BACK = Applet.newAudioClip(Sound.class.getResource("file:/home/alexis/IdeaProjects/apiTest/src/main/java/game2/Time.wav"));
	public static final AudioClip GAMEOVER = Applet.newAudioClip(Sound.class.getResource("smb_gameover.wav"));
	public static final AudioClip BALL = Applet.newAudioClip(Sound.class.getResource("smb_kick.wav"));

//	public AudioClip Back = Applet.newAudioClip(new URL(""));

	public static void main(String[] args) {
		Sound.BALL.play();
	}
}