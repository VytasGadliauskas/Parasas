package com.example.draw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public Canvas canvasParasas;
    private GraphicsContext gc;

    @FXML
    public void btnSavePicture(ActionEvent actionEvent) {
    }
    @FXML
    public void canvasParasasMouseDragged(MouseEvent mouseEvent) {
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.lineTo(mouseEvent.getX(), mouseEvent.getY());
        gc.stroke();
    }
    @FXML
    public void canvasParasasMousePressed(MouseEvent mouseEvent) {
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);
        gc.beginPath();
        gc.moveTo(mouseEvent.getX(), mouseEvent.getY());
        gc.stroke();
    }
    @FXML
    public void canvasParasasMouseReleased(MouseEvent mouseEvent) {

    }

    private void initDraw(GraphicsContext gc){
        double canvasWidth = gc.getCanvas().getWidth();
        double canvasHeight = gc.getCanvas().getHeight();

        gc.setFill(Color.LIGHTGRAY);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);

        gc.fill();
        gc.strokeRect(
                0,              //x of the upper left corner
                0,              //y of the upper left corner
                canvasWidth,    //width of the rectangle
                canvasHeight);  //height of the rectangle

        gc.setFill(Color.RED);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(1);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = canvasParasas.getGraphicsContext2D();
        initDraw(gc);
    }
}