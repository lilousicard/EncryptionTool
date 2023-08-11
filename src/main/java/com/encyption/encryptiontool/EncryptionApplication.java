package com.encyption.encryptiontool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import model.DatabaseAccessor;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EncryptionApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EncryptionApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), Screen.getPrimary().getBounds().getMaxX(), Screen.getPrimary().getBounds().getMaxY());
        stage.setTitle("The Encryptor");
        stage.setScene(scene);
        stage.show();

        try {
            DatabaseAccessor dbAccessor = new DatabaseAccessor();

            // Execute a SELECT query
            ResultSet resultSet = dbAccessor.executeQuery("SELECT * FROM Users WHERE Username = ?", "john_doe");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(5));
            }

            // Execute an UPDATE query
            //int rowsAffected = dbAccessor.executeUpdate("UPDATE users SET email = ? WHERE username = ?", "new@example.com", "john_doe");

            dbAccessor.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}