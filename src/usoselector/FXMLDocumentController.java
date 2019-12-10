package usoselector;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import selectordeslizamiento.Selector;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Selector s1;
    @FXML
    private Selector s2;
    @FXML
    private Label seleccion;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void sel1(ActionEvent event) {
        seleccion.setText("Pulsado el selector superior");
    }

    @FXML
    private void sel2(ActionEvent event) {
        seleccion.setText("Pulsado el selector inferior");
    }
    
}
