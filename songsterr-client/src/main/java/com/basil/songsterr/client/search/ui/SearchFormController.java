/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basil.songsterr.client.search.ui;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.web.WebView;

import com.basil.songsterr.client.Instruments;
import com.basil.songsterr.client.search.SearchBean;
import com.basil.songsterr.client.search.SearchEngine;

/**
 * FXML Controller class
 *
 * @author Basil
 */
public class SearchFormController implements Initializable {

    private SearchEngine engine;
    @FXML private Accordion paramAccordion;
    @FXML private Button searchButton;
    @FXML private ComboBox<String> songCombo;
    @FXML private ComboBox<String> artistCombo;
    //@FXML private ComboBox<String> searchCombo;
    @FXML private TitledPane songPane;
    @FXML private TitledPane artistPane;
    @FXML private TitledPane searchPane;
    @FXML private TextField songName;
    @FXML private TextField artistName;
    @FXML private WebView view;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine = new SearchEngine(this);
        
        initComboBox(songCombo);
        initComboBox(artistCombo);
        
    }
    
    public void doSearch() {
        TitledPane tp = paramAccordion.getExpandedPane();
        Instruments instrument = Instruments.ANY;/*Instruments.getByCode(songCombo.getSelectionModel().getSelectedItem().toString());*/
        switch (tp.getId()) {
            case "songPane": 
                engine.search(new SearchBean("", songName.getText(), instrument));
                break;
            case "artistPane":
                engine.search(new SearchBean(artistName.getText(), "", instrument));
        }
    }
    
    public void doClose() {
        Runtime.getRuntime().exit(0);
    }
    
    private Collection<String> getInstruments() {
        Collection<String> items;
        items = new ArrayList<String>();
        items.add(Instruments.ANY.getTitle());
        items.add(Instruments.GUITAR.getTitle());
        items.add(Instruments.BASS.getTitle());
        items.add(Instruments.DRUMS.getTitle());
        
        return items;
    }

    private void initComboBox(ComboBox box) {
        box.getItems().clear();
        box.getItems().addAll(getInstruments());
    }
}
