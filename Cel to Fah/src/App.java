/*
AUTHOR : Mit Patel
Date:1 APRIL 2022
TASK:INCLASS 5
*/
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 

public class App extends Application {  
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("Test.fxml")); //will help in connecting fxml file to java class
        Scene scene = new Scene(root);
        primaryStage.setTitle("CEL TO FAH CALCUALTOR");    // Set the stage title
        primaryStage.setScene(scene);               // Place the scene in the stage
        primaryStage.show();                        // Display the stage
    }   
     public static void main(String[] args) 
    {
            launch(args);
    }
}

