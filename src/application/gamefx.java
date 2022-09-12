package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class gamefx {
	public static void game(MediaRental m) {
		GridPane p = new GridPane();
		p.setHgap(10);
		p.setVgap(10);
		Stage s =new Stage();
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
			System.out.println(m.removeGame(ct.getText()));
		});
		Button update=new Button("update");
		p.add(update, 2, 9+2+2);
		update.setOnAction(e->{
			System.out.println(m.updateGame(ct.getText(), tt.getText(), Integer.parseInt(nt.getText()), Integer.parseInt(wt.getText())));
		});
		
		Button find=new Button("find");
		p.add(find, 4, 9+2+2);
		find.setOnAction(e->{
			System.out.println(m.findGame(ct.getText()));
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
		
		s.setScene(sc);
		s.show();
		
		
	}
}
