import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent() {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(200, 200);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {


// ------------------ Exercise 1 ---------------

//        int faktor = 2;
//        int sizeX = 10 * faktor;
//        int sizeY = 4 * faktor;

//        int x = 100;
//        int y = 75;
//        gc.strokeLine(x, y, x + sizeX, y - sizeY);
//        gc.strokeLine(x, y, x + sizeX, y + sizeY);

//        x = 100;
//        y = 125;
//        gc.strokeLine(x, y, x + sizeX, y - sizeY);
//        gc.strokeLine(x, y, x + sizeX, y + sizeY);

//        x = 20;
//        y = 50;
//        gc.strokeLine(x, y, x + sizeX, y - sizeY);
//        gc.strokeLine(x, y, x + sizeX, y + sizeY);

// ------------------- Exercise 2 ----------

//        int x1 = 100;
//        int y1 = 100;

//        int x2 = 20;
//        int y2 = 10;

//        while(x2 <= 180) {
//            gc.strokeLine(x1, y1, x2, y2);
//            x2 += 20;

// -------------- Exercise  --------------


// -------------- Exercise 4 - Figur 1 --------------
//        int x = 100; // center: (x,y)
//        int y = 100;
//        int r = 15; // radius: r
//        while (r <= 100) {
//            gc.strokeOval(x - r, y - r, 2 * r, 2 * r);
//            r = r + 15;
//    }

// ---------------- Figur 2 --------------------------

//        int x = 30; // center: (x,y)
//        int y = 100;
//        int r = 15; // radius: r
//        while (r <= 100) {
//            gc.strokeOval(x - r, y - r, 2 * r, 2 * r);
//            r += 15;
//            x += 15;
//        }

// ------------------ Exercise 7 --------------------------

//        int x = 0;
//        int y = 0;
//        int moveDown = 10;
//        String s = "Datamatiker";
//
//        for(int i = 0; i <= s.length(); i++) {
//            gc.fillText(s.substring(0, i), x, y);
//            y += moveDown;
//        }

// ----------------- Exercise 9 ---------------------------

//        double y1 = 90;
//        for (double x = 180; x >= 5; x-=x*0.25) {
//            double y2 = y1 - x * 0.2;
//            double y3 = y1 + x * 0.5;
//
//            gc.strokeLine(x, y1, x, y3);
//            gc.strokeLine(x, y1, x, y2);
//        }

// ----------------- Exercise 10 ----------------------------

//        for(int r = 20; r <= 20; r += 20) {
//            int x = 100;
//            int y = 100;
//            int size = 10;
//            this.drawCircle(gc, x, y, r);
//            gc.strokeLine(x - size / 2, y, x + size / 2, y);
//            gc.strokeLine(x, y - size / 2, x, y + size / 2);
//        }
    }

    private void drawCircle(GraphicsContext gc, int x, int y, int r) {

    }
}
