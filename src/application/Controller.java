package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXToggleButton;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class Controller implements Initializable {


    @FXML
    private BorderPane borderPane;

    @FXML
    private Label dev1;

    @FXML
    private Label dev2;

    @FXML
    private Label dev3;

    @FXML
    private Label dev4;

    @FXML
    private JFXToggleButton tog1;

    @FXML
    private JFXToggleButton tog2;

    @FXML
    private JFXToggleButton tog3;

    @FXML
    private JFXToggleButton tog4;

    @FXML
    private TableView<URLdetails> table;
    @FXML
    private TableColumn<URLdetails, String> name;

    @FXML
    private TableColumn<URLdetails, String> priceDaily;

    @FXML
    private TableColumn<URLdetails, String> dailyUnits;

    @FXML
    private TableColumn<URLdetails, String> priceMonthly;

    @FXML
    private TableColumn<URLdetails, String> monthlyUnits;
    public static ObservableList<URLdetails> list = FXCollections.observableArrayList();
//	643 60
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		name.setCellValueFactory(new PropertyValueFactory<URLdetails,String>("name"));
		priceDaily.setCellValueFactory(new PropertyValueFactory<URLdetails,String>("priceDaily"));
		dailyUnits.setCellValueFactory(new PropertyValueFactory<URLdetails,String>("dailyUnits"));
		priceMonthly.setCellValueFactory(new PropertyValueFactory<URLdetails,String>("priceMonthly"));
		monthlyUnits.setCellValueFactory(new PropertyValueFactory<URLdetails,String>("monthlyUnits"));
		list.add(new URLdetails("Bulb", "60 $", "40 ","1200", "1000"));
		list.add(new URLdetails("Bulb", "60 $", "40 ","1200", "1000"));
		list.add(new URLdetails("Bulb", "60 $", "40 ","1200", "1000"));
		list.add(new URLdetails("Bulb", "60 $", "40 ","1200", "1000"));
		table.setItems(list);
	}	
}

	class URLdetails {
		
		private	StringProperty name;
		private	StringProperty priceDaily;
		private	StringProperty dailyUnits;
		private	StringProperty priceMonthly;
		private	StringProperty monthlyUnits;
			
			 URLdetails(String name , String priceDaily,String dailyUints, String priceMonthly ,String monthlyUnits){
				this.name = new SimpleStringProperty(name);
				this.priceDaily = new SimpleStringProperty(priceDaily);
				this.dailyUnits = new SimpleStringProperty(dailyUints);
				this.priceMonthly = new SimpleStringProperty(priceMonthly);
				this.monthlyUnits = new SimpleStringProperty(monthlyUnits);
			}
			 String getName() {
				return name.get();
			}

			 void setName(String name) {
				this.name = new SimpleStringProperty(name);
			}

			 String getPriceDaily() {
				return priceDaily.get();
			}

			 void setPriceDaily(String priceDaily) {
				this.priceDaily = new SimpleStringProperty(priceDaily);;
			}

			 String getDailyUnits() {
				return dailyUnits.get();
			}

			 void setDailyUnits(String dailyUnits) {
				this.dailyUnits = new SimpleStringProperty(dailyUnits);
			}

			 String getPriceMonthly() {
				return priceMonthly.get();
			}

			 void setPriceMonthly(String priceMonthly) {
				this.priceMonthly = new SimpleStringProperty(priceMonthly);
			}

			 String getMonthlyUnits() {
				return monthlyUnits.get();
			}

			 void setMonthlyUnits(String monthlyUnits) {
				this.monthlyUnits = new SimpleStringProperty(monthlyUnits);
			}

			
		}
	


