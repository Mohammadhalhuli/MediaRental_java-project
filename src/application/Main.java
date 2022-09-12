package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	try {
		MediaRental m=new MediaRental();
		
		Group ro=new Group();
		GridPane root = new GridPane();
		root.setHgap(10);
		root.setVgap(10);
			
				
			/////////////////////////////////////////////
			Button bu_Customer=new Button("Customer");

			
			bu_Customer.setPrefWidth(150);
			bu_Customer.setPrefHeight(50);
			bu_Customer.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
			
			
			
			
			
			
			/*********************************************************************************************/
			
			
			
			
			////////////////////////////////////////////////////////////////////////////////cust
			bu_Customer.setOnAction(e -> {
				//FX.custmer();
				primaryStage.close();
			});
			////////////////////////////////////////////
			Button bu_Media=new Button("Media");
//			bu_Media.setTranslateX(20);
//			bu_Media.setTranslateY(170);
			bu_Media.setPrefWidth(150);
			bu_Media.setPrefHeight(50);
			bu_Media.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
			bu_Media.setOnAction(e -> {
				FX.Media();
				primaryStage.close();
			});
			/////////////////////////////////////////////
			Button bu_Rent=new Button("Rent");
//			bu_Rent.setTranslateX(20);
//			bu_Rent.setTranslateY(270);
			bu_Rent.setPrefWidth(150);
			bu_Rent.setPrefHeight(50);
			bu_Rent.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
			bu_Rent.setOnAction(e -> {
				FX.Rent();
				primaryStage.close();
			});
			
			///////////////////////////////////////////////////
			
			
			Image im=new Image(Main.class.getResourceAsStream("imFx.PNG"));
			ImageView image =new ImageView(im);
			image.setImage(im);
			image.setFitWidth(250);
			image.setFitHeight(150);
			HBox box=new HBox();
//			image.setPreserveRatio(true);

			box.getChildren().add(image);
			box.setMaxWidth(250);
			box.setMaxHeight(150);
//		
			root.setStyle(" -fx-background-color: #99bbff;"
					+ "    -fx-stroke: green;"
					+ "    -fx-stroke-width: 5;"
					+ "    -fx-stroke-dash-array: 12 2 4 2;"
					+ "    -fx-stroke-dash-offset: 6;"
					+ "    -fx-stroke-line-cap: butt;");
//			root.setStyle("-fx-background-color: #dcffff;\r\n");

			////////////////////////////////////////////////////////////////////////////////////
			
			Label lab=new Label("Rental Media System");
			lab.setMinSize(150, 100);
			lab.setFont(new Font("Arial", 30));
			
			
			root.add(bu_Customer,3, 10);
			root.add(box, 20,15);
			root.add(bu_Media,3, 15);
			root.add(bu_Rent,3, 20);
			root.add(lab, 20, 20);
			
			//root.getChildren().addAll(bu_Customer,bu_Media,bu_Rent);
			ro.getChildren().add(root);
			Scene scene = new Scene(ro,650,500);
			primaryStage.setScene(scene);
			primaryStage.show();
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	private static void print(String str) {
		Pane root =new Pane();
		Stage s=new Stage();
		TextArea area=new TextArea();
		area.setText(str);
		root.getChildren().add(area);
		Scene sc=new Scene(root, 300, 200);
		s.setScene(sc);
		s.show();
	}
}
