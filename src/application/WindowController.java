package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import model.PrimeNumbers;
import threads.MatrixThread;

public class WindowController {
	private PrimeNumbers pn = new PrimeNumbers();
	
	
	@FXML
	private GridPane mainGrid;
	
	@FXML
	private TextField numberField;
	
	@FXML
	private GridPane mp;

	
	public void initialize(URL arg0, ResourceBundle arg1) {
		mp.setStyle("-fx-background-color: white;");
		mainGrid.setStyle("-fx-background-color: white;");
	}
	
	public void findPrimeNumbers1(ActionEvent av) {
		mp.getChildren().clear();
		
		int aux = pn.convertToInt(numberField.getText());
		int matrix = pn.generateMatrix(aux);
		GridPane gp = new GridPane();
//		gp.setGridLinesVisible(true);
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
					l.setStyle("-fx-border-color: white; -fx-background-color: red;");
				}else {
					l.setStyle("-fx-border-color: white; -fx-background-color: #1aff1a;");
					
				}

				
				gp.add(l, j, i);
				counter++;
			}
		}
	}
	
	public void findPrimeNumbers2(ActionEvent av) {
		mp.getChildren().clear();
		
		int aux = pn.convertToInt(numberField.getText());
		int matrix = pn.generateMatrix(aux);
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		mp.getChildren().add(gp);
		int counter = 1;
		int time = 1000;
		for(int i = 0; i < matrix && counter <= aux; i++) {
			for(int j = 0; j < matrix && counter <= aux; j++) {
				Label l = new Label(counter+" ");
				l.setFont(Font.font(20));
				l.setMinSize(50, 40);
				
				MatrixThread t = new MatrixThread(l, pn.primeNumbersVerification1(counter), time);
				t.start();
				
				gp.add(l, j, i);
				counter++;
				time+=1000;
			}
		}
	}
	
	public void paint(Label l) {
		l.setStyle("-fx-border-color: white; -fx-background-color: red;");
	}
	
	public void findPrimeNumbers3(ActionEvent av) {
		mp.getChildren().clear();
		
		int aux = pn.convertToInt(numberField.getText());
		int matrix = pn.generateMatrix(aux);
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		mp.getChildren().add(gp);
		int counter = 1;
		for(int i = 0; i < matrix && counter <= aux; i++) {
			for(int j = 0; j < matrix && counter <= aux; j++) {
				Label l = new Label(counter+" ");
				l.setFont(Font.font(20));
				l.setMinSize(50, 40);
				if(!pn.Validation1Prime(counter)) {
					l.setStyle("-fx-border-color: white; -fx-background-color: red;");
				}else {
					l.setStyle("-fx-border-color: white; -fx-background-color: #1aff1a;");
				}
				
				gp.add(l, j, i);
				counter++;
			}
		}
	}
}
