module com.example.boolean_zmienna {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.boolean_zmienna to javafx.fxml;
    exports com.example.boolean_zmienna;
}