package it.polito.tdp.crashcourse;

import java.awt.event.TextEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEta;

    @FXML
    private Button buttonOk;

    @FXML
    private Label txtRisposta;

    @FXML
    void handleOk(ActionEvent event) {
    	String nome=txtNome.getText();
    	String etaString= txtEta.getText();
    	String risposta = null;
    	int eta= 0;
    	//System.out.println("ok");
    	try {
    		eta= Integer.parseInt(etaString);
    	} catch (NumberFormatException e ) {
			risposta="Devi inserire un numero";
			txtRisposta.setText(risposta);
			return;
		}
    	if (eta<0) {
    		risposta="Devi inserire un numero maggiore di 0 coglione";
			txtRisposta.setText(risposta);
			return;
    	}
    	if (eta<19) 
			risposta="Ciao "+nome+" "+eta+"!";	
    	else 
			risposta="Buongiorno "+nome+"!";
    	txtRisposta.setText(risposta);
    }

    @FXML
    void initialize() {
        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtEta != null : "fx:id=\"txtEta\" was not injected: check your FXML file 'Scene.fxml'.";
        assert buttonOk != null : "fx:id=\"buttonOk\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisposta != null : "fx:id=\"txtRisposta\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
