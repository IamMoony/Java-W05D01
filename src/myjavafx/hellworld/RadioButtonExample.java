package myjavafx.hellworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        RadioButton radioBtn  = new RadioButton("Radio Button");
        RadioButton radioBtn1 = new RadioButton("Radio Button1");
        RadioButton radioBtn2 = new RadioButton("Radio Button2");
        RadioButton radioBtn3 = new RadioButton("Radio Button3");
        RadioButton radioBtn4 = new RadioButton("Radio Button4");
        Button btn = new Button("Read selected value");

        ToggleGroup radioGroup = new ToggleGroup();

        radioBtn1.setToggleGroup(radioGroup);
        radioBtn2.setToggleGroup(radioGroup);
        radioBtn3.setToggleGroup(radioGroup);
        radioBtn4.setToggleGroup(radioGroup);



        // String radioBtnSelected = radioBtn.getText();
        radioBtn.setOnAction(e -> {
            boolean isSelected1 = radioBtn.isSelected();
            if(isSelected1) {
                radioBtn.setText("Right");
            } else {
                radioBtn.setText("Left");
            }
});


        btn.setOnAction(a -> {
            RadioButton selectedRadioBtn = (RadioButton) radioGroup.getSelectedToggle();
            String value = selectedRadioBtn.getText();
            System.out.println("Selected radio button: " + value);
        });



        // System.out.println(radioBtn.getText());

        VBox vbox = new VBox(radioBtn, radioBtn1, radioBtn2, radioBtn3, radioBtn4, btn);

        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
