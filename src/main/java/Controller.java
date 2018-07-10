import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Button one;
    public Button calculate;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button plus;
    public Button minus;
    public Button multiply;
    public TextField result;
    public Button divide;
    public Button dot;
    public Button clear;
    public Button zero;

    private int firstNumbers = 0;
    private int operation = -1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void handleButtonAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == one) {
            result.setText(result.getText() + String.valueOf(1));
        } else if (actionEvent.getSource() == two) {
            result.setText(result.getText() + String.valueOf(2));
        } else if (actionEvent.getSource() == three) {
            result.setText(result.getText() + String.valueOf(3));
        } else if (actionEvent.getSource() == four) {
            result.setText(result.getText() + String.valueOf(4));
        } else if (actionEvent.getSource() == five) {
            result.setText(result.getText() + String.valueOf(5));
        } else if (actionEvent.getSource() == six) {
            result.setText(result.getText() + String.valueOf(6));
        } else if (actionEvent.getSource() == seven) {
            result.setText(result.getText() + String.valueOf(7));
        } else if (actionEvent.getSource() == eight) {
            result.setText(result.getText() + String.valueOf(8));
        } else if (actionEvent.getSource() == nine) {
            result.setText(result.getText() + String.valueOf(9));
        } else if (actionEvent.getSource() == zero) {
            result.setText(result.getText() + String.valueOf(0));
        } else if (actionEvent.getSource() == clear) {
            result.clear();
        } else if (actionEvent.getSource() == plus) {
            firstNumbers = Integer.parseInt(result.getText());
            operation = 1;
            result.clear();
        } else if (actionEvent.getSource() == minus) {
            firstNumbers = Integer.parseInt(result.getText());
            operation = 2;
            result.clear();
        } else if (actionEvent.getSource() == divide) {
            firstNumbers = Integer.parseInt(result.getText());
            operation = 3;
            result.clear();
        } else if (actionEvent.getSource() == multiply) {
            firstNumbers = Integer.parseInt(result.getText());
            operation = 4;
            result.clear();
        } else if (actionEvent.getSource() == calculate) {
            try {
                int secondNumbers = Integer.parseInt(result.getText());
                switch (operation) {

                    case 1:
                        int total = firstNumbers + secondNumbers;
                        result.setText(String.valueOf(total));

                        break;
                    case 2:
                        total = firstNumbers - secondNumbers;
                        result.setText(String.valueOf(total));

                        break;
                    case 3:
                        total = firstNumbers / secondNumbers;
                        result.setText(String.valueOf(total));

                        break;
                    case 4:
                        total = firstNumbers * secondNumbers;
                        result.setText(String.valueOf(total));

                        break;
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Pick a number, mong ");
            }
        }
    }
}


