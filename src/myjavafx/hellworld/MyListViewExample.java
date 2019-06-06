package myjavafx.hellworld;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class MyListViewExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        ListView listView = new ListView();

        listView.getItems().add("List item 1");
        listView.getItems().add("List item 2");
        listView.getItems().add("List item 3");
        listView.getItems().add("List item 4");

        Button btn = new Button("Read selected value");

        HBox hbox = new HBox(listView, btn);

        btn.setOnAction(e -> {
            ObservableList selectedIndices = listView.getSelectionModel().getSelectedIndices();

            for(Object o : selectedIndices) {
                System.out.println("o: " + o + "(" + o.getClass() + ")");
            }
        });

        Scene scene = new Scene(hbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
