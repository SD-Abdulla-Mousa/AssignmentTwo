
package javafx.project;

import View.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author abdmf
 */
public class JavaFXProject extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        ViewManager.openRegisterPage();
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
