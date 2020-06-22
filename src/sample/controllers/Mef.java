package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Mef {

    @FXML
    void step_five(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/paso_cinco.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 5");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    @FXML
    void step_four(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/paso_cuatro.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 4");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    @FXML
    void step_one(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/paso_uno.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 1");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    @FXML
    void step_six(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/paso_seis.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 6");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    @FXML
    void step_three(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/paso_tres.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 3");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    @FXML
    void step_two(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/paso_dos.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("PASO 2");
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
