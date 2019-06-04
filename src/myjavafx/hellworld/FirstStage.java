package myjavafx.hellworld;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstStage extends Stage {


    Button openOtherStage = new Button("Click to open new stage");
    HBox x = new HBox();

    public FirstStage() {

        x.getChildren().add(openOtherStage);
        this.setScene(new Scene(x, 400, 200));
        this.show();

        openOtherStage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                new SecondStage();
            }
        });
    }
}
