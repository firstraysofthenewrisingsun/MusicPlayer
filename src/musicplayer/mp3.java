/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;
import java.io.*;
import jaco.mp3.player.MP3Player;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
/**
 *
 * @author anameplease
 */
public class mp3 {
    private MP3Player media;
    private File playThis;
    private FileChooser choice;
    private Stage s = new Stage();
  
   
    
    public mp3(){
     
    }
    
    
    public void play() {
       new Thread(media::play).start();
    
    }
    
    public void pause(){
       media.pause();
    }
    
    public void fileSelect() throws IOException{
        choice = new FileChooser();
        playThis = choice.showOpenDialog(s);
        if (playThis != null){
        
        }
        
        media = new MP3Player(playThis);
    }
 
    
    
}
