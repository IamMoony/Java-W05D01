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

public class SecondStage extends Stage {


  Label label = new Label("Second Stage");
  VBox v = new VBox();


    public SecondStage() {

        v.getChildren().add(label);
        this.setScene(new Scene(v, 400, 200));
        this.show();

    }
}
