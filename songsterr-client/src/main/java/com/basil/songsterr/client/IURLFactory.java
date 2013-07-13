/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basil.songsterr.client;

import com.basil.songsterr.client.search.SearchBean;
import java.net.URL;

/**
 *
 * @author Basil
 */
public interface IURLFactory {
    URL getURL(SearchBean bean);
}
