package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;



public class SignUpController {
    
    @FXML
    TextField username, checkAcc;

    @FXML
    PasswordField password;

    @FXML
    Button signupButton = new Button();

    @FXML
    static Parent root = null;
    
    @FXML
    FXMLLoader loader;

    @FXML
    Label label1, userlabel, passlabel;

    private Stage stage;

    Statement statement;

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
    
    public void signup(ActionEvent event)throws IOException{

        insertDB();
        label1.setVisible(true);

        // stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        // FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
        // Parent root = loader.load();
        // Scene scene = new Scene(root);
        // stage.setScene(scene);
        // stage.show();

    }

    public void search(ActionEvent event)throws IOException{

        view();

    }

    public void insertDB(){

        

        try {
            String insertAccount = "INSERT INTO `account` (`Username`, `Password`) VALUES ('"+ username.getText() +"', '"+ password.getText()+"')";
            
            statement.executeUpdate(insertAccount);            
            System.out.println("Inserted Account");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    

    public void view(){
        try {
            String viewAccount = "select * from account where Username = '" + checkAcc.getText()+"'";
            ResultSet result = statement.executeQuery(viewAccount);
            if(result.next()){
                userlabel.setVisible(true);
                userlabel.setText("Username: " + result.getString(2));
                passlabel.setText("Password: " + result.getString(3));
                passlabel.setVisible(true);
            }

        } catch (Exception e) {
            System.out.println("bro account not found");
        }
    }
    

}





