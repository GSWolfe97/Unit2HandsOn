/*
 *  Program:    Unit 2 Hands-on
 *  Date:       3/5/18
 *  Developer:  Garrett Wolfe
 *  Purpose:    Create a USD to CAD conversion.  
 */
package unit2;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

public class Unit2 extends Application{
    final double CAD_PER_USD = 1.5;
    protected TextField tfUSD = new TextField();
    protected TextField tfCAD = new TextField();
    Button convert = new Button("Convert");

    @Override 
    public void start(Stage primaryStage) {
	tfUSD.setAlignment(Pos.BOTTOM_RIGHT);
	tfCAD.setAlignment(Pos.BOTTOM_RIGHT);
        

	GridPane pane = new GridPane();
	pane.setAlignment(Pos.CENTER);
	pane.add(new Label("USD"), 0, 0);
	pane.add(tfUSD, 1, 0);
	pane.add(new Label("Canadian"), 0, 1);
	pane.add(tfCAD, 1, 1);
        pane.add(convert, 1, 2);

        convert.setOnAction((ActionEvent) -> {
            double miles = Double.parseDouble(tfUSD.getText());
            tfCAD.setText(String.valueOf(miles * CAD_PER_USD));
        });
	Scene scene = new Scene(pane, 250, 60);
	primaryStage.setTitle("USD to CAD exchange"); 
	primaryStage.setScene(scene);
	primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }         
}