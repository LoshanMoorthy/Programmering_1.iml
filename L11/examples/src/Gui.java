package examples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        this.initContent(pane);
        Scene scene = new Scene(pane, 400, 400);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(Pane pane) {

        Color color = Color.YELLOW;

/*        Circle circle = new Circle(290, 75, 35);
        pane.getChildren().add(circle);
        circle.setFill(color);
        circle.setStroke(Color.BLACK);

        Rectangle rectangle = new Rectangle(40, 180, 120, 120);
        pane.getChildren().add(rectangle);
        rectangle.setFill(Color.RED);
        rectangle.setStroke(Color.RED);

        Rectangle rectangleWindow = new Rectangle(70, 220, 30, 30);
        pane.getChildren().add(rectangleWindow);
        rectangleWindow.setFill(Color.BLACK);
        rectangleWindow.setStroke(Color.BLACK);

        Line line = new Line(20, 300, 200, 300);
        pane.getChildren().add(line);
        line.setFill(Color.BLACK);
        line.setStroke(Color.BLUEVIOLET);*/

        int numOfWheels = 4;
        int numOfDoors = 5;

        Rectangle rectangle = new Rectangle(200, 200, 160, 80);
        pane.getChildren().add(rectangle);
        rectangle.setFill(Color.BLACK);
        rectangle.setStroke(Color.BLACK);

        for (int i = 0; i < numOfWheels; i++) {
            Circle circle = new Circle(50 * (numOfWheels + i), 280, 20);
            pane.getChildren().add(circle);
            circle.setFill(Color.BLUE);
            circle.setStroke(Color.BLACK);
        }

//        for (int i = 1; i < numOfDoors; i++) {
//            Line door = new Line(10 * (numOfDoors * i), 20, 10 * (numOfDoors * i), 120);
//            pane.getChildren().add(door);
//            door.setStroke(Color.RED);
//        }

    }

}