package Db_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Car.CarClass;

public class StoreToDB {

	private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:database.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

   
    public void insert(String brand, String model) {
        String sql = "INSERT INTO showroom(brand,model) VALUES(?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, brand);
            pstmt.setString(2, model);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

  
    public static void main(String[] args) {

    	StoreToDB app = new StoreToDB();
        app.insert("toyota", "fortuner");
        app.insert("maruti", "kizashi");
        app.insert("hyundai", "i20");
        app.insert("tata", "altroz");
    }

}