package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;



public class Principal {

    public void btn_dominio(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/dominio.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("DOMINIO");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }


    }

    public void btn_malla(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/malla.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MALLA");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    public void btn_tabla(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/tabla.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("TABLA DE CONECTIVIDADES");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    public void btn_modelo(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/modelo.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MODELO");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    public void btn_mef(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/mef.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("MEF");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    public void btn_ensamblaje(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/ensamblaje.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("ENSAMBLAJE");
            stage.setScene(new Scene(root1, 900, 700));
            stage.show();
        }catch (Exception e){
            System.out.println("Ops! ha ocurrido un error y no podemos pasar a la otra ventana:(");
        }
    }

    public void btn_condiciones(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../vistas/condiciones.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("CONDICIONES DE CONTORNO");
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


