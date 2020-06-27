package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Componentes {

    @FXML
    void c(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/matrizC.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MATRIZ 'C' ");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    @FXML
    void d(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/matrizD.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MATRIZ 'D' ");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    @FXML
    void f(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/matrizF.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MATRIZ 'F' ");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    @FXML
    void h(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/matrizH.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MATRIZ 'H' ");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    @FXML
    void k(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/matrizK.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MATRIZ 'K' ");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    @FXML
    void l(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistas/matrizL.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MATRIZ 'L' ");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    public void btn_back(MouseEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
