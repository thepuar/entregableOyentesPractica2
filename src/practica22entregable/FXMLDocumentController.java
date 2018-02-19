/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica22entregable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 *
 * @author frapecha
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Slider slider;
    @FXML
    private TextField textarea_input;
    @FXML
    private TextField textarea_output;
    @FXML
    private Button bt_convert;
    @FXML
    private Button btn_clear;
    @FXML
    private CheckBox check_automatic;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
