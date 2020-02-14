package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root =  FXMLLoader.load(getClass().getResource("/application/Window.fxml"));
            primaryStage.setTitle("Prime Numbers Finder");
            primaryStage.setScene(new Scene(root));
            primaryStage.setWidth(1000);
            primaryStage.setHeight(800);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
