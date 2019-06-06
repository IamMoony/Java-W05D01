package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.InputStream;


public class ButtonExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        InputStream input = this.getClass().getResourceAsStream("/Coffee-icon.png");
        Image img = new Image(input);
        ImageView imgView = new ImageView(img);


        Label lbl = new Label("Not Clicked");

        Button btn = new Button("I'm a button");
        Button btn2 = new Button(
                "My 2nd button has a very long text, that must wrap in a couple of lines");
        Button btn3 = new Button("My 3rd button has an image", imgView);
        Button btn4 = new Button("Click Me!!");

        btn.setText("My Button");
        btn2.setWrapText(true);

        // Button 4 click event
        btn4.setOnAction(e -> {
            lbl.setText("You just clicked the button");
        });

        VBox vbox = new VBox(btn, btn2, btn3, lbl, btn4);

        Scene scene = new Scene(vbox, 200, 200);

        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) { Application.launch(args); }
}
