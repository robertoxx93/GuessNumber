/**
 * Sample Skeleton for 'GuessNumber.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class GuessNumberController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnNuovaPartita"
    private Button btnNuovaPartita; // Value injected by FXMLLoader

    @FXML // fx:id="txtCurrTentativi"
    private TextField txtCurrTentativi; // Value injected by FXMLLoader

    @FXML // fx:id="txtMaxTentativi"
    private TextField txtMaxTentativi; // Value injected by FXMLLoader

    @FXML // fx:id="boxGoco"
    private HBox boxGoco; // Value injected by FXMLLoader

    @FXML // fx:id="txtMostraTentativi"
    private TextField txtMostraTentativi; // Value injected by FXMLLoader

    @FXML // fx:id="txtLog"
    private TextArea txtLog; // Value injected by FXMLLoader

    @FXML
    void handleNuovaPartita(ActionEvent event) {

    }//end handleNuovaPartita

    @FXML
    void handleProva(ActionEvent event) {

    }//end handleProva method

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnNuovaPartita != null : "fx:id=\"btnNuovaPartita\" was not injected: check your FXML file 'GuessNumber.fxml'.";
        assert txtCurrTentativi != null : "fx:id=\"txtCurrTentativi\" was not injected: check your FXML file 'GuessNumber.fxml'.";
        assert txtMaxTentativi != null : "fx:id=\"txtMaxTentativi\" was not injected: check your FXML file 'GuessNumber.fxml'.";
        assert boxGoco != null : "fx:id=\"boxGoco\" was not injected: check your FXML file 'GuessNumber.fxml'.";
        assert txtMostraTentativi != null : "fx:id=\"txtMostraTentativi\" was not injected: check your FXML file 'GuessNumber.fxml'.";
        assert txtLog != null : "fx:id=\"txtLog\" was not injected: check your FXML file 'GuessNumber.fxml'.";

    }//end initialize method
}//end class 
