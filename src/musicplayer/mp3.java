/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;
import java.io.*;
import jaco.mp3.player.MP3Player;
import java.awt.Desktop;
import javafx.stage.FileChooser;
/**
 *
 * @author anameplease
 */
public class mp3 {
    private final MP3Player media;
    private final String playThis;
    private final FileChooser choice;
  
   
    
    public mp3(String playThis){
        this.media = new MP3Player();
        this.playThis = playThis;
        this.choice = new FileChooser();
        
    }
    
    
    public void play() {
       new Thread(media::play).start();
    
    }
    
    public void pause(){
       media.pause();
    }
    
    
 
    
    
}
