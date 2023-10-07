package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.UserAccount;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button loginbutton, createAcc;

    @FXML
    Label mywarninglabel;

    @FXML
    static Parent root = null;

    @FXML
    static Parent receiptRoot = null;

    FXMLLoader loader;

   


    public void login(ActionEvent event) throws IOException {

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        LinkList accounts = DataManager.getAccounts();
        UserAccount signedUser = accounts.find(username, password);

        if (signedUser != null) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/HomePage.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            mywarninglabel.setVisible(true);
        }
    }

    public void createAccount(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/signup.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

   

}