import java.sql.Connection;
import java.sql.DriverManager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage stage) throws Exception {

        DBConnect();

        try {
            
            Image image = new Image("/images/logo.jpg");

            Parent root = FXMLLoader.load(getClass().getResource("/view/signup.fxml"));
            Scene scene = new Scene(root);

            stage.setTitle("Paint Like Van Gogh");

            stage.getIcons().add(image);
            
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DBConnect(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/momentum", "root", "");
            System.out.println("connected na yung database");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}