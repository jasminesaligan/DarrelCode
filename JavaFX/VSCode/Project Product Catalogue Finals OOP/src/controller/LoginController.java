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
import model.AngularBrush;
import model.FlatBrush;
import model.Gouache;
import model.Receipt;
import model.AcrylicPaint;
import model.RoundBrush;
import model.SketchPad;
import model.UserAccount;
import model.CanvasPaper;
import model.Watercolor;
import model.WatercolorPaper;
import model.Cart;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController implements Initializable {

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

    @FXML
    HomePageController homepageController = null;

    @FXML
    static CartController cartController = null;

    @FXML
    static ReceiptController receiptController = null;

    static Watercolor watercolor = new Watercolor();
    static Gouache gouache = new Gouache();
    static AcrylicPaint acrylicPaint = new AcrylicPaint();
    static AngularBrush angularbrush = new AngularBrush();
    static FlatBrush flatbrush = new FlatBrush();
    static RoundBrush roundbrush = new RoundBrush();
    static SketchPad sketchingpaper = new SketchPad();
    static CanvasPaper canvasPaper = new CanvasPaper();
    static WatercolorPaper watercolorpaper = new WatercolorPaper();
    static Cart cart = new Cart();
    static Receipt receipt = new Receipt();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //============================Paints==================================//
        
        watercolor.setProductName("WATERCOLOR");
        watercolor.setProductPrice(450);
        watercolor.setProductImage("images/watercolorpic.jpg");

        gouache.setProductName("GOUACHE");
        gouache.setProductPrice(250);
        gouache.setProductImage("images/gouachepic.jpg");

        acrylicPaint.setProductName("ACRYLIC PAINT");
        acrylicPaint.setProductPrice(550);
        acrylicPaint.setProductImage("images/acrylicpaintpic.jpg");

        //===========================Art Papers==============================//

        sketchingpaper.setProductName("SKETCH PAD");
        sketchingpaper.setProductPrice(152);
        sketchingpaper.setProductImage("images/sketchpadpic.jpg");

        canvasPaper.setProductName("CANVAS");
        canvasPaper.setProductPrice(344);
        canvasPaper.setProductImage("images/canvaspic.jpg");

        watercolorpaper.setProductName("WATERCOLOR PAPER");
        watercolorpaper.setProductPrice(199);
        watercolorpaper.setProductImage("images/watercolorpaperpic.jpg");

        //============================Brushes======================================//

        angularbrush.setProductName("ANGULAR BRUSH");
        angularbrush.setProductPrice(207);
        angularbrush.setProductImage("images/angularbrushpic.jpg");

        flatbrush.setProductName("FLAT BRUSH");
        flatbrush.setProductPrice(120);
        flatbrush.setProductImage("images/flatbrushpic.jpg");

        roundbrush.setProductName("ROUND BRUSH");
        roundbrush.setProductPrice(159);
        roundbrush.setProductImage("images/roundbrushpic.jpg");

        

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Cart.fxml"));
            root = loader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        // Clears all items in Checkout.fxml
        cartController = loader.getController();
        cartController.myvbox.getChildren().removeAll(cartController.myvbox.getChildren());

        
        FXMLLoader receiptloader = null;
 
        try {
            receiptloader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
            receiptRoot = receiptloader.load();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }

        receiptController = receiptloader.getController();
        receiptController.myvbox1.getChildren().removeAll(receiptController.myvbox1.getChildren());
    
    }


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