package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BarChartExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Devices");

        CategoryAxis yAxis = new CategoryAxis();
        yAxis.setLabel("Visits");

        BarChart barChart = new BarChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();

        dataSeries1.setName("2014");

        dataSeries1.getData().add(new XYChart.Data("Desktop", 178));
        dataSeries1.getData().add(new XYChart.Data("Phone", 67));
        dataSeries1.getData().add(new XYChart.Data("Tablet", 23));

        barChart.getData().add(dataSeries1);

        VBox vbox = new VBox(barChart);

        Scene scene = new Scene(vbox, 1000, 500);

        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {

        Application.launch(args);
    }
}
