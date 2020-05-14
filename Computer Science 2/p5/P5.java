import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 * Program converts inches to yards, feet, and inches using javafx.
 *
 * @author Benjamin Carlson
 * @version May 4th, 2020
 */

public class P5 extends Application
{
   public void start(Stage stage) 
   {
      Scene scene = new Scene(new P5Pane(), 300, 150);
      
      stage.setTitle("Converting inches to yards,feet,inches Benjamin Carlson");
      stage.setScene(scene);
      stage.show();
   }
}
