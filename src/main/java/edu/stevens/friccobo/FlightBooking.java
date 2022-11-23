package edu.stevens.friccobo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FlightBooking {
    @FXML
    public TextField leaveDate;

    @FXML
    public TextField returnDate;
    public ComboBox<String> comboBox;

    @FXML
    public Button book;

    @FXML
    public void initialize(){

    }
}
