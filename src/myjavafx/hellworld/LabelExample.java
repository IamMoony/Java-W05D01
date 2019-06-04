package myjavafx.hellworld;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class LabelExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        InputStream input = this.getClass().getResourceAsStream("/Coffee-Shop-icon.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);


        Label label = new Label("I'm lord label", imageView);
        Label label2 = new Label("Just looking");

        VBox vbox = new VBox(label, label2);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) { Application.launch(args); }
}
