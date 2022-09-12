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
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.geometry.Insets; 
import javafx.scene.text.Text;
import javafx.geometry.Pos; 


public class FX {
	static MediaRental m=new MediaRental();
	public static void custmer() {
		
		Stage stagecustomar=new Stage();
		
		
			try {
				Group roimg=new Group();
				GridPane rootcustomar = new GridPane();
				
				Pane root1=new Pane();	
				Text te=new Text("  Please select what you want");
				te.setFont(new Font("Arial", 30));
				Image img_add = new Image(FX.class.getResourceAsStream("add.png"));
				ImageView imgeadd =new ImageView(img_add);
				imgeadd.setFitWidth(90);
				imgeadd.setFitHeight(40);
				/**"  Add new Customer",*/
				Button add=new Button(" ",imgeadd);
				add.setTranslateX(10);
				add.setPrefWidth(150);
				add.setPrefHeight(40);
				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
				
				
				
				
				/****add****/
				Stage sadd=new Stage();
				Pane rootadd=new Pane();
				Text id_T=new Text("Customer ID:");
				id_T.setTranslateX(10);
				id_T.setTranslateY(15+10);
				
				TextField id=new TextField();
				id.setTranslateX(120);
				id.setTranslateY(10);
				
				Text name_T=new Text("Customer Name");
				name_T.setTranslateX(10);
				name_T.setTranslateY(45+10);
				TextField name=new TextField();
				name.setTranslateX(120);
				name.setTranslateY(40);
				
				Text addre_T=new Text("Customer Addre");
				addre_T.setTranslateX(10);
				addre_T.setTranslateY(40+35+10);
				TextField addres=new TextField();
				addres.setTranslateX(120);
				addres.setTranslateY(40+30);
				Text mo_T=new Text("Customer Mobile:");
				mo_T.setTranslateX(10);
				mo_T.setTranslateY(80+5+30);
				TextField mobile=new TextField();
				mobile.setTranslateX(120);
				mobile.setTranslateY(70+30);
				Image img_addd = new Image(FX.class.getResourceAsStream("R.png"));
				ImageView imge =new ImageView(img_addd);
				imge.setFitWidth(25);
				imge.setFitHeight(25);
				Button add2=new Button("  Add",imge);
				add2.setPrefWidth(150);
				add2.setPrefHeight(50);
				add2.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
				
				String id_in=id.getText();
				String namw_in=name.getText();
				String addres_in=addres.getText();
				String mo_in=mobile.getText();
				add2.setOnAction(e->{
					print("Done");
					System.out.println();
					m.addCustomer(id.getText(),name.getText(),addres.getText(),mobile.getText(),"dfb");
					System.out.println(m.getAllCustomersInfo());
					sadd.close();
					stagecustomar.show();
					id.clear();
					name.clear();
					addres.clear();
					mobile.clear();
					
				});
				 m.addCustomer(id_in,namw_in, addres_in, mo_in,null);
				 m.addCustomer("120", "221", "sle", "ram", "LIMITED");
				 System.out.println(m.findCustomar("120"));
				 
				
				add2.setTranslateX(120-50);
				add2.setTranslateY(70+30+30+20);
				rootadd.getChildren().addAll(addre_T,addres,id,id_T,mobile,mo_T,name,name_T,add2);
				Scene scadd=new Scene(rootadd, 300, 200+30);
				sadd.setScene(scadd);
				
				///////////////////////////////////////////////////////////////////////////////////
				add.setOnAction(e->{
					 sadd.show();
					 
					 stagecustomar.close();
				});
				
				
				
				/**update**/
				///////////////////////////////////////////////////////////////////////////
				Stage upst=new Stage();
				Pane uproot=new Pane();
				Text upid_T=new Text("Customer ID:");
				upid_T.setTranslateX(10);
				upid_T.setTranslateY(15+10);
				
				TextField upid=new TextField();
				upid.setTranslateX(120);
				upid.setTranslateY(10);
				
				Text upname_T=new Text("Customer Name");
				upname_T.setTranslateX(10);
				upname_T.setTranslateY(45+10);
				TextField upname=new TextField();
				upname.setTranslateX(120);
				upname.setTranslateY(40);
				
				Text upaddre_T=new Text("Customer Addre");
				upaddre_T.setTranslateX(10);
				upaddre_T.setTranslateY(40+35+10);
				TextField upaddres=new TextField();
				upaddres.setTranslateX(120);
				upaddres.setTranslateY(40+30);
				Text upmo_T=new Text("Customer Mobile:");
				upmo_T.setTranslateX(10);
				upmo_T.setTranslateY(80+5+30);
				TextField upmobile=new TextField();
				upmobile.setTranslateX(120);
				upmobile.setTranslateY(70+30);
//				Scene upsc=new Scene(uproot, 0, 0);
				Image img_up = new Image(FX.class.getResourceAsStream("U.jpg"));
				ImageView imgeup =new ImageView(img_up);
				imgeup.setFitWidth(30);
				imgeup.setFitHeight(30);
				Button up=new Button("  Update",imgeup);
				up.setPrefWidth(150);
				up.setPrefHeight(50);
				up.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
				up.setOnAction(e->{
					 System.out.println(m.updateCustomar(id.getText(),name.getText(), addres.getText(), mobile.getText(), null));
					 upst.close();
					 stagecustomar.show();
				});
				up.setTranslateX(120-50);
				up.setTranslateY(70+30+30+20);
				uproot.getChildren().addAll(upaddre_T,upaddres,upid,upid_T,upmobile,upmo_T,upname,upname_T,up);
				Scene scup=new Scene(uproot, 300, 200+30);
				upst.setScene(scup);
				
				//////////////////////////////////////////////////////////////////////////
				Image img_update = new Image(FX.class.getResourceAsStream("update.png"));
				ImageView imgeupdate =new ImageView(img_update);
				imgeupdate.setFitWidth(90);
				imgeupdate.setFitHeight(40);
				/**"  update new Customer",*/
				Button update=new Button(" ",imgeupdate);
				update.setTranslateX(180);
				update.setPrefWidth(150);
				update.setPrefHeight(50);
				update.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
				update.setOnAction(e->{
					upst.show();
					stagecustomar.close();
				});
				root1.getChildren().addAll(add,update);
				
				
				/***remove**////////
				////////////////////////////////////////////////////////////////////
				Stage sre=new Stage();
				Pane rootre=new Pane();
				Text rid_T=new Text("Customer ID:");
				rid_T.setTranslateX(10);
				rid_T.setTranslateY(15+10);
				TextField riext=new TextField();
				riext.setTranslateX(120);
				riext.setTranslateY(10);
				Image img_re = new Image(FX.class.getResourceAsStream("del.jpg"));
				ImageView imgre =new ImageView(img_re);
				imgre.setFitWidth(25);
				imgre.setFitHeight(25);
				Button re=new Button("  Remove",imgre);
				re.setPrefWidth(150);
				re.setPrefHeight(50);
				re.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
				re.setOnAction(e->{
					System.out.println(m.removeCustomar(riext.getText()));
					
					stagecustomar.show();
					print(String.valueOf(m.removeCustomar(riext.getText())));
				});
				re.setTranslateX(90-10);
				re.setTranslateY(60);
				rootre.getChildren().addAll(rid_T,riext,re);
				Scene scre=new Scene(rootre, 300, 150);
				sre.setScene(scre);
				
				/////////////////////////////////////////////////////////////////////////////
				
				
				
				Pane root2=new Pane();
				Image img_d = new Image(FX.class.getResourceAsStream("re.png"));
				ImageView imged =new ImageView(img_d);
				imged.setFitWidth(130);
				imged.setFitHeight(40);
				Button remov=new Button("",imged);
				remov.setTranslateX(10);
				remov.setPrefWidth(150);
				remov.setPrefHeight(50);
				remov.setOnAction(e->{
					sre.show();
					stagecustomar.close();
				});
				remov.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
				
				/***Find**////////
				////////////////////////////////////////////////////////////////////
				Stage sfind=new Stage();
				Pane rootfind=new Pane();
				Text fid_T=new Text("Customer ID:");
				fid_T.setTranslateX(10);
				fid_T.setTranslateY(15+10);
				TextField fiext=new TextField();
				fiext.setTranslateX(120);
				fiext.setTranslateY(10);
				Image img_f = new Image(FX.class.getResourceAsStream("find.png"));
				ImageView imgef =new ImageView(img_f);
				imgef.setFitWidth(25);
				imgef.setFitHeight(25);
				Button find=new Button("  Find",imgef);
				find.setPrefWidth(150);
				find.setPrefHeight(50);
				find.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
				find.setOnAction(e->{
					 System.out.println( m.findCustomar(id.getText()));
					 stagecustomar.show();
					 print(m.findCustomar(id.getText()));
					 sfind.close();
				});
				find.setTranslateX(90-10);
				find.setTranslateY(60);
				rootfind.getChildren().addAll(fid_T,fiext,find);
				Scene scfind=new Scene(rootfind, 300, 150);
				sfind.setScene(scfind);
				
				/////////////////////////////////////////////////////////////////////////////
				Image img_find = new Image(FX.class.getResourceAsStream("OIP.jpg"));
				ImageView imgfind =new ImageView(img_find);
				imgfind.setFitWidth(130);
				imgfind.setFitHeight(40);
				Button findd=new Button("",imgfind);
				findd.setTranslateX(180);
				findd.setPrefWidth(150);
				findd.setPrefHeight(50);
				findd.setOnAction(e->{
					sfind.show();
					stagecustomar.close();
				});
				findd.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
				root2.getChildren().addAll(remov,findd);
				rootcustomar.setHgap(10);
				rootcustomar.setVgap(10);
				rootcustomar.setHgap(5);
				rootcustomar.setVgap(5);
				rootcustomar.add(te, 2, 0);
				rootcustomar.add(root1,2, 7);
				rootcustomar.add(root2,2,8);
						
					/////////////////////////////////////////////
					
					
					//root.getChildren().addAll(bu_Customer,bu_Media,bu_Rent);
					roimg.getChildren().add(rootcustomar);
					Scene scene = new Scene(roimg,430,200);
					stagecustomar.setScene(scene);
					stagecustomar.show();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
				
			}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void Media() {

		Stage s=new Stage();
		Pane root=new Pane();
		Button Album=new Button("Album");
		Album.setTranslateX(10);
		Album.setOnAction(e->{
			Albumfx.album(m);
		});
		
		
		
		
		////////////////////////////////////////////////////////////////////////////////game
		
		
		GridPane p = new GridPane();
		p.setHgap(10);
		p.setVgap(10);
		Stage sta1 =new Stage();
		Scene sc=new Scene(p, 500, 500);
		Text code =new Text("code");
		p.add(code, 1, 3);
		TextField ct=new TextField();
		p.add(ct, 1+4, 3);
		Text tit =new Text("titel");
		p.add(tit, 1, 3+2);
		TextField tt=new TextField();
		p.add(tt, 1+4, 3+2);
		Text nu =new Text("number_o_C");
		p.add(nu, 1, 3+2+2);
		TextField nt=new TextField();
		p.add(nt, 1+4, 3+2+2);
		
		Text wi =new Text("weight");
		p.add(wi, 1, 3+2+4);
		TextField wt=new TextField();
		p.add(wt, 1+4, 3+2+4);
		
		
		Button add=new Button("Add");
		p.add(add, 2, 9+2);
		add.setOnAction(e->{
			
			m.addGame(ct.getText(), tt.getText(), Integer.parseInt(nt.getText()), Integer.parseInt(wt.getText()));
			System.out.println("add Done");
		});
		
		Button re=new Button("remove");
		p.add(re, 4, 9+2);
		re.setOnAction(e->{
			m.removeGame(ct.getText());
		});
		Button update=new Button("update");
		p.add(update, 2, 9+2+2);
		update.setOnAction(e->{
			System.out.println(m.updateGame(ct.getText(), tt.getText(), Integer.parseInt(nt.getText()), Integer.parseInt(wt.getText())));
		});
		
		Button find=new Button("find");
		p.add(find, 4, 9+2+2);
		find.setOnAction(e->{
			m.findGame(ct.getText());
		});
		
		Button pr=new Button("print");
		p.add(pr, 2, 9+2+2+2);
		pr.setOnAction(e->{
			System.out.println(m.printAll());
		});
		
		Button back=new Button("Back");
		p.add(back, 4, 9+2+2+2);
		back.setOnAction(e->{
			s.close();
		});
		
		sta1.setScene(sc);
		
		
		
		////////////////////////////////////////////////////////////////////////////////game
		Button Game=new Button("Game");
		Game.setOnAction(e->{
			//regame();
			//gamefx.game(m);
			sta1.show();
		});
		Game.setTranslateX(70);
		Button Movie=new Button("Movie");
		Movie.setTranslateX(140);
		Movie.setOnAction(e->{
			//remove();
			moviefx.movie(m);
		});
		
		root.getChildren().addAll(Movie,Album,Game);
		Scene scene = new Scene(root,400,180);
		s.setScene(scene);
		s.show();
	}
//		Stage primaryStage=new Stage();
//		
//		
//		try {
//			
//			GridPane root = new GridPane();
//			root.setHgap(10);
//			root.setVgap(10);
//				
//			Text te=new Text("              Please select what you want");
//			te.setFont(new Font("Arial", 30));
//			Image img_add = new Image(FX.class.getResourceAsStream("R.png"));
//			ImageView imgadd =new ImageView(img_add);
//			imgadd.setFitWidth(25);
//			imgadd.setFitHeight(25);
//			
//			//add method
//			Button add=new Button("  Add",imgadd);
//			add.setPrefWidth(150);
//			add.setPrefHeight(50);
//			add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//			add.setOnAction(e->{
//				 addmid();
//				 primaryStage.close();
//			});
//			
//			//remove method
//			Image img_r = new Image(FX.class.getResourceAsStream("del.jpg"));
//			ImageView imgr =new ImageView(img_r);
//			imgr.setFitWidth(25);
//			imgr.setFitHeight(25);
//			Button remov=new Button("  Delete",imgr);
//			remov.setPrefWidth(150);
//			remov.setPrefHeight(50);
//			remov.setOnAction(e->{
//				removmid();
//				primaryStage.close();
//			});
//			remov.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//			
//			Image img_up = new Image(FX.class.getResourceAsStream("U.jpg"));
//			ImageView imgup =new ImageView(img_up);
//			imgup.setFitWidth(25);
//			imgup.setFitHeight(25);
//			Button Update=new Button("  Update",imgup);
//			Update.setPrefWidth(150);
//			Update.setPrefHeight(50);
//			Update.setOnAction(e->{
//				updatemid();
//				primaryStage.close();
//			});
//			Update.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//			
//			Image img_fi = new Image(FX.class.getResourceAsStream("find.png"));
//			ImageView imgfi =new ImageView(img_fi);
//			imgfi.setFitWidth(25);
//			imgfi.setFitHeight(25);
//			Button Search =new Button("  Search",imgfi);
//			Search .setPrefWidth(150);
//			Search .setPrefHeight(50);
//			Search .setOnAction(e->{
//				findmid();
//				primaryStage.close();
//			});
//			Search .setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//			
//			Image img_p = new Image(FX.class.getResourceAsStream("pr.jpg"));
//			ImageView imgp =new ImageView(img_p);
//			imgp.setFitWidth(30);
//			imgp.setFitHeight(30);
//			Button Print  =new Button("Print ",imgp);
//			Print .setPrefWidth(150);
//			Print .setPrefHeight(50);
//			Print .setOnAction(e->{
//				printmid();
//				primaryStage.close();
//			});
//			Print .setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//			Image img_i = new Image(FX.class.getResourceAsStream("i.png"));
//			ImageView imgi =new ImageView(img_i);
//			imgi.setFitWidth(25);
//			imgi.setFitHeight(25);
//			Button information   =new Button("information",imgi);
//			information  .setPrefWidth(150);
//			information  .setPrefHeight(50);
//			information  .setOnAction(e->{
//				
//				primaryStage.close();
//			});
//			information  .setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//			
//			Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
//			ImageView imgb =new ImageView(img_b);
//			imgb.setFitWidth(25);
//			imgb.setFitHeight(25);
//			Button Back   =new Button("Back",imgb);
//			Back  .setPrefWidth(150);
//			Back  .setPrefHeight(50);
//			Back  .setOnAction(e->{
//				
//				primaryStage.close();
//			});
//			Back  .setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//			
//			root.add(te, 2, 1);
//			root.add(add, 2, 4);
//			root.add(remov, 2, 5);
//			root.add(Update, 2, 6);
//			root.add(Search, 2, 7);
//			root.add(Print, 2,8);
//			root.add(Back, 2, 9);
//					
//				/////////////////////////////////////////////
//				
//				
//				//root.getChildren().addAll(bu_Customer,bu_Media,bu_Rent);
//				
//				Scene scene = new Scene(root,650,500);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//	
//	
//	
//	
//	//////////////////////////////////////////////////////////////////////////////////////////////
//	private static void removmid() {
//		// TODO Auto-generated method stub
//
//		Stage s=new Stage();
//		Pane root=new Pane();
//		Button Album=new Button("Album");
//		Album.setTranslateX(10);
//		Album.setOnAction(e->{
//			gamefx.game(m);
//		});
//		Button Game=new Button("Game");
//		Game.setOnAction(e->{
//			regame();
//		});
//		Game.setTranslateX(70);
//		Button Movie=new Button("Movie");
//		Movie.setTranslateX(140);
//		Movie.setOnAction(e->{
//			remove();
//		});
//		
//		root.getChildren().addAll(Movie,Album,Game);
//		Scene scene = new Scene(root,400,180);
//		s.setScene(scene);
//		s.show();
//	}
//	private static void remove() {
//		// TODO Auto-generated method stub
//Stage primaryStage=new Stage();
//		
//		
//		try {
//			
//			GridPane root = new GridPane();
//			root.setHgap(10);
//			root.setVgap(10);
//				
//				Text code_T=new Text("rating :");
//				TextField code=new TextField();
//				root.add(code_T, 3, 1);
//				root.add(code, 4, 1);
//				
//				
//				
//				Image img_add = new Image(FX.class.getResourceAsStream("del.jpg"));
//				ImageView imge =new ImageView(img_add);
//				imge.setFitWidth(25);
//				imge.setFitHeight(25);
//				Button add=new Button("  Delete",imge);
//				add.setPrefWidth(150);
//				add.setPrefHeight(50);
//				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				add.setOnAction(e->{
//					 
//				});
//				root.add(add, 3, 9);
//				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
//				ImageView imge2 =new ImageView(img_b);
//				imge2.setFitWidth(25);
//				imge2.setFitHeight(25);
//				Button back=new Button("  Back",imge2);
//				back.setPrefWidth(150);
//				back.setPrefHeight(50);
//				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				back.setOnAction(e->{
//					
//					primaryStage.close();
//				});
//				root.add(back, 4, 9);
//				
//				
//				
//				Scene scene = new Scene(root,400,180);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	private static void regame() {
//		// TODO Auto-generated method stub
//Stage primaryStage=new Stage();
//		
//		
//		try {
//			
//			GridPane root = new GridPane();
//			root.setHgap(10);
//			root.setVgap(10);
//				
//				Text code_T=new Text("weight :");
//				TextField code=new TextField();
//				root.add(code_T, 3, 1);
//				root.add(code, 4, 1);
//				
//				
//				
//				
//				Image img_add = new Image(FX.class.getResourceAsStream("del.jpg"));
//				ImageView imge =new ImageView(img_add);
//				imge.setFitWidth(25);
//				imge.setFitHeight(25);
//				Button add=new Button("  Delete",imge);
//				add.setPrefWidth(150);
//				add.setPrefHeight(50);
//				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				add.setOnAction(e->{
//					 
//				});
//				root.add(add, 3, 9);
//				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
//				ImageView imge2 =new ImageView(img_b);
//				imge2.setFitWidth(25);
//				imge2.setFitHeight(25);
//				Button back=new Button("  Back",imge2);
//				back.setPrefWidth(150);
//				back.setPrefHeight(50);
//				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				back.setOnAction(e->{
//					
//					primaryStage.close();
//				});
//				root.add(back, 4, 9);
//				
//				
//				
//				Scene scene = new Scene(root,400,180);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//
//	private static void realbum() {
//		// TODO Auto-generated method stub
//Stage primaryStage=new Stage();
//		
//		
//		try {
//			
//			GridPane root = new GridPane();
//			root.setHgap(10);
//			root.setVgap(10);
//				
//				Text code_T=new Text("artist :");
//				TextField code=new TextField();
//				root.add(code_T, 3, 1);
//				root.add(code, 4, 1);
//				
//				Text titel=new Text("songs :");
//				TextField tit=new TextField();
//				root.add(titel, 3, 2);
//				root.add(tit, 4, 2);
//				
//				
//				
//				
//				Image img_add = new Image(FX.class.getResourceAsStream("del.jpg"));
//				ImageView imge =new ImageView(img_add);
//				imge.setFitWidth(25);
//				imge.setFitHeight(25);
//				Button add=new Button("  Delete",imge);
//				add.setPrefWidth(150);
//				add.setPrefHeight(50);
//				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				add.setOnAction(e->{
//					 
//				});
//				root.add(add, 3, 9);
//				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
//				ImageView imge2 =new ImageView(img_b);
//				imge2.setFitWidth(25);
//				imge2.setFitHeight(25);
//				Button back=new Button("  Back",imge2);
//				back.setPrefWidth(150);
//				back.setPrefHeight(50);
//				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				back.setOnAction(e->{
//					
//					primaryStage.close();
//				});
//				root.add(back, 4, 9);
//				
//				
//				
//				Scene scene = new Scene(root,400,180);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//	
//	
//	
//	
//	/////////////////////********/////////////////////////////////////////////////////////////////
//	private static void findmid() {
//		// TODO Auto-generated method stub
//		
//	}
//	private static void printmid() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	///////////////////////////////////////////////////////////////////////////////////////
//	private static void updatemid() {
//		// TODO Auto-generated method stub
//		
//
//		Stage s=new Stage();
//		Pane root=new Pane();
//		Button Album=new Button("Album");
//		Album.setTranslateX(10);
//		Album.setOnAction(e->{
//			upalbum();
//		});
//		Button Game=new Button("Game");
//		Game.setOnAction(e->{
//			upgame();
//		});
//		Game.setTranslateX(70);
//		Button Movie=new Button("Movie");
//		Movie.setTranslateX(140);
//		Movie.setOnAction(e->{
//			upmove();
//		});
//		
//		root.getChildren().addAll(Movie,Album,Game);
//		Scene scene = new Scene(root,400,180);
//		s.setScene(scene);
//		s.show();
////Stage primaryStage=new Stage();
////		
////		
////		try {
////			
////			GridPane root = new GridPane();
////			root.setHgap(10);
////			root.setVgap(10);
////				
////				Text code_T=new Text("Code :");
////				TextField code=new TextField();
////				root.add(code_T, 3, 1);
////				root.add(code, 4, 1);
////				
////				Text titel=new Text("Titel :");
////				TextField tit=new TextField();
////				root.add(titel, 3, 2);
////				root.add(tit, 4, 2);
////				
////				Text Number=new Text("Number :");
////				TextField nu=new TextField();
////				root.add(Number, 3, 3);
////				root.add(nu, 4, 3);
////				
////				
////				Image img_add = new Image(FX.class.getResourceAsStream("R.png"));
////				ImageView imge =new ImageView(img_add);
////				imge.setFitWidth(25);
////				imge.setFitHeight(25);
////				Button add=new Button("  Add",imge);
////				add.setPrefWidth(150);
////				add.setPrefHeight(50);
////				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				add.setOnAction(e->{
////					 
////				});
////				root.add(add, 3, 9);
////				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
////				ImageView imge2 =new ImageView(img_b);
////				imge2.setFitWidth(25);
////				imge2.setFitHeight(25);
////				Button back=new Button("  Back",imge2);
////				back.setPrefWidth(150);
////				back.setPrefHeight(50);
////				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				back.setOnAction(e->{
////					custmer();
////					primaryStage.close();
////				});
////				root.add(back, 4, 9);
////				
////				
////				
////				Scene scene = new Scene(root,400,180);
////				primaryStage.setScene(scene);
////				primaryStage.show();
////		}catch (Exception e) {
////			// TODO: handle exception
////			e.printStackTrace();
////		}
////			
//		
//	}
//	private static void upmove() {
//		// TODO Auto-generated method stub
//		Stage primaryStage=new Stage();
//		
//		
//		try {
//			
//			GridPane root = new GridPane();
//			root.setHgap(10);
//			root.setVgap(10);
//				
//				Text code_T=new Text("rating :");
//				TextField code=new TextField();
//				root.add(code_T, 3, 1);
//				root.add(code, 4, 1);
//				
//				
//				
//				Image img_add = new Image(FX.class.getResourceAsStream("U.jpg"));
//				ImageView imge =new ImageView(img_add);
//				imge.setFitWidth(25);
//				imge.setFitHeight(25);
//				Button add=new Button("  Update",imge);
//				add.setPrefWidth(150);
//				add.setPrefHeight(50);
//				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				add.setOnAction(e->{
//					 
//				});
//				root.add(add, 3, 9);
//				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
//				ImageView imge2 =new ImageView(img_b);
//				imge2.setFitWidth(25);
//				imge2.setFitHeight(25);
//				Button back=new Button("  Back",imge2);
//				back.setPrefWidth(150);
//				back.setPrefHeight(50);
//				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				back.setOnAction(e->{
//					
//					primaryStage.close();
//				});
//				root.add(back, 4, 9);
//				
//				
//				
//				Scene scene = new Scene(root,400,180);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//	private static void upgame() {
//		// TODO Auto-generated method stub
//		Stage primaryStage=new Stage();
//		
//		
//		try {
//			
//			GridPane root = new GridPane();
//			root.setHgap(10);
//			root.setVgap(10);
//				
//				Text code_T=new Text("weight :");
//				TextField code=new TextField();
//				root.add(code_T, 3, 1);
//				root.add(code, 4, 1);
//				
//				
//				
//				
//				Image img_add = new Image(FX.class.getResourceAsStream("U.jpg"));
//				ImageView imge =new ImageView(img_add);
//				imge.setFitWidth(25);
//				imge.setFitHeight(25);
//				Button add=new Button("  Update",imge);
//				add.setPrefWidth(150);
//				add.setPrefHeight(50);
//				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				add.setOnAction(e->{
//					 
//				});
//				root.add(add, 3, 9);
//				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
//				ImageView imge2 =new ImageView(img_b);
//				imge2.setFitWidth(25);
//				imge2.setFitHeight(25);
//				Button back=new Button("  Back",imge2);
//				back.setPrefWidth(150);
//				back.setPrefHeight(50);
//				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				back.setOnAction(e->{
//					
//					primaryStage.close();
//				});
//				root.add(back, 4, 9);
//				
//				
//				
//				Scene scene = new Scene(root,400,180);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//	private static void upalbum() {
//		// TODO Auto-generated method stub
//		Stage primaryStage=new Stage();
//		
//		
//		try {
//			
//			GridPane root = new GridPane();
//			root.setHgap(10);
//			root.setVgap(10);
//				
//				Text code_T=new Text("artist :");
//				TextField code=new TextField();
//				root.add(code_T, 3, 1);
//				root.add(code, 4, 1);
//				
//				Text titel=new Text("songs :");
//				TextField tit=new TextField();
//				root.add(titel, 3, 2);
//				root.add(tit, 4, 2);
//				
//				
//				
//				
//				Image img_add = new Image(FX.class.getResourceAsStream("U.jpg"));
//				ImageView imge =new ImageView(img_add);
//				imge.setFitWidth(25);
//				imge.setFitHeight(25);
//				Button add=new Button("  Update",imge);
//				add.setPrefWidth(150);
//				add.setPrefHeight(50);
//				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				add.setOnAction(e->{
//					 
//				});
//				root.add(add, 3, 9);
//				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
//				ImageView imge2 =new ImageView(img_b);
//				imge2.setFitWidth(25);
//				imge2.setFitHeight(25);
//				Button back=new Button("  Back",imge2);
//				back.setPrefWidth(150);
//				back.setPrefHeight(50);
//				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				back.setOnAction(e->{
//					
//					primaryStage.close();
//				});
//				root.add(back, 4, 9);
//				
//				
//				
//				Scene scene = new Scene(root,400,180);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//	
//
//	////////////////////////////////////////////////////////////////////////////////////
//	private static void addmid() {
//		// TODO Auto-generated method stub
//		
//		
//		Stage s=new Stage();
//		Pane root=new Pane();
//		Button Album=new Button("Album");
//		Album.setTranslateX(10);
//		Album.setOnAction(e->{
//			addalbum();
//		});
//		Button Game=new Button("Game");
//		Game.setOnAction(e->{
//			addgame();
//		});
//		Game.setTranslateX(70);
//		Button Movie=new Button("Movie");
//		Movie.setTranslateX(140);
//		Movie.setOnAction(e->{
//			addmove();
//		});
//		
//		root.getChildren().addAll(Movie,Album,Game);
//		Scene scene = new Scene(root,400,180);
//		s.setScene(scene);
//		s.show();
////Stage primaryStage=new Stage();
////		
////		
////		try {
////			
////			GridPane root = new GridPane();
////			root.setHgap(10);
////			root.setVgap(10);
////				
////				Text code_T=new Text("Code :");
////				TextField code=new TextField();
////				root.add(code_T, 3, 1);
////				root.add(code, 4, 1);
////				
////				Text titel=new Text("Titel :");
////				TextField tit=new TextField();
////				root.add(titel, 3, 2);
////				root.add(tit, 4, 2);
////				
////				Text Number=new Text("Number :");
////				TextField nu=new TextField();
////				root.add(Number, 3, 3);
////				root.add(nu, 4, 3);
////				
////				
////				Image img_add = new Image(FX.class.getResourceAsStream("R.png"));
////				ImageView imge =new ImageView(img_add);
////				imge.setFitWidth(25);
////				imge.setFitHeight(25);
////				Button add=new Button("  Add",imge);
////				add.setPrefWidth(150);
////				add.setPrefHeight(50);
////				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				add.setOnAction(e->{
////					 
////				});
////				root.add(add, 3, 9);
////				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
////				ImageView imge2 =new ImageView(img_b);
////				imge2.setFitWidth(25);
////				imge2.setFitHeight(25);
////				Button back=new Button("  Back",imge2);
////				back.setPrefWidth(150);
////				back.setPrefHeight(50);
////				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				back.setOnAction(e->{
////					custmer();
////					primaryStage.close();
////				});
////				root.add(back, 4, 9);
////				
////				
////				
////				Scene scene = new Scene(root,400,180);
////				primaryStage.setScene(scene);
////				primaryStage.show();
////		}catch (Exception e) {
////			// TODO: handle exception
////			e.printStackTrace();
////		}
////			
//		
//	}
//	private static void addmove() {
//		// TODO Auto-generated method stub
//		Stage primaryStage=new Stage();
//		
//		
//		try {
//			
//			GridPane root = new GridPane();
//			root.setHgap(10);
//			root.setVgap(10);
//				
//				Text code_T=new Text("rating :");
//				TextField code=new TextField();
//				root.add(code_T, 3, 1);
//				root.add(code, 4, 1);
//			
//				
//				Image img_add = new Image(FX.class.getResourceAsStream("R.png"));
//				ImageView imge =new ImageView(img_add);
//				imge.setFitWidth(25);
//				imge.setFitHeight(25);
//				Button add=new Button("  Add",imge);
//				add.setPrefWidth(150);
//				add.setPrefHeight(50);
//				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				add.setOnAction(e->{
//					 
//				});
//				root.add(add, 3, 9);
//				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
//				ImageView imge2 =new ImageView(img_b);
//				imge2.setFitWidth(25);
//				imge2.setFitHeight(25);
//				Button back=new Button("  Back",imge2);
//				back.setPrefWidth(150);
//				back.setPrefHeight(50);
//				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				back.setOnAction(e->{
//					
//					primaryStage.close();
//				});
//				root.add(back, 4, 9);
//				
//				
//				
//				Scene scene = new Scene(root,400,180);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//	private static void addgame() {
//		// TODO Auto-generated method stub
//		Stage primaryStage=new Stage();
//		
//		
//		try {
//			
//			GridPane root = new GridPane();
//			root.setHgap(10);
//			root.setVgap(10);
//				
//				Text code_T=new Text("weight :");
//				TextField code=new TextField();
//				root.add(code_T, 3, 1);
//				root.add(code, 4, 1);
//				
//				Image img_add = new Image(FX.class.getResourceAsStream("R.png"));
//				ImageView imge =new ImageView(img_add);
//				imge.setFitWidth(25);
//				imge.setFitHeight(25);
//				Button add=new Button("  Add",imge);
//				add.setPrefWidth(150);
//				add.setPrefHeight(50);
//				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				add.setOnAction(e->{
//					 
//				});
//				root.add(add, 3, 9);
//				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
//				ImageView imge2 =new ImageView(img_b);
//				imge2.setFitWidth(25);
//				imge2.setFitHeight(25);
//				Button back=new Button("  Back",imge2);
//				back.setPrefWidth(150);
//				back.setPrefHeight(50);
//				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				back.setOnAction(e->{
//					
//					primaryStage.close();
//				});
//				root.add(back, 4, 9);
//				
//				
//				
//				Scene scene = new Scene(root,400,180);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//			
//	}
//	private static void addalbum() {
//		// TODO Auto-generated method stub
//		Stage primaryStage=new Stage();
//		
//		
//		try {
//			
//			GridPane root = new GridPane();
//			root.setHgap(10);
//			root.setVgap(10);
//				
//				Text code_T=new Text("artist :");
//				TextField code=new TextField();
//				root.add(code_T, 3, 1);
//				root.add(code, 4, 1);
//				
//				Text titel=new Text("songs :");
//				TextField tit=new TextField();
//				root.add(titel, 3, 2);
//				root.add(tit, 4, 2);
//				
//				
//				
//				
//				Image img_add = new Image(FX.class.getResourceAsStream("R.png"));
//				ImageView imge =new ImageView(img_add);
//				imge.setFitWidth(25);
//				imge.setFitHeight(25);
//				Button add=new Button("  Add",imge);
//				add.setPrefWidth(150);
//				add.setPrefHeight(50);
//				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				add.setOnAction(e->{
//					 
//				});
//				root.add(add, 3, 9);
//				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
//				ImageView imge2 =new ImageView(img_b);
//				imge2.setFitWidth(25);
//				imge2.setFitHeight(25);
//				Button back=new Button("  Back",imge2);
//				back.setPrefWidth(150);
//				back.setPrefHeight(50);
//				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//				back.setOnAction(e->{
//					
//					primaryStage.close();
//				});
//				root.add(back, 4, 9);
//				
//				
//				
//				Scene scene = new Scene(root,400,180);
//				primaryStage.setScene(scene);
//				primaryStage.show();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//			
//	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static void Rent() {
		
		Stage primaryStage=new Stage();
		
		
			try {
				GridPane root = new GridPane();
				root.setHgap(10);
				root.setVgap(10);
				root.setMinSize(400, 200);
				root.setPadding(new Insets(10, 10, 10, 10)); 
				root.setAlignment(Pos.CENTER);
				
				
					
				Text te=new Text("Customer ID :");
				te.setFill(Color.RED);
				te.setFont(new Font("Arial", 30));		
				TextField custamer_area=new TextField();
				custamer_area.setPromptText("Information about customer....");
				custamer_area.setPrefWidth(630);
				custamer_area.setPrefHeight(100);
				custamer_area.setStyle("-fx-text-fill:#ff0000;"+"-fx-background-color: #ff9999;"+ "-fx-background-radius:10;");
				root.add(te, 1, 2);
				TextField textfild=new TextField();
				textfild.setPromptText("id in custamer");
				textfild.setPrefWidth(50);
				textfild.setPrefHeight(50);
				textfild.setStyle("-fx-background-color: #d1e0e0;"+ "-fx-background-radius:10;");
				root.add(textfild,1,3);
				root.add(custamer_area, 1, 4);
				
				
				
				Text te2=new Text("Media Code :");
				te2.setFill(Color.RED);
				te2.setFont(new Font("Arial", 30));		
				TextField mi_area=new TextField();
				mi_area.setPromptText("Information about Media...");
				mi_area.setPrefWidth(630);
				mi_area.setPrefHeight(100);
				mi_area.setStyle("-fx-background-color: #ff9999;"+ "-fx-background-radius:10;");
				root.add(te2, 1, 5);
				TextField textfildMI=new TextField();
				textfildMI.setPromptText("Media Code...");
				textfildMI.setPrefWidth(50);
				textfildMI.setPrefHeight(50);
				textfildMI.setStyle("-fx-background-color: #d1e0e0;"+ "-fx-background-radius:10;");
				root.add(textfildMI,1,6);
				root.add(mi_area, 1, 7);
				
				
				Text te3=new Text("Rented Date :");
				te3.setFill(Color.RED);
				te3.setFont(new Font("Arial", 30));		
				root.add(te3, 1, 8);
				TextField textfildRE=new TextField();
				textfildRE.setPrefWidth(50);
				textfildRE.setPrefHeight(50);
				textfildRE.setStyle("-fx-background-color: #d1e0e0;"+ "-fx-background-radius:10;");
				root.add(textfildRE,1,9);
				textfildRE.setPromptText("Read current date of system ...");
				
				
				Pane pane=new Pane();
				
				Button add=new Button("add To cart");
				add.setTranslateX(10-10);
				add.setPrefWidth(150);
				add.setPrefHeight(50);
				add.setStyle("-fx-background-color: #ffb3b3;"+ "-fx-background-radius:10;");
				//root.add(add, 1, 10);
				Button Process=new Button("Process Cart");
				Process.setTranslateX(140+20);
				Process.setPrefWidth(150);
				Process.setPrefHeight(50);
				Process.setStyle("-fx-background-color: #ffb3b3;"+ "-fx-background-radius:10;");
				//root.add(Process, 2, 10);
				Button back =new Button("End");
				back.setOnAction(e->{
					primaryStage.close();
				});
				back.setTranslateX(500-30);
				back.setPrefWidth(150);
				back.setPrefHeight(50);
				back.setStyle("-fx-background-color: #ffb3b3;"+ "-fx-background-radius:10;");
				pane.getChildren().addAll(add,Process,back);
				//root.add(back, 3, 10);
				root.add(pane, 1, 10);
					Scene scene = new Scene(root,650,600+20);
					primaryStage.setScene(scene);
					primaryStage.setTitle("Rent for");
					primaryStage.show();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
				
			}
//			
//
////	private static void addcus() {
////		Stage primaryStage=new Stage();
////		
////		
////	
////			GridPane root = new GridPane();
////			root.setHgap(10);
////			root.setVgap(10);
////				
////				
////				Text id_T=new Text("ustomer ID:");
////				TextField id=new TextField();
////				root.add(id_T, 3, 1);
////				root.add(id, 4, 1);
////				Text name_T=new Text("Customer Name");
////				TextField name=new TextField();
////				root.add(name_T, 3, 3);
////				root.add(name, 4, 3);
////				
////				Text addre_T=new Text("Customer Addre");
////				TextField addres=new TextField();
////				root.add(addre_T, 3, 5);
////				root.add(addres, 4, 5);
////				Text mo_T=new Text("Customer Mobile:");
////				TextField mobile=new TextField();
////				root.add(mo_T, 3, 7);
////				root.add(mobile, 4, 7);
////				Image img_add = new Image(FX.class.getResourceAsStream("R.png"));
////				ImageView imge =new ImageView(img_add);
////				imge.setFitWidth(25);
////				imge.setFitHeight(25);
////				Button add=new Button("  Add",imge);
////				add.setPrefWidth(150);
////				add.setPrefHeight(50);
////				add.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				add.setOnAction(e->{
////					if(id!=null&&name!=null&&addres!=null&&mobile!=null) {		
////					 m.addCustomer(id.getText(), name.getText(), addres.getText(), mobile.getText(), "dfb");
////					 System.out.println(m.getAllCustomersInfo());
////					 print("Done");
////					}
////				});
////				root.add(add, 3, 9);
////				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
////				ImageView imge2 =new ImageView(img_b);
////				imge2.setFitWidth(25);
////				imge2.setFitHeight(25);
////				Button back=new Button("  Back",imge2);
////				back.setPrefWidth(150);
////				back.setPrefHeight(50);
////				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				back.setOnAction(e->{
////					custmer();
////					primaryStage.close();
////				});
////				root.add(back, 4, 9);
////				
////				
////				Scene scene = new Scene(root,400,350);
////				primaryStage.setScene(scene);
////				primaryStage.show();
//////		}catch (Exception e) {
//////			// TODO: handle exception
//////			e.printStackTrace();
//////		}
////			
////		}
////	
////	
////	private static void removcus() {
////		Stage primaryStage=new Stage();
////		
////		
////		try {
////			
////			GridPane root = new GridPane();
////			root.setHgap(10);
////			root.setVgap(10);
////				
////				Text id_T=new Text("Customer ID:");
////				TextField id=new TextField();
////				root.add(id_T, 4, 1);
////				root.add(id, 5, 1);
//////				Text name_T=new Text("Customer Name");
//////				TextField name=new TextField();
//////				root.add(name_T, 3, 3);
//////				root.add(name, 4, 3);
//////				
//////				Text addre_T=new Text("Customer Addre");
//////				TextField addres=new TextField();
//////				root.add(addre_T, 3, 5);
//////				root.add(addres, 4, 5);
//////				Text mo_T=new Text("Customer Mobile:");
//////				TextField mobile=new TextField();
//////				root.add(mo_T, 3, 7);
//////				root.add(mobile, 4, 7);
//////				Image img_f = new Image(FX.class.getResourceAsStream("find.png"));
//////				ImageView imgef =new ImageView(img_f);
//////				imgef.setFitWidth(25);
//////				imgef.setFitHeight(25);
//////				Button find=new Button("  Find",imgef);
//////				find.setPrefWidth(150);
//////				find.setPrefHeight(50);
//////				find.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
//////				find.setOnAction(e->{
//////					 
//////				});
//////				root.add(find, 3, 9);
////				
////				
////				Image img_re = new Image(FX.class.getResourceAsStream("del.jpg"));
////				ImageView imgre =new ImageView(img_re);
////				imgre.setFitWidth(25);
////				imgre.setFitHeight(25);
////				Button re=new Button("  Remove",imgre);
////				re.setPrefWidth(150);
////				re.setPrefHeight(50);
////				re.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				re.setOnAction(e->{
////					
////					 System.out.println( m.removeFromCart(id.getText(),null));
////					 String s=String.valueOf(m.removeFromCart(id.getText(),null));
////					 print(s);
////				});
////				root.add(re, 4, 9);
////				Image img_b = new Image(FX.class.getResourceAsStream("R.png"));
////				ImageView imgeb =new ImageView(img_b);
////				imgeb.setFitWidth(25);
////				imgeb.setFitHeight(25);
////				Button back=new Button("  Back",imgeb);
////				back.setPrefWidth(150);
////				back.setPrefHeight(50);
////				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				back.setOnAction(e->{
////					custmer();
////					primaryStage.close();
////				});
////				root.add(back, 5, 9);
////				
////				
////				Scene scene = new Scene(root,380+5,250-10-10);
////				primaryStage.setScene(scene);
////				primaryStage.show();
////		}catch (Exception e) {
////			// TODO: handle exception
////			e.printStackTrace();
////		}
////			
////		}
////	
////	
////	private static void upcus() {
////		Stage primaryStage=new Stage();
////		
////		
////		try {
////			
////			GridPane root = new GridPane();
////			root.setHgap(10);
////			root.setVgap(10);
////				
////				
////				Text id_T=new Text("ustomer ID:");
////				TextField id=new TextField();
////				root.add(id_T, 3, 1);
////				root.add(id, 4, 1);
////				Text name_T=new Text("Customer Name");
////				TextField name=new TextField();
////				root.add(name_T, 3, 3);
////				root.add(name, 4, 3);
////				
////				Text addre_T=new Text("Customer Addre");
////				TextField addres=new TextField();
////				root.add(addre_T, 3, 5);
////				root.add(addres, 4, 5);
////				Text mo_T=new Text("Customer Mobile:");
////				TextField mobile=new TextField();
////				root.add(mo_T, 3, 7);
////				root.add(mobile, 4, 7);
////				Image img_up = new Image(FX.class.getResourceAsStream("U.jpg"));
////				ImageView imgeup =new ImageView(img_up);
////				imgeup.setFitWidth(30);
////				imgeup.setFitHeight(30);
////				Button up=new Button("  Update",imgeup);
////				up.setPrefWidth(150);
////				up.setPrefHeight(50);
////				up.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				up.setOnAction(e->{
////					 m.updateCustomar(id.getText(),name.getText(), addres.getText(), mobile.getText(), null);
////					 print(String.valueOf(m.updateCustomar(id.getText(),name.getText(), addres.getText(), mobile.getText(), null)));
////				});
////				root.add(up, 3, 9);
////				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
////				ImageView imge2 =new ImageView(img_b);
////				imge2.setFitWidth(25);
////				imge2.setFitHeight(25);
////				Button back=new Button("  Back",imge2);
////				back.setPrefWidth(150);
////				back.setPrefHeight(50);
////				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				back.setOnAction(e->{
////					custmer();
////					primaryStage.close();
////				});
////				root.add(back, 4, 9);
////				
////				
////				Scene scene = new Scene(root,400,350);
////				primaryStage.setScene(scene);
////				primaryStage.show();
////		}catch (Exception e) {
////			// TODO: handle exception
////			e.printStackTrace();
////		}
////			
////		}
////		
////
////
////	private static void find() {
////		Stage primaryStage=new Stage();
////		
////		
////		try {
////			
////			GridPane root = new GridPane();
////			root.setHgap(10);
////			root.setVgap(10);
////				
////				Text id_T=new Text("Customer ID:");
////				TextField id=new TextField();
////				root.add(id_T, 3, 1);
////				root.add(id, 4, 1);
////				
////				Image img_f = new Image(FX.class.getResourceAsStream("find.png"));
////				ImageView imgef =new ImageView(img_f);
////				imgef.setFitWidth(25);
////				imgef.setFitHeight(25);
////				Button find=new Button("  Find",imgef);
////				find.setPrefWidth(150);
////				find.setPrefHeight(50);
////				find.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				find.setOnAction(e->{
////					 m.findCustomar(id.getText());
////					 print(m.findCustomar(id.getText()));
////				});
////				root.add(find, 3, 9);
////
////				Image img_b = new Image(FX.class.getResourceAsStream("B.png"));
////				ImageView imgeb =new ImageView(img_b);
////				imgeb.setFitWidth(25);
////				imgeb.setFitHeight(25);
////				Button back=new Button("  Back",imgeb);
////				back.setPrefWidth(150);
////				back.setPrefHeight(50);
////				back.setStyle("-fx-background-color: #00bfff;"+ "-fx-background-radius:10;");
////				back.setOnAction(e->{
////					custmer();
////					primaryStage.close();
////				});
////				root.add(back, 4, 9);
////				
////				
////				Scene scene = new Scene(root,400,180);
////				primaryStage.setScene(scene);
////				primaryStage.show();
////		}catch (Exception e) {
////			// TODO: handle exception
////			e.printStackTrace();
////		}
////			
////		}
////	

	public static void print(String str) {
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
