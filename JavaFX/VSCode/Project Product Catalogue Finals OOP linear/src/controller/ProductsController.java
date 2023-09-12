package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import alert.AlertMaker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
import model.AngularBrush;
import model.FlatBrush;
import model.Gouache;
import model.AcrylicPaint;
import model.RoundBrush;
import model.SketchingPad;
import model.Canvas;
import model.Watercolor;
import model.WatercolorPaper;

public class ProductsController implements Initializable{

    @FXML
    Label paint1, paint2, paint3, brush1, brush2, brush3, artpaper1, artpaper2, artpaper3, 
    price1, price2, price3, price4, price5, price6, price7, price8, price9;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

    @FXML
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    static Parent root = null;

    FXMLLoader loader;

    @FXML
    CartController cartController = null;

    static Watercolor watercolor = new Watercolor();
    static Gouache gouache = new Gouache();
    static AcrylicPaint acrylicpaint = new AcrylicPaint();
    static AngularBrush angularbrush = new AngularBrush();
    static FlatBrush flatbrush = new FlatBrush();
    static RoundBrush roundbrush = new RoundBrush();
    static SketchingPad sketchingpad = new SketchingPad();
    static Canvas canvas = new Canvas();
    static WatercolorPaper watercolorpaper = new WatercolorPaper();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

         // ============== Watercolor ==================//
        watercolor.setProductName("Watercolor");
        paint1.setText(watercolor.getProductName());

        watercolor.setProductPrice(1200.00);
        price1.setText(Double.toString(watercolor.getProductPrice()));

        watercolor.setProductImage("images/watercolorpic.jpg");
        Image watercolorpic = new Image(watercolor.getProductImage());
        img1.setImage(watercolorpic);

        // ============== Gouache ==================//

        gouache.setProductName("Goauche");
        paint2.setText(gouache.getProductName());

        gouache.setProductPrice(800.00);
        price2.setText(Double.toString(gouache.getProductPrice()));

        gouache.setProductImage("images/gouachepic.jpg");
        Image gouachepic = new Image(gouache.getProductImage());
        img2.setImage(gouachepic);

        // ============== Acrylic Paint ==================//
        acrylicpaint.setProductName("Acrylic Paint");
        paint3.setText(acrylicpaint.getProductName());

        acrylicpaint.setProductPrice(500.00);
        price3.setText(Double.toString(acrylicpaint.getProductPrice()));

        acrylicpaint.setProductImage("images/acrylicpaintpic.jpg");
        Image acrylicpaintpic = new Image(acrylicpaint.getProductImage());
        img3.setImage(acrylicpaintpic);

        //============================================================================//


        // ============== Angular Brush ==================//
        angularbrush.setProductName("Angular Brush");
        brush1.setText(angularbrush.getProductName());

        angularbrush.setProductPrice(200.00);
        price4.setText(Double.toString(angularbrush.getProductPrice()));

        angularbrush.setProductImage("images/angularbrushpic.jpg");
        Image angularbrushpic = new Image(angularbrush.getProductImage());
        img4.setImage(angularbrushpic);

        // ============== Flat Brush ==================//

        flatbrush.setProductName("Flat Brush");
        brush2.setText(flatbrush.getProductName());

        flatbrush.setProductPrice(100.00);
        price5.setText(Double.toString(flatbrush.getProductPrice()));

        flatbrush.setProductImage("images/flatbrushpic.jpg");
        Image flatbrushpic = new Image(flatbrush.getProductImage());
        img5.setImage(flatbrushpic);

        // ============== Round Brush ==================//
        roundbrush.setProductName("Round Brush");
        brush3.setText(roundbrush.getProductName());

        roundbrush.setProductPrice(50.00);
        price6.setText(Double.toString(roundbrush.getProductPrice()));

        roundbrush.setProductImage("images/roundbrushpic.jpg");
        Image roundbrushpic = new Image(roundbrush.getProductImage());
        img6.setImage(roundbrushpic);

        //====================================================================================//

        // ============== Canvas ==================//
        canvas.setProductName("Canvas");
        artpaper1.setText(canvas.getProductName());

        canvas.setProductPrice(500.00);
        price7.setText(Double.toString(canvas.getProductPrice()));

        canvas.setProductImage("images/canvaspic.jpg");
        Image sketchingpaperpic = new Image(canvas.getProductImage());
        img7.setImage(sketchingpaperpic);

        // ============== Sketch Pad ==================//

        sketchingpad.setProductName("Sketch Pad");
        artpaper2.setText(sketchingpad.getProductName());

        sketchingpad.setProductPrice(1800.00);
        price8.setText(Double.toString(sketchingpad.getProductPrice()));

        sketchingpad.setProductImage("images/sketchpadpic.jpg");
        Image tonedpaperpic = new Image(sketchingpad.getProductImage());
        img8.setImage(tonedpaperpic);

        // ============== Watercolor Paper ==================//
        watercolorpaper.setProductName("Watercolor Paper");
        artpaper3.setText(watercolorpaper.getProductName());

        watercolorpaper.setProductPrice(500.00);
        price9.setText(Double.toString(watercolorpaper.getProductPrice()));

        watercolorpaper.setProductImage("images/watercolorpaperpic.jpg");
        Image watercolorpaperpic = new Image(watercolorpaper.getProductImage());
        img9.setImage(watercolorpaperpic);



        try {
            loader = new FXMLLoader(getClass().getResource("/view/Cart.fxml"));
            root = loader.load();
        } catch (Exception e) {
            // TODO: handle exception
        }

        // Clears all items in Checkout.fxml
        cartController = loader.getController();
        cartController.myvbox.getChildren().removeAll(cartController.myvbox.getChildren());

    }





    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button1)) {
            watercolor.setProductStatus(true);
            ProductsController.watercolor.setProductQuantity(1);
            cartController.addItem(cartController.pane1);
        }

        else if (sourceButton == button2) {
            gouache.setProductStatus(true);
            ProductsController.gouache.setProductQuantity(1);
            cartController.addItem(cartController.pane2);
        }

        else if (sourceButton == button3) {
            acrylicpaint.setProductStatus(true);
            ProductsController.acrylicpaint.setProductQuantity(1);
            cartController.addItem(cartController.pane3);
        }

        else if (sourceButton == button4) {
            angularbrush.setProductStatus(true);
            ProductsController.angularbrush.setProductQuantity(1);
            cartController.addItem(cartController.pane4);
        }

        else if (sourceButton == button5) {
            flatbrush.setProductStatus(true);
            ProductsController.flatbrush.setProductQuantity(1);
            cartController.addItem(cartController.pane5);
        }

        else if (sourceButton == button6) {
            roundbrush.setProductStatus(true);
            ProductsController.roundbrush.setProductQuantity(1);
            cartController.addItem(cartController.pane6);
        }

        else if (sourceButton == button7) {
            canvas.setProductStatus(true);
            ProductsController.canvas.setProductQuantity(1);
            cartController.addItem(cartController.pane7);
        }

        else if (sourceButton == button8) {
            sketchingpad.setProductStatus(true);
            ProductsController.sketchingpad.setProductQuantity(1);
            cartController.addItem(cartController.pane8);
        }

        else if (sourceButton == button9) {
            watercolorpaper.setProductStatus(true);
            ProductsController.watercolorpaper.setProductQuantity(1);
            cartController.addItem(cartController.pane9);
        }
    }

     // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void logo(ActionEvent event) throws IOException {

    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/HomePage.fxml"));
    Parent root = loader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
  
}
