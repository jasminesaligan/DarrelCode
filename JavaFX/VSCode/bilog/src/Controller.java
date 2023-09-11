import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML

    private Circle bilog;
    double y;
    double x;

    public void Up(){
        bilog.setCenterY(y = y-10);
    }

    public void Down(){
        bilog.setCenterY(y = y+10);
    }

    public void Left(){
        bilog.setCenterX(x = x-10);
    }

    public void Right(){
        bilog.setCenterX(x = x+10);
    }
}
