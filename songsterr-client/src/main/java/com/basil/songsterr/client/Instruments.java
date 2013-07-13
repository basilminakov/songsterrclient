/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basil.songsterr.client;

/**
 *
 * @author Basil
 */
public enum Instruments {
   GUITAR("Guitar"),
   BASS("Bass"),
   DRUMS("Drums"),
   ANY("Any");
   
   private String instTitle;
   
   Instruments(String title) {
       this.instTitle = title;
   }
   
   public String getTitle() {
       return instTitle;
   }
   
   public static Instruments getByCode(String code) {
       for (Instruments item : values()) {
           if (item.getTitle().equals(code)) {
               return item;
           }
       }
       return Instruments.ANY;
   }
}
