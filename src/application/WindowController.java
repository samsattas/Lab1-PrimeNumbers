package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import model.PrimeNumbers;

public class WindowController {
	private PrimeNumbers pn = new PrimeNumbers();
	
	
	@FXML
	private GridPane mainGrid;
	
	@FXML
	private TextField numberField;
	
	@FXML
	private GridPane mp;

	
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void findPrimeNumbers1(ActionEvent av) {
		mp.getChildren().clear();
		
		int aux = pn.convertToInt(numberField.getText());
		int matrix = pn.generateMatrix(aux);
		GridPane gp = new GridPane();
		gp.setGridLinesVisible(true);
		gp.setAlignment(Pos.CENTER);
//		gp.setVgap(15);
//		gp.setHgap(15);
		mp.getChildren().add(gp);
		int counter = 1;
		for(int i = 0; i < matrix && counter <= aux; i++) {
			for(int j = 0; j < matrix && counter <= aux; j++) {
				Label l = new Label(counter+" ");
				l.setFont(Font.font(20));
				l.setMinSize(50, 40);
				if(!pn.primeNumbersVerification2(counter)) {
					l.setStyle("-fx-border-color: darkred; -fx-background-color: red;");
				}else {
					l.setStyle("-fx-border-color: darkgreen; -fx-background-color: green;");
					
				}

				
				gp.add(l, j, i);
				counter++;
			}
		}
	}
	
	public void findPrimeNumbers2(ActionEvent av) {
			
	}
	
	public void findPrimeNumbers3(ActionEvent av) {
		
	}
}
