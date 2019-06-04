package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MyFxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");

       // Label label = new Label("Hello World, JavaFX !");
        Label label = new Label("HBox");
        Label label2 = new Label("Vbox");

        TextField textField = new TextField();
        TextField textField2 = new TextField();

        HBox hb = new HBox();
        HBox hb2 = new HBox();

        hb.getChildren().addAll(label, textField);
        hb.setSpacing(10);
        hb2.getChildren().addAll(label2, textField2);
        hb2.setSpacing(10);

        Scene scene = new Scene(hb, 500, 300);
        Scene scene2 = new Scene(hb2, 500, 300);

        primaryStage.setScene(scene);
        primaryStage.setScene(scene2);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
