package threads;

import application.WindowController;
import javafx.scene.control.Label;

public class MatrixThread extends Thread{
	private boolean isP;
	private Label l;
	private int time;
	
	public MatrixThread(Label l, boolean isP, int time) {
		this.l = l;
		this.isP = isP;
		this.time = time;
	}
	
	public void run() {
		
		try {
			sleep(time);
			if(!isP) {
				l.setStyle("-fx-border-color: white; -fx-background-color: red;");
			}else {
				l.setStyle("-fx-border-color: white; -fx-background-color: #1aff1a;");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
