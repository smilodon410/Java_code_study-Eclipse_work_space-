package application;
	
import java.io.IOException;

import com.sun.javafx.geom.Rectangle;
import com.sun.jdi.event.Event;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;


public class exit extends Application {
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
			HBox root = new HBox();
			root.setPrefWidth(350);
			root.setPrefHeight(150);
			root.setAlignment(Pos.BOTTOM_CENTER);
			root.setSpacing(20);
			
			
//			Label label = new Label();
//			label.setText("Hello :)");
//			label.setFont(new Font(50));
			
			Button button = new Button();
			button.setText("종료");
			
			button.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					HBox root1 = new HBox();
					root1.setPrefWidth(200);
					root1.setPrefHeight(50);
					root1.setAlignment(Pos.CENTER);
					root1.setSpacing(20);
					
					Label label = new Label();
					label.setText("정말 나갈꺼야?");
					label.setFont(new Font(20));
					
					Button button2 = new Button();
					button2.setText("예");
					button2.setOnAction(event->Platform.exit());
					
					Button button3 = new Button();
					button3.setText("아니오");					
				}
			});
			
			

			
			root.setMargin(button, new Insets(10,0,20,0));
			
			TextField textfield = new TextField();
			textfield.setPrefWidth(250);
			root.setMargin(textfield, new Insets(10,0,20,0));
			
			Button button1 = new Button();
			button1.setText("전송");
			root.setMargin(button1, new Insets(10,0,20,0));
			
			ObservableList list = root.getChildren();
			list.add(textfield);
			list.add(button1);
			
//			root.getChildren().add(label);
			root.getChildren().add(button);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("채팅방");
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
