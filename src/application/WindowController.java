package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
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
		// TODO Auto-generated method stub
		mp.setAlignment(Pos.CENTER);
	}
	
	public void findPrimeNumbers1(ActionEvent av) {
		mp.getChildren().clear();

		int aux = pn.convertToInt(numberField.getText());
		int matrix = pn.generateMatrix(aux);
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setVgap(20);
		gp.setHgap(20);
		mp.getChildren().add(gp);
		int counter = 1;
		for(int i = 0; i < matrix && counter <= aux; i++) {
			for(int j = 0; j < matrix && counter <= aux; j++) {
				Label l = new Label(counter+" ");
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
