import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TextField numberone;
    public TextField numbertwo;
    public Label result;

    private int number1;
    private int number2;
    private int total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void onClickPlus(ActionEvent actionEvent) {
       number1 = Integer.parseInt(numberone.getText());
        number2 = Integer.parseInt(numbertwo.getText());
        total = number1 + number2;
        result.setText(String.valueOf(total));


    }

    public void onClickMultiply(ActionEvent actionEvent) {
        number1 = Integer.parseInt(numberone.getText());
        number2 = Integer.parseInt(numbertwo.getText());
        total = number1 * number2;
        result.setText(String.valueOf(total));
    }
}
