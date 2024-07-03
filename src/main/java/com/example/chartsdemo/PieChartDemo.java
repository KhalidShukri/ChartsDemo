package com.example.chartsdemo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class PieChartDemo extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Apple",30),
                new PieChart.Data("Banana",20),
                new PieChart.Data("Cherry",15),
                new PieChart.Data("Date",10),
                new PieChart.Data("ElderBerry",5)
        );
        PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Fruit Consumption");
        Scene scene = new Scene(chart,800,600);
        stage.setTitle("Pie Chart Demo");
        stage.setScene(scene);
        chart.setStyle("-fx-background-color: linear-gradient(to right,cyan,violet)");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
