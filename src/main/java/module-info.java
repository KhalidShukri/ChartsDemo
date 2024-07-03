module com.example.chartsdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chartsdemo to javafx.fxml;
    exports com.example.chartsdemo;
}