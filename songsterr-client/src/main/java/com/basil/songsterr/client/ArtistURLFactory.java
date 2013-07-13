/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basil.songsterr.client;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.basil.songsterr.client.search.SearchBean;

/**
 *
 * @author Basil
 */
public class ArtistURLFactory extends URLFactory {

    @Override
    public URL getURL(SearchBean bean) {
        try {
            return new URL(new StringBuilder(getBaseURL())
                    .append("a/ra/songs/byartists.xml?artists=")
                    .append(URLEncoder.encode(bean.getArtist(), "UTF-8"))
                    .toString());
        } catch (MalformedURLException ex) {
            Logger.getLogger(ArtistURLFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ArtistURLFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
