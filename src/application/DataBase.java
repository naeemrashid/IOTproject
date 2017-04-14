package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class DataBase {
	private static Connection c = null;
	private static PreparedStatement perp = null;
	private static java.util.Date date = new java.util.Date();
	private static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	public DataBase() {
		CreateDataBase();
	}

	// ------------------------------------------------------Creating SQLITE
	// DATABASE and TABLE--------------------------------------//
	public static void CreateDataBase() {
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:database.db");
			// System.out.println("Opened database successfully");
			Statement stat = c.createStatement();
			ResultSet res = stat.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='iot'");
			if (!res.next()) {
				perp = c.prepareStatement("CREATE TABLE if not exists url( dev_id INTEGER PRIMARY KEY AUTOINCREMENT"
						+ ",name varchar(40) not null," + ",pricedaily varchar(40) not null,"
						+ ",dailyunits varchar(40) not null," + ",pricemonthly varchar(40) not null,"
						+ ",monthlyunits varchar(40) not null);");
				perp.executeUpdate();
				perp.close();
			}
			c.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("issues");
		}
	}
}
