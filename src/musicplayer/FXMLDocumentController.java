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
    mp3 soundbite = new mp3();
     
    
    @FXML
    private void play(ActionEvent event){
      soundbite.play();
    }
    
    @FXML
    private void pause(ActionEvent event) {
     soundbite.pause();
    }
    
    @FXML
    private void fileSelect(ActionEvent event) throws IOException{
      soundbite.fileSelect();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
  
    }    
    
}
