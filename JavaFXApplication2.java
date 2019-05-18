/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFXApplication2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author rogel
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Scene scene = new Scene(grid, 400, 400);

        Label lb = new Label("NUMERO");
        grid.add(lb, 0, 1);
        
        TextField numero = new TextField();
        grid.add(numero, 1, 1);
        
        
        Button btn = new Button("Factorial");
        grid.add(btn, 1, 2);
        
        Label resultado = new Label();
        grid.add(resultado, 2, 1);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                int num = Integer.valueOf(numero.getText());
                int suma=1;
                for(int i=1; i<=num; i++){
                    suma*=i;
                }
                
                resultado.setText(Integer.toString(suma));
            }
        });
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

