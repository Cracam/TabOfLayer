/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LECOURT Camille
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;
import taboftiltedpane.TabOfTiltedPane;

public class TabOfTiltedPaneTest extends Application {

        @Override
        public void start(Stage primaryStage) {

                TabPane tabPane = new TabPane();

                // Create a Tab and add it to the TabPane
                TabOfTiltedPane tab = new TabOfTiltedPane("Test");
                tabPane.getTabs().add(tab);

                Scene scene = new Scene(tabPane);
                primaryStage.setTitle("Tad Interface Test");
                primaryStage.setScene(scene);
                primaryStage.show();
                
                TitledPane titledPane = new TitledPane();
                titledPane.setText("test");

                // Add the TitledPane to the VBox in the TabOfTiltedPane
              ///  tab.addNodeToVBox(titledPane);
                
        }

        public static void main(String[] args) {
                launch(args);
        }
        
        
}
