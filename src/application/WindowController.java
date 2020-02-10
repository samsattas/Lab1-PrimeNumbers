package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.PrimeNumbers;

public class WindowController {
	private PrimeNumbers pn = new PrimeNumbers();
	
	
	@FXML
	private GridPane mainGrid;
	
	@FXML
	private TextField numberField;
	
//	GridPane gp = new GridPane();

	
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
//		gp.setVgap(10);
//		gp.setHgap(10);
	}
	
	public void findPrimeNumbers1(ActionEvent av) {
//		mainGrid.getChildren().
//		gp.getChildren().clear();
		int aux = pn.convertToInt(numberField.getText());
		int matrix = pn.generateMatrix(aux);
		GridPane gp = new GridPane();
		gp.setVgap(10);
		gp.setHgap(10);
		mainGrid.add(gp, 0, 1);
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
