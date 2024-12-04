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

                tab.addNodeToVBox(titledPane);
                 tab.addNodeToVBox( new TitledPane());
                  tab.addNodeToVBox( new TitledPane());
                   tab.addNodeToVBox( new TitledPane());
                   
                   tab.clearVBox();
                
        }

        public static void main(String[] args) {
                launch(args);
        }
        
        
}
