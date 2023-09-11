package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.QuadCurve;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//STAGE = Windows (yung pinaka window mismo)
			//SCENE = Drawing Surface for graphical 
			//		= Container of Scene-Graph
			//		= CANVAS
			//Scene Graph = Elements (Buttons. TextBox. CheckBox)
			
			Image icon = new Image("Ben10.png");
			Image image = new Image("rere.png");
			
			ImageView imageView = new ImageView();
			imageView.setImage(image);
			
			imageView.setX(250); // L to R
			imageView.setY(0);   // T to B
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 800, 800, Color.GREY);
			
			
//			Text text = new Text();
//			text.setText("Dami pang gustong sabihin pero wag na lang muna");
//			text.setX(200); // L to R
//			text.setY(200); // T to B
//			text.setFont(Font.font(50));
			
			
			
			
//			GRID 40 x 40
			
			Line gridx = new Line(0, 200, 800, 200);
//			gridx.setStartX(0);
//			gridx.setStartY(200);
//			gridx.setEndX(800);
//			gridx.setEndY(200);
//			
			Line gridx1 = new Line(0, 400, 800, 400);		
			Line gridx2 = new Line(0, 600, 800, 600);
			
			Line gridx3 = new Line(0, 20, 800, 20);
			Line gridx4 = new Line(0, 40, 800, 40);
			Line gridx5 = new Line(0, 60, 800, 60);
			Line gridx6 = new Line(0, 80, 800, 80);
			Line gridx7 = new Line(0, 100, 800, 100);
			Line gridx8 = new Line(0, 120, 800, 120);
			Line gridx9 = new Line(0, 140, 800, 140);
			Line gridx10 = new Line(0, 160, 800, 160);
			Line gridx11 = new Line(0, 180, 800, 180);
			Line gridx12 = new Line(0, 220, 800, 220);
			Line gridx13 = new Line(0, 240, 800, 240);
			Line gridx14 = new Line(0, 260, 800, 260);
			Line gridx15 = new Line(0, 280, 800, 280);
			Line gridx16 = new Line(0, 300, 800, 300);
			Line gridx17 = new Line(0, 320, 800, 320);
			Line gridx18 = new Line(0, 340, 800, 340);
			Line gridx19 = new Line(0, 360, 800, 360);
			Line gridx20 = new Line(0, 380, 800, 380);
			Line gridx21 = new Line(0, 420, 800, 420);
			Line gridx22 = new Line(0, 440, 800, 440);
			Line gridx23 = new Line(0, 460, 800, 460);
			Line gridx24 = new Line(0, 480, 800, 480);
			Line gridx25 = new Line(0, 500, 800, 500);
			Line gridx26 = new Line(0, 520, 800, 520);
			Line gridx27 = new Line(0, 540, 800, 540);
			Line gridx28 = new Line(0, 560, 800, 560);
			Line gridx29 = new Line(0, 580, 800, 580);
			Line gridx30 = new Line(0, 620, 800, 620);
			Line gridx31 = new Line(0, 640, 800, 640);
			Line gridx32 = new Line(0, 660, 800, 660);
			Line gridx33 = new Line(0, 680, 800, 680);
			Line gridx34 = new Line(0, 700, 800, 700);
			Line gridx35 = new Line(0, 720, 800, 720);
			Line gridx36 = new Line(0, 740, 800, 740);
			Line gridx37 = new Line(0, 760, 800, 760);
			Line gridx38 = new Line(0, 780, 800, 780);
			
			
			
			
			
			
			
			
			Line gridy = new Line(200, 0, 200, 800);
//			gridy.setStartX(200);
//			gridy.setStartY(0);
//			gridy.setEndX(200);
//			gridy.setEndY(800);
//			
			Line gridy1 = new Line(400, 0, 400, 800);
			Line gridy2 = new Line(600, 0, 600, 800);
			
			Line gridy3 = new Line(20, 0, 20, 800);
			Line gridy4 = new Line(40, 0, 40, 800);
			Line gridy5 = new Line(60, 0, 60, 800);
			Line gridy6 = new Line(80, 0, 80, 800);
			Line gridy7 = new Line(100, 0, 100, 800);
			Line gridy8 = new Line(120, 0, 120, 800);
			Line gridy9 = new Line(140, 0, 140, 800);
			Line gridy10 = new Line(160, 0, 160, 800);
			Line gridy11 = new Line(180, 0, 180, 800);
			Line gridy12 = new Line(220, 0, 220, 800);
			Line gridy13 = new Line(240, 0, 240, 800);
			Line gridy14 = new Line(260, 0, 260, 800);
			Line gridy15 = new Line(280, 0, 280, 800);
			Line gridy16 = new Line(300, 0, 300, 800);
			Line gridy17 = new Line(320, 0, 320, 800);
			Line gridy18 = new Line(340, 0, 340, 800);
			Line gridy19 = new Line(360, 0, 360, 800);
			Line gridy20 = new Line(380, 0, 380, 800);
			Line gridy21 = new Line(420, 0, 420, 800);
			Line gridy22 = new Line(440, 0, 440, 800);
			Line gridy23 = new Line(460, 0, 460, 800);
			Line gridy24 = new Line(480, 0, 480, 800);
			Line gridy25 = new Line(500, 0, 500, 800);
			Line gridy26 = new Line(520, 0, 520, 800);
			Line gridy27 = new Line(540, 0, 540, 800);
			Line gridy28 = new Line(560, 0, 560, 800);
			Line gridy29 = new Line(580, 0, 580, 800);
			Line gridy30 = new Line(620, 0, 620, 800);
			Line gridy31 = new Line(640, 0, 640, 800);
			Line gridy32 = new Line(660, 0, 660, 800);
			Line gridy33 = new Line(680, 0, 680, 800);
			Line gridy34 = new Line(700, 0, 700, 800);
			Line gridy35 = new Line(720, 0, 720, 800);
			Line gridy36 = new Line(740, 0, 740, 800);
			Line gridy37 = new Line(760, 0, 760, 800);
			Line gridy38 = new Line(780, 0, 780, 800);
			 
		

			//							X	 Y	  R
			Circle circle = new Circle(400, 400, 300);
			
