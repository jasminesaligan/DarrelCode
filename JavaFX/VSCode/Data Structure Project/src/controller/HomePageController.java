package controller;

import java.io.IOException;
import java.util.ResourceBundle;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.DataStored;

public class HomePageController implements Initializable {


    @FXML
    Button logoutButton;

    @FXML
    Label displayUsername;


    //ready for designing
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        displayuser();


    }

    //----------------------------METHODS for display------------------------------------------
    
    public void displayuser(){
        String user = DataStored.username;
        displayUsername.setText(user.substring(0, 1).toUpperCase() + user.substring(1));
        
    }



    //----------------------------Methods for buttons------------------------------------

    public void logout(ActionEvent event)throws IOException{

        System.out.println("Logout method called");

        Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/SignIn.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        DataStored.clearUsername();

        stage.show();

    }


    


}
