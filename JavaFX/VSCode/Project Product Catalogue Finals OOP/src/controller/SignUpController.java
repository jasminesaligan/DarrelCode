package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

import model.UserAccount;


public class SignUpController {
    
    @FXML
    TextField mytextfield;

    @FXML
    PasswordField password;

    @FXML
    Button signupButton;

    @FXML
    static Parent root = null;
    
    @FXML
    FXMLLoader loader;

    private Stage stage;



    public void signup(ActionEvent event)throws IOException{


        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        UserAccount newUser = new UserAccount(mytextfield.getText(), password.getText());
        DataManager.getAccounts().insertFirst(newUser);
        

    }
}





