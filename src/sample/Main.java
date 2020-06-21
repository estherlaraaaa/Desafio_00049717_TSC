package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("vistas/sample.fxml"));
        primaryStage.setTitle("Aprendiendo mallado en 3D");
        primaryStage.setScene(new Scene(root,900, 700));
        //primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("@../images/icon_app.png")));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
