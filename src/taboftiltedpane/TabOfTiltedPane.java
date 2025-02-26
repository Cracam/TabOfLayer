package taboftiltedpane;

import Exeptions.ResourcesFileErrorException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.VBox;

/**
 *
 * @author Camille LECOURT
 */
public class TabOfTiltedPane extends Tab {
    @FXML
    private VBox vBox;

    @FXML
    private Label nothingLabel;

    public TabOfTiltedPane(String name) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/TabDesignBuilder.fxml"));
            if (fxmlLoader == null) {
                throw new ResourcesFileErrorException();
            }
            fxmlLoader.setRoot(this);
            fxmlLoader.setController(this);
            fxmlLoader.load();
            
                this.setText(name);
                    //    vBox.setStyle("-fx-border-color: blue; -fx-border-width: 2px; -fx-border-style: solid;");

        } catch (IOException | ResourcesFileErrorException | IllegalArgumentException ex) {
            Logger.getLogger(TabOfTiltedPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Adds a JavaFX object to the bottom of the VBox and hides the nothingLabel.
     *
     * @param node The JavaFX object to add.
     */
    public void addNodeToVBox(Node node) {
        if (vBox != null && nothingLabel != null) {
            nothingLabel.setVisible(false);
            nothingLabel.setPadding(new Insets(0,0,0,0));
            vBox.getChildren().add(node);
            
             //vBox.setHgrow(node, javafx.scene.layout.Priority.ALWAYS);
          //    node.setMaxWidth(Double.MAX_VALUE);

        }
    }

    /**
     * Deletes every JavaFX element from the VBox except the nothingLabel,
     * which will be set to visible.
     */
    public void clearVBox() {
        if (vBox != null && nothingLabel != null) {
            vBox.getChildren().clear();
            vBox.getChildren().add(nothingLabel);
            nothingLabel.setPadding(new Insets(10,10,10,10));
            nothingLabel.setVisible(true);
        }
    }
}