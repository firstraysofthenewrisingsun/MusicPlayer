/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;
import java.io.*;
import jaco.mp3.player.MP3Player;
import jaco.mp3.player.plaf.MP3PlayerUI;
import jaco.mp3.player.plaf.MP3PlayerUICompact;
import java.util.List;
import javafx.scene.control.Alert;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
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
    private boolean singletrack;
    private boolean multitrack;
    
    
  
   
    
    public mp3(){
     
    }
     
    public void play() {
        if (singletrack == true)
            new Thread(media::play).start();
        
        if (multitrack == true)
            new Thread(media2::play).start();
    
    }
    
    public void pause(){
       if (singletrack == true)
            media.pause();
       
       if (multitrack == true)
           media2.pause();
    }
    
    public void next(){
        if (singletrack == true)
            media.skipForward();
        
        if (multitrack == true)
            media2.skipForward();
    }
    
    public void previous(){
        if (singletrack == true)
            media.skipBackward();
        
        if (multitrack == true)
            media2.skipBackward();
    }
    
    public void shuffle(){
        
    }
    
    
    public void fileSelect() throws IOException{
        MP3Player.setDefaultUI(MP3PlayerUICompact.class);
        
            choice = new FileChooser();
            playThis = choice.showOpenDialog(s);
            
        if (playThis != null){
            
            media = new MP3Player(playThis);
         
            singletrack = true;
            
                media.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));
            
                JFrame frame = new JFrame("MP3 Player");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(media);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
               
            
        } else if (null == playThis){
            
            singletrack = false;
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
            multitrack = true;
            
        } else if (null == thesePlease){
            
            multitrack = false;
            buzz = new Alert(Alert.AlertType.ERROR);
            buzz.setContentText("Please select some songs.");
            buzz.showAndWait();
            
            
        }
        
    }
 
    
    
}
