/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import jaco.mp3.player.MP3Player;


/**
 *
 * @author anameplease
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public String soundfile;
    
    @FXML
    public MP3Player JukeBox;
    
    @FXML
    private FileChooser chooser;
    
    @FXML
    private File file;
    
    @FXML
    private final Stage s = new Stage();
    
     
    
    
    
    
    @FXML
    private void play(ActionEvent event){
      
      JukeBox.play();
      
    }
    
    @FXML
    private void pause(ActionEvent event) {
        JukeBox.pause();
    }
    
    @FXML
    private void fileSelect(ActionEvent event) throws IOException{
       chooser = new FileChooser();
       file = chooser.showOpenDialog(s);
       if (file != null) {
         
       }
       JukeBox = new MP3Player(file);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
  
    }    
    
}
