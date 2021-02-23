/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {



    public static void display(String title, String message) {

        Stage window = new Stage();



        //Block events to other windows

        window.initModality(Modality.APPLICATION_MODAL);

        window.setTitle(title);

        window.setMinWidth(500);



        Label label = new Label(message + "\n\n\n\n\n\n");

       // label.setText(message);

       

        Button closeButton = new Button("Return");

        closeButton.setOnAction(e -> window.close());



        VBox layout = new VBox(10);

        layout.getChildren().addAll(label, closeButton);

        layout.setAlignment(Pos.CENTER);



        //Display window and wait for it to be closed before returning

        Scene scene = new Scene(layout,300,500);

        window.setScene(scene);

        window.showAndWait();

    }

