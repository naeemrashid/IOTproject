package application;
	
import com.jfoenix.controls.JFXButton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Image setting = new Image(getClass().getResourceAsStream("setting.png"));
			Image logoimg = new Image(getClass().getResourceAsStream("logo.png"));
			Button settingbtn = new Button("",new ImageView(setting));
			settingbtn.setStyle("-fx-background-color:whitesmoke");
			settingbtn.setPrefSize(50, 50);
			JFXButton logobtn = new JFXButton("",new ImageView(logoimg));
			Label title = new Label("       Energy Saving System");
			title.setFont(new Font(30));
			title.setPrefSize(643, 60);
			HBox hbox = new HBox();
			hbox.setSpacing(10);
			hbox.getChildren().addAll(logobtn,title,settingbtn);
			Parent Interface = FXMLLoader.load(getClass().getResource("Interface.fxml"));
			BorderPane root = new BorderPane();
			root.setTop(hbox);
			root.setCenter(Interface);
			Scene scene = new Scene(root,800,500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			settingbtn.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
				try {
					Parent settingInterface = FXMLLoader.load(getClass().getResource("Settings.fxml"));
					root.setCenter(settingInterface);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
