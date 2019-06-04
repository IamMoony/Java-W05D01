package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class ButtonExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button btn = new Button("I'm a button");
        btn.setText("BUTTON");

        VBox vbox = new VBox(btn);

        Scene scene = new Scene(vbox, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) { Application.launch(args); }
}
