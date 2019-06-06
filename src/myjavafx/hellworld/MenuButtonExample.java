package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.InputStream;

public class MenuButtonExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        MenuItem menuItem1 = new MenuItem("Option 1");
        MenuItem menuItem2 = new MenuItem("Option 2");
        MenuItem menuItem3 = new MenuItem("Option 3");

        InputStream input = this.getClass().getResourceAsStream("/Coffee-icon.png");

        Image img = new Image(input);
        ImageView imgView = new ImageView(img);

        MenuButton menuButton = new MenuButton(
                "Options", imgView, menuItem1, menuItem2, menuItem3);

        menuItem3.setOnAction(e -> {
            System.out.println("Menu option 3 selected");
        });

        VBox vbox = new VBox(menuButton);

        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();







    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
