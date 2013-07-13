/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basil.songsterr.client.search;

import java.net.URL;
import com.basil.songsterr.client.ArtistURLFactory;
import com.basil.songsterr.client.IURLFactory;
import com.basil.songsterr.client.SongURLFactory;
import com.basil.songsterr.client.search.ui.SearchFormController;


/**
 *
 * @author Basil
 */
public class SearchEngine {
    
    private SearchFormController controller;
    
    public SearchEngine(SearchFormController controller) {
        super();
        this.controller = controller;
    }
    
    
    public String search(SearchBean bean) {
        IURLFactory factory = null;
        if (bean.getArtist().equals("") && !bean.getSong().equals("")) {
            factory = new SongURLFactory();
        } else if (!bean.getArtist().equals("")) {
            factory = new ArtistURLFactory();
        }
        
        URL url = (factory != null) ? factory.getURL(bean) : null;
        
        if (url != null) {
            /*ClientConfig cc = new DefaultClientConfig();
            cc.getProperties().put(ClientConfig.PROPERTY_THREADPOOL_SIZE, 2);
            Client c = Client.create(cc);
            AsyncWebResource r = c.asyncResource("http://somehost.tld/resource").build());*/
        }
        return "";
    }
}