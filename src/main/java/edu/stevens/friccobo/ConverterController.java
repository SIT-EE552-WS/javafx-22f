package edu.stevens.friccobo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.util.StringConverter;

public class ConverterController {

    @FXML
    public TextField celsiusTemp;

    @FXML
    public TextField fahrenheitTemp;

    @FXML
    public void initialize(){
        fahrenheitTemp.textProperty().bindBidirectional(celsiusTemp.textProperty(), new StringConverter<String>(){

            @Override
            public String toString(String fahrenheit) {
                try {
                    double v = Double.parseDouble(fahrenheit) * (9.0 / 5.0) + 32.0;
                    return String.valueOf(v);
                } catch (NumberFormatException nfe){
                    return "";
                }
            }

            @Override
            public String fromString(String celsius) {
                try {
                    double v = (Double.parseDouble(celsius) - 32.0) * (5.0 / 9.0);
                    return String.valueOf(v);
                } catch (NumberFormatException nfe){
                    return "";
                }
            }
        });
    }
}
