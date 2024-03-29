/*
 * Bataille Navale
 * http://code.google.com/p/bataille-navale/
 * Alexis Dörr - Mélissa Weissmuller - Laurent Sittler
 */
package com.bataillenavale.input;

/**
 * Input Interface
 * 
 * @author Alexis, Mélissa, Laurent
 */
public interface Input {
    
    /**
     * Initialize input components
     */
    public void init();
    
    /**
     * Update input components
     */
    public abstract void update();
    
    /**
     * Destroy input components
     */
    public abstract void destroy();
    
    /**
     * Return true if Enter is pressed
     */
    public boolean isEnterPressed();
    
    /**
     * Return true if the arrow down is pressed
     */
    public boolean isDownPressed();
    
    /**
     * Return true if the arrow up is pressed
     */
    public boolean isUpPressed();
    
    /**
     * Return true if the arrow right is pressed
     */
    public boolean isRightPressed();
    
    /**
     * Return true if the arrow left is pressed
     */
    public boolean isLeftPressed(); 
    
    /**
     * Return true if space is pressed
     */
    public boolean isSpacePressed();
}
