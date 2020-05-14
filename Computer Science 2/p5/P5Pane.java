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
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 * Program converts inches to yards, feet, and inches using javafx.
 *
 * @author Benjamin Carlson
 * @version May 4th, 2020
 */

public class P5Pane extends GridPane
{
   private Label outYards,outFeet,outInches;
   private TextField inputInches;
   
   public P5Pane()
   {
       Label inputLabel = new Label("Input Inches in Range 0 to 100000 :");
       GridPane.setHalignment(inputLabel, HPos.RIGHT);
       
       Label yardsLabel = new Label("Yards:");
       GridPane.setHalignment(yardsLabel, HPos.RIGHT);
       
       Label feetLabel = new Label("Feet:");
       GridPane.setHalignment(feetLabel, HPos.RIGHT);
       
       Label inchesLabel = new Label("Inches:");
       GridPane.setHalignment(inchesLabel, HPos.RIGHT);
       
       outYards = new Label("---");
       GridPane.setHalignment(outYards, HPos.RIGHT);
       
       outFeet = new Label("---");
       GridPane.setHalignment(outFeet, HPos.RIGHT);
       
       outInches = new Label("---");
       GridPane.setHalignment(outInches, HPos.RIGHT);
       
       inputInches = new TextField();
       inputInches.setPrefWidth(50);
       inputInches.setAlignment(Pos.CENTER);
       inputInches.setOnAction(this::calculate);
       
       setAlignment(Pos.CENTER);
       setHgap(20);
       setVgap(10);
       setStyle("-fx-background-color: limegreen");
       
       add(inputLabel, 0, 0);
       add(inputInches, 1, 0);
       add(yardsLabel,0 ,1 );
       add(feetLabel, 0, 2);
       add(inchesLabel, 0, 3);
       add(outYards, 1, 1);
       add(outFeet, 1, 2);
       add(outInches, 1, 3);
   }
   
   public void calculate(ActionEvent event)
   {
       int number = Integer.parseInt(inputInches.getText());
       int yard = (int) (number/36);
       int yard_rem = (int) (number%36);
       int feet = (int) (yard_rem/12);
       int feet_rem = (int) (yard_rem%12);
       int inches = feet_rem;

       outYards.setText(yard+"");
       outFeet.setText(feet+"");
       outInches.setText(inches+"");       
   }
}
