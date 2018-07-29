package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;


public class Main extends Application {
	private Stage stage;
	private Scene scene;
	//private FlowPane pane;
	private AnchorPane pane;
	//private Label label;
	
	@FXML
	private Button btn; 
	
	
	@Override
	public void start(Stage stage) {
		this.stage = stage;
		//pane = new FlowPane();
		try {
			pane = (AnchorPane) FXMLLoader.load(Main.class.getResource("hw1.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//label = new Label("Hello World!");
		//pane.getChildren().add(label);
		scene = new Scene(pane,640,480);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	public void initialize() {
		//btn.setOnAction(new EventHandler<ActionEvent>() {
			
		//	@Override
		//	public void handle(ActionEvent event) {
		//		System.out.println(1);
		//	}
		//});		
	}
	
	public void btnAction() {
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


