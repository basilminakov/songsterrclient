/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basil.songsterr.client.search;

import com.basil.songsterr.client.Instruments;


/**
 *
 * @author Basil
 */
public class SearchBean {
    /*Main variables*/
    private String artist;
    private String song;
    private Instruments instrument;
    
    public SearchBean(String artist, String song, Instruments instrument) {
        super();
        this.artist = artist;
        this.song  = song;
        this.instrument = instrument;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public String getSong() {
        return song;
    }
    
    public String getInstrument() {
        return instrument.getTitle();
    }
}