//			circle.setCenterX(400);
//			circle.setCenterY(400);
//			circle.setRadius(300);
			circle.setFill(Color.GREEN);
			circle.setStrokeWidth(20);
			circle.setStroke(Color.BLACK);
			
			Polyline polyline = new Polyline();
			
			polyline.getPoints().addAll(new Double[]{
				    200.0, 200.0, //Starting point
				    300.0, 400.0, //mid point
				    200.0, 600.0 }); //end point
			polyline.setStrokeWidth(20);
			polyline.setFill(Color.DARKGRAY);
			
			Polyline polyline1 = new Polyline();
			
			polyline1.getPoints().addAll(new Double[]{
				    600.0, 200.0, //Starting point
				    500.0, 400.0, //mid point
				    600.0, 600.0 }); //end point
			polyline1.setStrokeWidth(20);
			
			//QuadCurve quadcurve = new QuadCurve(200, 200, 400, 0, 600, 200);
			//quadcurve.setFill(Color.GREEN);
			
			
			
			//root.getChildren().add(circle);
			//root.getChildren().add(quadcurve);
			//root.getChildren().add(polyline);
			//root.getChildren().add(polyline1);
			root.getChildren().add(gridx);
			root.getChildren().add(gridx1);
			root.getChildren().add(gridx2);
			root.getChildren().add(gridx3);
			root.getChildren().add(gridx4);
			root.getChildren().add(gridx5);
			root.getChildren().add(gridx6);
			root.getChildren().add(gridx7);
			root.getChildren().add(gridx8);
			root.getChildren().add(gridx9);
			root.getChildren().add(gridx10);
			root.getChildren().add(gridx11);
			root.getChildren().add(gridx12);
			root.getChildren().add(gridx13);
			root.getChildren().add(gridx14);
			root.getChildren().add(gridx15);
			root.getChildren().add(gridx16);
			root.getChildren().add(gridx17);
			root.getChildren().add(gridx18);
			root.getChildren().add(gridx19);
			root.getChildren().add(gridx20);
			root.getChildren().add(gridx21);
			root.getChildren().add(gridx22);
			root.getChildren().add(gridx23);
			root.getChildren().add(gridx24);
			root.getChildren().add(gridx25);
			root.getChildren().add(gridx26);
			root.getChildren().add(gridx27);
			root.getChildren().add(gridx28);
			root.getChildren().add(gridx29);
			root.getChildren().add(gridx30);
			root.getChildren().add(gridx31);
			root.getChildren().add(gridx32);
			root.getChildren().add(gridx33);
			root.getChildren().add(gridx34);
			root.getChildren().add(gridx35);
			root.getChildren().add(gridx36);
			root.getChildren().add(gridx37);
			root.getChildren().add(gridx38);
			
			
			root.getChildren().add(gridy);
			root.getChildren().add(gridy1);
			root.getChildren().add(gridy2);
			root.getChildren().add(gridy3);
			root.getChildren().add(gridy4);
			root.getChildren().add(gridy5);
			root.getChildren().add(gridy6);
			root.getChildren().add(gridy7);
			root.getChildren().add(gridy8);
			root.getChildren().add(gridy9);
			root.getChildren().add(gridy10);
			root.getChildren().add(gridy11);
			root.getChildren().add(gridy12);
			root.getChildren().add(gridy13);
			root.getChildren().add(gridy14);
			root.getChildren().add(gridy15);
			root.getChildren().add(gridy16);
			root.getChildren().add(gridy17);
			root.getChildren().add(gridy18);
			root.getChildren().add(gridy19);
			root.getChildren().add(gridy20);
			root.getChildren().add(gridy21);
			root.getChildren().add(gridy22);
			root.getChildren().add(gridy23);
			root.getChildren().add(gridy24);
			root.getChildren().add(gridy25);
			root.getChildren().add(gridy26);
			root.getChildren().add(gridy27);
			root.getChildren().add(gridy28);
			root.getChildren().add(gridy29);
			root.getChildren().add(gridy30);
			root.getChildren().add(gridy31);
			root.getChildren().add(gridy32);
			root.getChildren().add(gridy33);
			root.getChildren().add(gridy34);
			root.getChildren().add(gridy35);
			root.getChildren().add(gridy36);
			root.getChildren().add(gridy37);
			root.getChildren().add(gridy38);			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.getIcons().add(icon);
			primaryStage.setTitle("Ben 10");
			primaryStage.setResizable(true);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
