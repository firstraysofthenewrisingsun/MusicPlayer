/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


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
    
    @FXML
    private void multiSelect(ActionEvent event) throws IOException{
        soundbite.multiSelect();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
  
    }    
    
}
