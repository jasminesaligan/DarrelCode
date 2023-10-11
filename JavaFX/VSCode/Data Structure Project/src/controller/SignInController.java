package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.DataStored;


public class SignInController{
    
    @FXML
    TextField loginUsername, InsertUsername;

    @FXML
    PasswordField loginPassword, InsertPassword;

    @FXML
    Pane loginPane, signUpPane;

    @FXML
    Button createAccountButton, loginButton = new Button();

    @FXML
    Hyperlink goToSignup, goToLogin;

    Statement statement;



    public void signup(ActionEvent event)throws IOException{

        insertDB();


    }


    // public void search(ActionEvent event)throws IOException{

    //     view();

    // }


    public void insertDB(){
        String insertAccount = "INSERT INTO `account` (`Username`, `Password`) VALUES ('"+ InsertUsername.getText() +"', '"+ InsertPassword.getText()+"')";

        try {
            if (InsertUsername.getText().isEmpty() || InsertPassword.getText().isEmpty()) {
                AlertMaker.showErrorAlert("Error", "Account cannot be blanked!");
            } else {
                String checkUsername = "select Username from account where Username = '" + InsertUsername.getText() + "'";
                ResultSet result = statement.executeQuery(checkUsername);

                if (result.next()) {
                    AlertMaker.showErrorAlert("Notification!", "Username taken");
                } else {
                    statement.executeUpdate(insertAccount);
                    AlertMaker.showSuccessfulAlert("Successfully Added!", "Account Insert, Successful!");
                    System.out.println("Inserted Account");
                    signUpPane.setVisible(false);
                    loginPane.setVisible(true);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            AlertMaker.showSimpleAlert("Notification!", "Error");
      
        }

    }

    public void CheckLogin(ActionEvent event) throws SQLException, IOException{
        String selectAccount = "select Username, Password from account where Username = '" + loginUsername.getText() + "' and password = '" + loginPassword.getText() + "'";

        try {
            
            ResultSet result = statement.executeQuery(selectAccount);

            if (loginUsername.getText().isEmpty() || loginPassword.getText().isEmpty()) {
                AlertMaker.showErrorAlert("Notification!", "Cannot be blanked");
            } else {

                if (result.next()) {

                DataStored.username = loginUsername.getText();

                Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/HomePage.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

                } else {
                    AlertMaker.showErrorAlert("Notification!", "Wrong password or username");
                }

            }
            
        } catch (Exception e) {
            e.getMessage();
        }
        
    }

    public void switchPane(ActionEvent event){
    
        if (event.getSource() == goToSignup) {
            signUpPane.setVisible(true);
            loginPane.setVisible(false);
        } else if (event.getSource() == goToLogin) {
            signUpPane.setVisible(false);
            loginPane.setVisible(true);
        }
    }

    // public void view(){
    //     try {
    //         String viewAccount = "select * from account where Username = '" + checkAcc.getText()+"'";
    //         ResultSet result = statement.executeQuery(viewAccount);
    //         if(result.next()){
    //             userlabel.setVisible(true);
    //             userlabel.setText("Username: " + result.getString(2));
    //             passlabel.setText("Password: " + result.getString(3));
    //             passlabel.setVisible(true);
    //         }

    //     } catch (Exception e) {
    //         System.out.println("bro account not found");
    //     }
    // }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }





}
