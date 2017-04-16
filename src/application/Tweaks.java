package application;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Tweaks {
	
	public BorderPane getPane(){
		
		Image bulb = new Image(getClass().getResourceAsStream("bulb.png"));
		Image fan = new Image(getClass().getResourceAsStream("fan.png"));
		Image tv = new Image(getClass().getResourceAsStream("tv.png"));
		Image fridge = new Image(getClass().getResourceAsStream("fridge.png"));
		
		BorderPane pane = new BorderPane();
		VBox vbox = new VBox();
		HBox hbox0 = new HBox();
		hbox0.setSpacing(50);
		hbox0.setPadding(new Insets(20,0,0,20));
		HBox hbox1 = new HBox();
		hbox1.setSpacing(50);
		hbox1.setPadding(new Insets(20,0,0,20));
//		hbox1.setStyle("-fx-background-color: black");
		HBox hbox2 = new HBox();
		hbox2.setSpacing(50);
		hbox2.setPadding(new Insets(20,0,0,20));
		HBox hbox3 = new HBox();
		hbox3.setSpacing(50);
		hbox3.setPadding(new Insets(20,0,0,20));
		HBox hbox4 = new HBox();
		hbox4.setSpacing(50);
		hbox4.setPadding(new Insets(20,0,0,20));
		//---hbox0 content.
		Label device = new Label("Device");
		device.setFont(new Font(20));
		device.setPrefSize(100, 20);
//		device.setMaxSize(100,50);
		Label status = new Label("Status");
		status.setFont(new Font(20));
		status.setPrefSize(100, 20);
		Label limitLabel = new Label("Limit");
		limitLabel.setFont(new Font(20));
		limitLabel.setPrefSize(100, 20);
//		JFXTextField limit = new JFXTextField();
		Label device1 = new Label("",new ImageView(bulb));
		device1.setFont(new Font(20));
		device1.setPrefSize(100, 20);
		Label device2 = new Label("",new ImageView(fan));
		device2.setFont(new Font(20));
		device2.setPrefSize(100, 20);
		Label device3 = new Label("", new ImageView(fridge));
		device3.setPrefSize(100, 20);
		device3.setFont(new Font(20));
		Label device4 = new Label("",new ImageView(tv));
		device4.setFont(new Font(20));
		device4.setPrefSize(100, 20);
		JFXTextField limit1 = new JFXTextField();
		JFXTextField limit2 = new JFXTextField();
		JFXTextField limit3 = new JFXTextField();
		JFXTextField limit4 = new JFXTextField();
		limit1.setPrefSize(100, 20);
		limit2.setPrefSize(100, 20);
		limit3.setPrefSize(100, 20);
		limit4.setPrefSize(100, 20);
		
		JFXComboBox<String> box1 = new JFXComboBox<>();
		JFXComboBox<String> box2 = new JFXComboBox<>();
		JFXComboBox<String> box3 = new JFXComboBox<>();
		JFXComboBox<String> box4 = new JFXComboBox<>();
		box1.getItems().addAll("RS","Watt");
		box2.getItems().addAll("RS","Watt");
		box3.getItems().addAll("RS","Watt");
		box4.getItems().addAll("RS","Watt");
		box1.getSelectionModel().select(1);
		box2.getSelectionModel().select(1);
		box3.getSelectionModel().select(1);
		box4.getSelectionModel().select(1);
		JFXToggleButton btn1 = new JFXToggleButton();
		JFXToggleButton btn2 = new JFXToggleButton();
		JFXToggleButton btn3 = new JFXToggleButton();
		JFXToggleButton btn4 = new JFXToggleButton();
		hbox0.getChildren().addAll(device,status,limitLabel);
		hbox1.getChildren().addAll(device1,btn1,limit1,box1);
		hbox2.getChildren().addAll(device2,btn2,limit2,box2);
		hbox3.getChildren().addAll(device3,btn3,limit3,box3);
		hbox4.getChildren().addAll(device4,btn4,limit4,box4);
		vbox.getChildren().addAll(hbox0,hbox1,hbox2,hbox3,hbox4);
		pane.setCenter(vbox);
//		pane.setStyle("-fx-background-color: black; \n -fx-text-fill: white");
		pane.setId("tweakPane");
		
		return pane;
	}

}
