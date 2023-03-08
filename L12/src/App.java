import javafx.application.Application;
import javafx.scene.layout.Pane;

public class App {

    public static void main(String[] args) {

        Gui car = new Gui();

        //car.drawCar(new Pane(), new Car());

        Application.launch(Gui.class);
    }
}
