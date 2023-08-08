package com.encyption.encryptiontool;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class EncryptionApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EncryptionApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), Screen.getPrimary().getBounds().getMaxX(), Screen.getPrimary().getBounds().getMaxY());
        stage.setTitle("The Encryptor");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}