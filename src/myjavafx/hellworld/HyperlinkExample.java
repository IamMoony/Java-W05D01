package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class HyperlinkExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        InputStream input = this.getClass().getResourceAsStream("/pepe.png");

        Image pepe = new Image(input);
        ImageView imageView = new ImageView(pepe);

        Hyperlink hl = new Hyperlink("Click me baby");
        Hyperlink hl2 = new Hyperlink("Again pls");
        Hyperlink hl3 = new Hyperlink("One more time");

        VBox vbox = new VBox();

        vbox.getChildren().add(hl);

        hl.setOnAction(e -> {
           vbox.getChildren().add(hl2);
        });

        hl2.setOnAction(e -> {
            vbox.getChildren().add(hl3);
        });

        hl3.setOnAction(e -> {
            vbox.getChildren().add(imageView);
        });



        Scene scene = new Scene(vbox, 800, 250);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) { Application.launch(args); }

}
