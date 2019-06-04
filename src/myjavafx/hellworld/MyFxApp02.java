package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class MyFxApp02 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        new FirstStage();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
