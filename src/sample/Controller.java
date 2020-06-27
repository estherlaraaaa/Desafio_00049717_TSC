package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private void btn_inicio(ActionEvent event) throws IOException {
        Parent root2 = FXMLLoader.load(getClass().getResource("vistas/principal.fxml"));

        Scene scene2 = new Scene(root2);

        Stage window = new Stage();

        window.setScene(scene2);

        window.show();
    }
}



