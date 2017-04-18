package application;
	
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTabPane;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Side;
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
//			Image setting = new Image(getClass().getResourceAsStream("setting.png"j));
			Image logoimg = new Image(getClass().getResourceAsStream("logo.png"));
//			Button settingbtn = new Button("",new ImageView(setting));
//			settingLabel.setStyle("-fx-background-color:#1d1d1d");
			JFXButton logobtn = new JFXButton("",new ImageView(logoimg));
			Label title = new Label("       Energy Saving System");
			title.setFont(new Font(30));
			title.setPrefSize(650, 60);
			title.setStyle("-fx-background-color:#1d1d1d; \n -fx-text-fill:white ;");
			HBox hbox = new HBox();
			hbox.setStyle("-fx-background-color:#1d1d1d");
			hbox.setSpacing(10);
			hbox.setPadding(new Insets(10,10,10,10));
			hbox.getChildren().addAll(logobtn,title);
			BorderPane root = new BorderPane();
			root.setTop(hbox);
			JFXTabPane pane = new JFXTabPane();
			pane.setSide(Side.RIGHT);
			Tab tab1 = new Tab();
			Tab tab2 = new Tab();
			Tab tab3 = new Tab();
			tab3.setText("Settings");
			tab2.setText("Tweaks");
			tab2.setContent(new Tweaks().getPane());
			tab1.setText("Statistics");
			tab1.setContent(new ChartControls().getPane());
			pane.getTabs().addAll(tab1,tab2,tab3);
			root.setCenter(pane);
			Scene scene = new Scene(root,910,550);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
