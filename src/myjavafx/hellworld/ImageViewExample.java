package myjavafx.hellworld;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.io.InputStream;

import java.io.FileInputStream;

public class ImageViewExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("ImageView example");

        InputStream input = this.getClass().getResourceAsStream("/Coffee-icon.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        InputStream input2 = this.getClass().getResourceAsStream("/Coffee-Shop-icon.png");
        Image image2 = new Image(input2);
        ImageView imageView2 = new ImageView(image2);

        HBox hbox = new HBox(imageView, imageView2);


        hbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(hbox, 200, 100);



        primaryStage.setScene(scene);

        primaryStage.show();





    }

    public static void main(String[] args) { Application.launch(args); }
}
