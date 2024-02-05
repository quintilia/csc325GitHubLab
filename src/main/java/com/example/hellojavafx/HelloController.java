package com.example.hellojavafx;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField textFieldNewShowName;
    @FXML
    private ListView<String> listViewShows;

    public void initialize(){
        System.out.println("initialize called");
        ObservableList<String> items = listViewShows.getItems();
        items.add("What we do in the shadows");
        items.add("Superstore");
    }

    public void handleAddShowButton(){
        System.out.println(("handleAddShowButton called"));

        String newShowName;
        newShowName = textFieldNewShowName.getText();

        ObservableList<String> items = listViewShows.getItems();
        items.add(newShowName);

        textFieldNewShowName.clear();

    }

}