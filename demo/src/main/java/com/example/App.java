package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane pane = new BorderPane();

        //creating border 
        pane.setStyle("-fx-background-color: #FAEFD4;");
        HBox top = new HBox();
        top.setStyle("-fx-border-color: #013464; -fx-border-width: 8px;");
        pane.setTop(top);
        HBox bottom = new HBox();
        bottom.setStyle("-fx-border-color: #013464; -fx-border-width: 4px;");
        pane.setBottom(bottom);
        VBox left = new VBox();
        left.setStyle("-fx-border-color: #013464; -fx-border-width: 4px;");
        pane.setLeft(left);
        VBox right = new VBox();
        right.setStyle("-fx-border-color: #013464; -fx-border-width: 4px;");
        pane.setRight(right);

        //creating center components 
        Button btEnter = new Button("Enter");
        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setTitle("Landing Page"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Di
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}