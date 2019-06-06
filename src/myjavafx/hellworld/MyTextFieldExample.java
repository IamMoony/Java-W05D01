package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class MyTextFieldExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Textfield Example");


        Button btn = new Button("Click me to get textfield value");
        TextField txtField = new TextField();
        txtField.setText("Initial value");

        btn.setOnAction(e -> {
            System.out.println(txtField.getText());
        });

        HBox hbox = new HBox(txtField, btn);

        Scene scene = new Scene(hbox, 200, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }


}
