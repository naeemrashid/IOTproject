package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Details {

//	private	StringProperty name;
//	private	StringProperty todayExpense;
//	private	StringProperty todayUnits;
//	private	StringProperty totalExpense;
//	private	StringProperty totalUnits;

	private	StringProperty name;
	private	StringProperty todayExpense;
	private	StringProperty todayUnits;
	private	StringProperty totalExpense;
	private	StringProperty totalUnits;
		
		public Details(String name , String todayExpense,String todayUnits, String totalExpense ,String totalUnits){
			this.name = new SimpleStringProperty(name);
			this.todayExpense = new SimpleStringProperty(todayExpense);
			this.todayUnits = new SimpleStringProperty(todayUnits);
			this.totalExpense = new SimpleStringProperty(totalExpense);
			this.totalUnits = new SimpleStringProperty(totalUnits);
		}
		
		
		public String getName() {
			return name.get();
		}
		public String getTotalExpense() {
			return totalExpense.get();
		}
		public String getTotalUnits() {
			return totalUnits.get();
		}
		
		public String getTodayExpense() {
			return todayExpense.get();
		}
		public String getTodayUnits() {
			return todayUnits.get();
		}
		public void setName(String name){
			this.name = new SimpleStringProperty(name);
		}
		public void setTodayExpense(String todayExpense){
			this.todayExpense = new SimpleStringProperty(todayExpense);
		}
		public void setTodayUnits(String todayUnits){
			this.todayUnits = new SimpleStringProperty(todayUnits);
		}
		public void setTotalExpense(String totalExpense){
			this.totalExpense = new SimpleStringProperty(totalExpense);
		}
		@Override
		public String toString(){
			return this.name.toString();
		}




}
