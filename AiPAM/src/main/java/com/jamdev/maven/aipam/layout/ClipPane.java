package com.jamdev.maven.aipam.layout;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.TilePane;

/**
 * Pane which shows all the clips. 
 * @author Jamie Macualay 
 *
 */
public class ClipPane extends BorderPane {

	private TilePane tilePane;

	public ClipPane(AIPamView pamSneView) {
		this.setCenter(createPane());
	}
	
	/**
	 * Create the clip pane.
	 * @return the clip pane. 
	 */
	private Node createPane() {
		tilePane = new TilePane();
        tilePane.setPadding(new Insets(5));
        tilePane.setVgap(4);
        tilePane.setHgap(4);
        tilePane.setPrefColumns(4);

        // dont grow more than the preferred number of columns:
        tilePane.setMaxWidth(Region.USE_PREF_SIZE);
        
  
        ZoomableScrollPane sp = new ZoomableScrollPane(tilePane);
    
        tilePane.setStyle("-fx-background-color: #1d1d1d; -fx-font: 12px Segoe; -fx-text-fill: white;");
//        sp.setFitToHeight(true);
        sp.setFitToWidth(true);
        sp.setContent(tilePane);
        
        
		return sp;

	}

}
