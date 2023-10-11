import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import controller.SignInController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class App extends Application {

    Statement statement;
    
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        try {

            DBConnect();

            //Image image = new Image("/images/logo.jpg");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/SignIn.fxml"));
            Parent root = loader.load();
            SignInController signInController = loader.getController();
            signInController.setStatement(statement);
            
            Scene scene = new Scene(root);

            stage.setTitle("Momentum");

            //stage.getIcons().add(image);
            
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DBConnect(){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/momentum", "root", "");
            statement = con.createStatement();
            System.out.println("connected na yung database");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    

    

}