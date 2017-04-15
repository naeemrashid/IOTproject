package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

import javax.xml.soap.Detail;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ChartControls implements Initializable{
	 @FXML
	    private TableView<Details> table;

	    @FXML
	    private PieChart chart;
	    private ObservableList<Details> list = FXCollections.observableArrayList();
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TableColumn<Details, String> name = new TableColumn<>("Name");
		name.setPrefWidth(100);
		TableColumn<Details, String> todayExpense = new TableColumn<>("Today Expense");
		todayExpense.setPrefWidth(100);
		TableColumn<Details, String> todayUnits = new TableColumn<>("Today Units");
		todayUnits.setPrefWidth(100);
		TableColumn<Details, String> totalExpense = new TableColumn<>("Total Expense");
		totalExpense.setPrefWidth(100);
		TableColumn<Details, String> totalUnits = new TableColumn<>("Total Units");
		totalUnits.setPrefWidth(100);
		name.setCellValueFactory(new PropertyValueFactory<Details,String>("name"));
		todayExpense.setCellValueFactory(new PropertyValueFactory<Details,String>("todayExpense"));
		todayUnits.setCellValueFactory(new PropertyValueFactory<Details,String>("todayUnits"));
		totalExpense.setCellValueFactory(new PropertyValueFactory<Details,String>("totalExpense"));
		totalUnits.setCellValueFactory(new PropertyValueFactory<Details,String>("totalUnits"));
		table.getColumns().addAll(name,todayExpense,todayUnits,totalExpense,totalUnits);
		Details detail1 = new Details("naeem", "3400", "40", "6000", "67");
		list.addAll(detail1, new Details("naeem", "3400", "40", "6000", "67"),new Details("naeem", "3400", "40", "6000", "67"),new Details("naeem", "3400", "40", "6000", "67"),new Details("naeem", "3400", "40", "6000", "67"),new Details("naeem", "3400", "40", "6000", "67"),new Details("naeem", "3400", "40", "6000", "67"),new Details("naeem", "3400", "40", "6000", "67"),new Details("naeem", "3400", "40", "6000", "67"));
		table.setItems(list);
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Device 1", 200),
				new PieChart.Data("Device 2", 130),
				new PieChart.Data("Device 3", 100),
				new PieChart.Data("Device 4", 200),
				new PieChart.Data("Device 5", 10),
				new PieChart.Data("Device 6", 20),
				new PieChart.Data("Device 7", 300),
				new PieChart.Data("Device 8", 50),
				new PieChart.Data("Device 9", 6)
				
			
				);
		chart.setLabelsVisible(true);
		chart.setLabelLineLength(3);
		chart.setLegendSide(Side.BOTTOM);
		chart.setData(pieChartData);
		
		
		  
	}

}
