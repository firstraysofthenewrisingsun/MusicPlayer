/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;
import java.io.*;
import jaco.mp3.player.MP3Player;
import java.util.List;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
/**
 *
 * @author anameplease
 */
public class mp3 {
    private MP3Player media;
    private MP3Player media2;
    private Alert hey;
    private Alert hold;
    private Alert buzz;
    private File playThis;
    private List<File> thesePlease;
    private FileChooser choice;
    private FileChooser choices;
    private Stage s = new Stage();
    private Stage t = new Stage();
  
   
    
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
            
            media = new MP3Player(playThis);
        
        } else if (null == playThis){
            
            hey = new Alert(Alert.AlertType.WARNING);
            hey.setContentText("Please select a song.");
            hey.showAndWait();
            
        }
        
        
    }
    
    public void multiSelect() throws IOException{
        hold = new Alert(Alert.AlertType.INFORMATION);
        hold.setContentText("Please select up to three files");
        hold.showAndWait();
               
        choices = new FileChooser();
        thesePlease = choices.showOpenMultipleDialog(t);
        
        if (thesePlease != null){
        media2 = new MP3Player(thesePlease.get(0), thesePlease.get(1), thesePlease.get(2));
        } else if (null == thesePlease){
            
            buzz = new Alert(Alert.AlertType.ERROR);
            buzz.setContentText("Please select some songs.");
            buzz.showAndWait();
            
        }
        
    }
 
    
    
}
