package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyComboBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("My ComboBox example");

        ComboBox comboBox = new ComboBox();
        Button btn = new Button("Read selected value");

        comboBox.getItems().add("Choice 1");
        comboBox.getItems().add("Choice 2");
        comboBox.getItems().add("Choice 3");

        comboBox.setEditable(true);

        VBox vbox = new VBox(comboBox, btn);

        btn.setOnAction(e -> {
            // String value = (String) comboBox.getValue();
                System.out.println("Selected value = " + comboBox.getValue());
        });

        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();



    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
