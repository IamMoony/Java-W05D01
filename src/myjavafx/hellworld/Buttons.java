package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Buttons extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button button = new Button("Button 2");
        button.setStyle("-fx-background-color: #0000ff");

        String styles =
                "-fx-background-color: #0000ff;" +
                        "-fx-border-color: #ff0000;" ;

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        button1.setStyle(styles);
        button2.setStyle("-fx-background-color: white;");

        // VBox vbox = new VBox(button1);
        HBox hbox = new HBox(button1, button2);

        primaryStage.setScene(new Scene(hbox, 400, 200));
        primaryStage.show();

    }

    public static void main(String[] args) { Application.launch(args); }


    }
