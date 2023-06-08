module com.mycompany.gamemath {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.gamemath to javafx.fxml;
    exports com.mycompany.gamemath;
}
