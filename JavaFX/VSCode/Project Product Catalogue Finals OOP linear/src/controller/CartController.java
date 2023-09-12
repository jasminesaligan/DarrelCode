package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CartController implements Initializable{
    
    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9;

    @FXML
    Label paint1, paint2, paint3, brush1, brush2, brush3, artpaper1, artpaper2, artpaper3, 
    price1, price2, price3, price4, price5, price6, price7, price8, price9, total;

     @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;

    @FXML
    VBox myvbox;

    @FXML
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //==============PAINTS==================================//

        paint1.setText(ProductsController.watercolor.getProductName());
        price1.setText(Double.toString(ProductsController.watercolor.getProductPrice()));
        Image watercolorpic = new Image(ProductsController.watercolor.getProductImage());
        img1.setImage(watercolorpic);

        paint2.setText(ProductsController.gouache.getProductName());
        price2.setText(Double.toString(ProductsController.gouache.getProductPrice()));
        Image gouchepic = new Image(ProductsController.gouache.getProductImage());
        img2.setImage(gouchepic);

        paint3.setText(ProductsController.acrylicpaint.getProductName());
        price3.setText(Double.toString(ProductsController.acrylicpaint.getProductPrice()));
        Image postercolorpic = new Image(ProductsController.acrylicpaint.getProductImage());
        img3.setImage(postercolorpic);

        //=================================BRUSHES======================================//

        brush1.setText(ProductsController.angularbrush.getProductName());
        price4.setText(Double.toString(ProductsController.angularbrush.getProductPrice()));
        Image angpic = new Image(ProductsController.angularbrush.getProductImage());
        img4.setImage(angpic);

        brush2.setText(ProductsController.flatbrush.getProductName());
        price5.setText(Double.toString(ProductsController.flatbrush.getProductPrice()));
        Image flatpic = new Image(ProductsController.flatbrush.getProductImage());
        img5.setImage(flatpic);

        brush3.setText(ProductsController.roundbrush.getProductName());
        price6.setText(Double.toString(ProductsController.roundbrush.getProductPrice()));
        Image roundpic = new Image(ProductsController.roundbrush.getProductImage());
        img6.setImage(roundpic);

        //===================================ART PAPERS===================================//

        artpaper1.setText(ProductsController.canvas.getProductName());
        price7.setText(Double.toString(ProductsController.canvas.getProductPrice()));
        Image sketchpic = new Image(ProductsController.canvas.getProductImage());
        img7.setImage(sketchpic);

        artpaper2.setText(ProductsController.sketchingpad.getProductName());
        price8.setText(Double.toString(ProductsController.sketchingpad.getProductPrice()));
        Image tonedpic = new Image(ProductsController.sketchingpad.getProductImage());
        img8.setImage(tonedpic);

        artpaper3.setText(ProductsController.watercolorpaper.getProductName());
        price9.setText(Double.toString(ProductsController.watercolorpaper.getProductPrice()));
        Image waterpaperpic = new Image(ProductsController.watercolorpaper.getProductImage());
        img9.setImage(waterpaperpic);

    }

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }



    public void confirm(ActionEvent event) {

        double totalamount = 0.00;

        if (ProductsController.watercolor.getProductStatus()) {
            if (cb1.isSelected()){
                totalamount += ProductsController.watercolor.getProductPrice();
            }
        }

        if (ProductsController.gouache.getProductStatus()) {
            if (cb2.isSelected()){
                totalamount += ProductsController.gouache.getProductPrice();
            }
        }

        if (ProductsController.acrylicpaint.getProductStatus()) {
            if (cb3.isSelected()){
                totalamount += ProductsController.acrylicpaint.getProductPrice();
            }
        }

        if (ProductsController.angularbrush.getProductStatus()) {
            if (cb4.isSelected()){
                totalamount += ProductsController.angularbrush.getProductPrice();
            }
        }

        if (ProductsController.flatbrush.getProductStatus()) {
            if (cb5.isSelected()){
                totalamount += ProductsController.flatbrush.getProductPrice();
            }
        }

        if (ProductsController.roundbrush.getProductStatus()) {
            if (cb6.isSelected()){
                totalamount += ProductsController.roundbrush.getProductPrice();
            }
        }

        if (ProductsController.canvas.getProductStatus()) {
            if (cb7.isSelected()){
                totalamount += ProductsController.canvas.getProductPrice();
            }
        }

        if (ProductsController.sketchingpad.getProductStatus()) {
            if (cb8.isSelected()){
                totalamount += ProductsController.sketchingpad.getProductPrice();
            }
        }

        if (ProductsController.watercolorpaper.getProductStatus()) {
            if (cb9.isSelected()){
                totalamount += ProductsController.watercolorpaper.getProductPrice();
            }
        }

        total.setText(Double.toString(totalamount));

    }
    

}
