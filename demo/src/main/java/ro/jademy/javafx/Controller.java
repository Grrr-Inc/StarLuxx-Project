package ro.jademy.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private Button button;
    @FXML
    private Label label;

    @FXML
    private void initialize() {
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> label.setText("Clicked!!!"));
    }
}
