package edu.stevens.friccobo;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterController {
    AtomicInteger i = new AtomicInteger();

    @FXML
    Text currentCount;

    public void doSomethingOnClick(){
        i.incrementAndGet();
        currentCount.setText(String.valueOf(i));
    }
}
