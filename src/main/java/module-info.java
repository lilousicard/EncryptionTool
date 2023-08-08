module com.encyption.encryptiontool {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.encyption.encryptiontool to javafx.fxml;
    exports com.encyption.encryptiontool;
}