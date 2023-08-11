module com.encyption.encryptiontool {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.encyption.encryptiontool to javafx.fxml;
    exports com.encyption.encryptiontool;
}