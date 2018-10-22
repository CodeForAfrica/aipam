package com.jamdev.maven.aipam.utils;

import javafx.scene.layout.Pane;

/**
 * Interface for settings panes. 
 * @author Jamie Macaulay
 *
 * @param <T> - the parameter class to alter.
 */
public interface SettingsPane<T> {
	
	/**
	 * Get the pane with controls 
	 * @return
	 */
	public Pane getPane(); 
	
	/**
	 * Get the parameters from the control states.
	 * @return the parameters input- relevant fields of this will be altered to reflect control settings. 
	 */
	public T getParams(T paramsIn); 
	
	/**
	 * Set the controls in the pane to parameter settings
	 */
	public void setParams(T params); 

}