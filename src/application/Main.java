package application;
	
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTabPane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Image setting = new Image(getClass().getResourceAsStream("setting.png"));
			Image logoimg = new Image(getClass().getResourceAsStream("logo.png"));
//			Button settingbtn = new Button("",new ImageView(setting));
			Label settingLabel = new Label("",new ImageView(setting));
//			settingLabel.setStyle("-fx-background-color:#1d1d1d");
			settingLabel.setPrefSize(50, 50);
			JFXButton logobtn = new JFXButton("",new ImageView(logoimg));
			Label title = new Label("       Energy Saving System");
			title.setFont(new Font(30));
			title.setPrefSize(643, 60);
			title.setStyle("-fx-background-color:#1d1d1d; \n -fx-text-fill:white ;");
			HBox hbox = new HBox();
			hbox.setStyle("-fx-background-color:#1d1d1d");
			hbox.setSpacing(10);
			hbox.getChildren().addAll(logobtn,title,settingLabel);
			VBox vbox = new VBox();
			vbox.setStyle("-fx-background-color:#1d1d1d");
			vbox.setSpacing(10);
			vbox.getChildren().add(hbox);
			Parent Interface = FXMLLoader.load(getClass().getResource("Interface2.fxml"));
			BorderPane root = new BorderPane();
			root.setTop(vbox);
			JFXTabPane pane = new JFXTabPane();
			Tab tab1 = new Tab();
			Tab tab2 = new Tab();
			tab2.setText("Tweaks");
			tab2.setContent(FXMLLoader.load(getClass().getResource("Settings.fxml")));
			tab1.setText("Statistics");
			tab1.setContent(Interface);
			pane.getTabs().addAll(tab1,tab2);
			root.setCenter(pane);
			Scene scene = new Scene(root,835,550);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			settingLabel.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
				try {
					Parent settingInterface = FXMLLoader.load(getClass().getResource("Settings.fxml"));
					root.setCenter(settingInterface);
				} catch (Exception e1) {

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
