/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basil.songsterr.client;


/**
 *
 * @author Basil
 */
public abstract class URLFactory implements IURLFactory {
    private final String baseURL = "http://www.songsterr.com/";
    
    protected String getBaseURL() {
        return baseURL;
    }
}
