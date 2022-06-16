import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;



public class Interface extends Application {
	public static String x;
	public static List<String> Dispo=new ArrayList<>();
	
	
	
	public void archiveTraveler(Voyageur voyageur) {
    	try {
    		  FileWriter out = new FileWriter ("Travelerinfo.txt", true);   
    		  String info = voyageur.getName() + ":" 
    		  + ":" + voyageur.getNumcartenationale() + ":" + voyageur.getAdresseMail() 
    		  + ":" + voyageur.getNumTel() + "\n";
    		  out.write(info);
    		  out.close ();
    	}	catch (IOException erreur) { 
    		  System.out.println("Erreur : IO Exception");}
    	}   	
	public void archiveDestination(Train train) {
    	try {
    		  FileWriter out = new FileWriter ("Traininfo.txt", true);   
    		  String info = train.getDeStation() + ":" 
    		  + ":" + train.getVersStation() + ":" + train.getDate().toString() 
    		  + "\n";
    		  out.write(info);
    		  out.close ();
    	}	catch (IOException erreur) { 
    		  System.out.println("Erreur : IO Exception");
    	}      	
    }
	public void archiveplaceDispo(Train train) {
    	try {
    		  FileWriter out = new FileWriter ("TrainPlace.txt", true);   
    		  String info = train.getTarif() + ":" 
    		  + ":" + train.getVersStation() + ":" + train.getDate().toString() 
    		  + "\n";
    		  out.write(info);
    		  out.close ();
    	}	catch (IOException erreur) { 
    		  System.out.println("Erreur : IO Exception");
    	}      	
    }
    public void start(Stage fenetre) throws IOException{
    	
    	//1ST WINDOW ------------------------------------------------------------------------------------------------
    	
        GridPane root1 = new GridPane();
        root1.setHgap(8);
        root1.setVgap(8);
        root1.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(root1,1024,600, Color.WHITE);
        
        
        /*Image icon = new Image("C:\\Users\\HP\\Downloads\\ay.png");
        fenetre.getIcons().add(icon);*/
        Text texte = new Text("Welcome to MyTrainTicket");
        texte.setFont(Font.font("", FontWeight.BOLD, 30));
        texte.setFill(Color.web("#008080"));
        Text texte1 = new Text("Please enter your infos to book your ticket");
        texte1.setFont(Font.font("", FontWeight.MEDIUM,15));
        Label b = new Label("Full Name");
        Label b2 = new Label("ID Number");
        Label b3 = new Label("E-mail");
        Label b4 = new Label("Phone Number");
        TextField userfield = new TextField();
        
        TextField userfield2 = new TextField();
        TextField userfield3 = new TextField();
        TextField userfield4 = new TextField();
        root1.add(texte,1,0,2,1);
        root1.add(texte1,0,1,3,1);
        root1.add(b, 0,3);
        
        root1.add(b2, 0,4);
        root1.add(b3, 0,5);
        root1.add(b4, 0,6);
        root1.add(userfield, 1,3);
        
        root1.add(userfield2, 1,4);
        root1.add(userfield3, 1,5);
        root1.add(userfield4, 1,6);
        

        
        //2ND WINDOW ------------------------------------------------------------------------------------------
        
        
        
        GridPane root2 = new GridPane();
        root2.setHgap(8);
        root2.setVgap(8);
        root2.setAlignment(Pos.CENTER);
        
        
        
        /*Image icon = new Image("C:\\Users\\HP\\Downloads\\ay.png");
        fenetre.getIcons().add(icon);*/
        Text texte4 = new Text("Destination and Departure Day");
        texte4.setFont(Font.font("", FontWeight.BOLD, 30));
        texte4.setFill(Color.web("#008080"));
        Text texte5 = new Text("Please choose your Destination!");
        texte5.setFont(Font.font("", FontWeight.MEDIUM,15));
        Label c = new Label("From");
        Label c1 = new Label("to");
        Label c2 = new Label("Departure Day");
        /*Label c3 = new Label("Adresse Mail");
        Label c4 = new Label("N° de Tel");*/
        TextField userfiel = new TextField();
        TextField userfiel1 = new TextField();
        TextField userfiel2 = new TextField();
        /*TextField userfield3 = new TextField();
        TextField userfield4 = new TextField();*/
        root2.add(texte4,1,0,2,1);
        root2.add(texte5,0,1,3,1);
        root2.add(c, 0,3);
        root2.add(c1, 0,4);
        root2.add(c2, 0,5);
       /* root2.add(c3, 0,6);
        root2.add(c4, 0,7);*/
        root2.add(userfiel, 1,3);
        root2.add(userfiel1, 1,4);
        root2.add(userfiel2, 1,5);
        /*root1.add(userfield3, 1,6);
        root1.add(userfield4, 1,7);*/
        
        
        
        
        //3RD WINDOW ----------------------------------------------------------------------------------------------
        
     
        
        
        GridPane root = new GridPane();
        root.setHgap(15);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);
        

        
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        Image icon2 = new Image(path + "\\src\\train.png");
        fenetre.getIcons().add(icon2);
      //titles
        Text texte2 = new Text("Book your Ticket");
        texte2.setFont(Font.font("", FontWeight.BOLD, 40));
        texte2.setFill(Color.web("#008080"));

        Text texte3 = new Text("Please chose your train !");
        texte3.setFont(Font.font("", FontWeight.NORMAL, 20));
        texte3.setFill(Color.web("#000000"));
        
      //TrainN
        Label lb = new Label("TrainUn");
        lb.setTextFill(Color.web("#FF2400"));
        lb.setFont(Font.font("",FontWeight.BOLD, 14));

        Label lb1 = new Label("TrainDeux");
        lb1.setTextFill(Color.web("#FF2400"));
        lb1.setFont(Font.font("", FontWeight.BOLD, 14));

        Label lb2 = new Label("TrainTrois");
        lb2.setTextFill(Color.web("#FF2400"));
        lb2.setFont(Font.font("", FontWeight.BOLD, 14));

        Label lb3 = new Label("TrainQuatre");
        lb3.setTextFill(Color.web("#FF2400"));
        lb3.setFont(Font.font("", FontWeight.BOLD, 14));

        Label lb4 = new Label("TrainCinq");
        lb4.setTextFill(Color.web("#FF2400"));
        lb4.setFont(Font.font("", FontWeight.BOLD, 14));

        Label lb5 = new Label("TrainSix");
        lb5.setTextFill(Color.web("#FF2400"));
        lb5.setFont(Font.font("", FontWeight.BOLD, 14));

        /*008080*/
      //FROM
        Label lbl = new Label("From :");
        lbl.setFont(Font.font("", FontWeight.BOLD, 12));
        Label lbl1 = new Label("From :");
        lbl1.setFont(Font.font("", FontWeight.BOLD, 12));
        Label lbl2 = new Label("From :");
        lbl2.setFont(Font.font("", FontWeight.BOLD, 12));
        Label lbl3 = new Label("From :");
        lbl3.setFont(Font.font("", FontWeight.BOLD, 12));
        Label lbl4 = new Label("From :");
        lbl4.setFont(Font.font("", FontWeight.BOLD, 12));
        Label lbl5 = new Label("From :");
        lbl5.setFont(Font.font("", FontWeight.BOLD, 12));
        
      //FROM1
        Label lc = new Label("Rabat");
        lc.setFont(Font.font("", FontWeight.BOLD, 12));
        lc.setTextFill(Color.web("#008000"
        		+ ""));
        
        Label lc1 = new Label("Casablanca");
        lc1.setFont(Font.font("", FontWeight.BOLD, 12));
        lc1.setTextFill(Color.web("#116530"));
        
        Label lc2 = new Label("Casablanca");
        lc2.setFont(Font.font("", FontWeight.BOLD, 12));
        lc2.setTextFill(Color.web("#116530"));

        Label lc3 = new Label("Rabat");
        lc3.setFont(Font.font("", FontWeight.BOLD, 12));
        lc3.setTextFill(Color.web("#116530"));

        Label lc4 = new Label("Marrakech");
        lc4.setFont(Font.font("", FontWeight.BOLD, 12));
        lc4.setTextFill(Color.web("#116530"));

        Label lc5 = new Label("Marrakech");
        lc5.setFont(Font.font("", FontWeight.BOLD, 12));
        lc5.setTextFill(Color.web("#116530"));

      //TO
        Label lcl = new Label("To :");
        lcl.setFont(Font.font("", FontWeight.BOLD, 12));
        Label lcl1 = new Label("To :");
        lcl1.setFont(Font.font("", FontWeight.BOLD, 12));
        Label lcl2 = new Label("To :");
        lcl2.setFont(Font.font("", FontWeight.BOLD, 12));
        Label lcl3 = new Label("To :");
        lcl3.setFont(Font.font("", FontWeight.BOLD, 12));
        Label lcl4 = new Label("To :");
        lcl4.setFont(Font.font("", FontWeight.BOLD, 12));
        Label lcl5 = new Label("To :");
        lcl5.setFont(Font.font("", FontWeight.BOLD, 12));
        
      //TO1
        Label ld = new Label("Casablanca");
        ld.setFont(Font.font("", FontWeight.BOLD, 12));
        ld.setTextFill(Color.web("#116530"));
        
        Label ld1 = new Label("Rabat");
        ld1.setFont(Font.font("", FontWeight.BOLD, 12));
        ld1.setTextFill(Color.web("#116530"));
        
        Label ld2 = new Label("Tanger");
        ld2.setFont(Font.font("", FontWeight.BOLD, 12));
        ld2.setTextFill(Color.web("#116530"));
        
        Label ld3 = new Label("Marrakech");
        ld3.setFont(Font.font("", FontWeight.BOLD, 12));
        ld3.setTextFill(Color.web("#116530"));
        
        Label ld4 = new Label("Casablanca");
        ld4.setFont(Font.font("", FontWeight.BOLD, 12));
        ld4.setTextFill(Color.web("#116530"));
        
        Label ld5 = new Label("Benguerir");
        ld5.setFont(Font.font("", FontWeight.BOLD, 12));
        ld5.setTextFill(Color.web("#116530"));
        
      //AVAILABLE SEATS
        Label ldl = new Label("Available seats :");
        ldl.setFont(Font.font("", FontWeight.BOLD, 12));

        Label ldl1 = new Label("Available seats :");
        ldl1.setFont(Font.font("", FontWeight.BOLD, 12));
        
        Label ldl2 = new Label("Available seats :");
        ldl2.setFont(Font.font("", FontWeight.BOLD, 12));
        
        Label ldl3 = new Label("Available seats :");
        ldl3.setFont(Font.font("", FontWeight.BOLD, 12));
        
        Label ldl4 = new Label("Available seats :");
        ldl4.setFont(Font.font("", FontWeight.BOLD, 12));
        
        Label ldl5 = new Label("Available seats :");
        ldl5.setFont(Font.font("", FontWeight.BOLD, 12));
        
      //100
        Label le = new Label("3");
        le.setFont(Font.font("", FontWeight.BOLD, 12));
        le.setTextFill(Color.web("#FF2400"));
        
        Label le1 = new Label("100");
        le1.setFont(Font.font("", FontWeight.BOLD, 12));
        le1.setTextFill(Color.web("#FF2400"));
        
        Label le2 = new Label("100");
        le2.setFont(Font.font("", FontWeight.BOLD, 12));
        le2.setTextFill(Color.web("#FF2400"));
        
        Label le3 = new Label("100");
        le3.setFont(Font.font("", FontWeight.BOLD, 12));
        le3.setTextFill(Color.web("#FF2400"));
        
        Label le4 = new Label("100");
        le4.setFont(Font.font("", FontWeight.BOLD, 12));
        le4.setTextFill(Color.web("#FF2400"));
        
        Label le5 = new Label("100");
        le5.setFont(Font.font("", FontWeight.BOLD, 12));
        le5.setTextFill(Color.web("#FF2400"));
        
      //Price
        Label lel = new Label("Price :");
        lel.setFont(Font.font("", FontWeight.BOLD, 12));

        Label lel1 = new Label("Price :");
        lel1.setFont(Font.font("", FontWeight.BOLD, 12));
        
        Label lel2 = new Label("Price :");
        lel2.setFont(Font.font("", FontWeight.BOLD, 12));
        
        Label lel3 = new Label("Price :");
        lel3.setFont(Font.font("", FontWeight.BOLD, 12));
        
        Label lel4 = new Label("Price :");
        lel4.setFont(Font.font("", FontWeight.BOLD, 12));
        
        Label lel5 = new Label("Price :");
        lel5.setFont(Font.font("", FontWeight.BOLD, 12));
        
        //50
        Label lf = new Label("50");
        lf.setFont(Font.font("", FontWeight.BOLD, 12));
        lf.setTextFill(Color.web("#FF2400"));
        
        Label lf1 = new Label("50");
        lf1.setFont(Font.font("", FontWeight.BOLD, 12));
        lf1.setTextFill(Color.web("#FF2400"));
        
        Label lf2 = new Label("50");
        lf2.setFont(Font.font("", FontWeight.BOLD, 12));
        lf2.setTextFill(Color.web("#FF2400"));
        
        Label lf3 = new Label("50");
        lf3.setFont(Font.font("", FontWeight.BOLD, 12));
        lf3.setTextFill(Color.web("#FF2400"));
        
        Label lf4 = new Label("50");
        lf4.setFont(Font.font("", FontWeight.BOLD, 12));
        lf4.setTextFill(Color.web("#FF2400"));
        
        Label lf5 = new Label("50");
        lf5.setFont(Font.font("", FontWeight.BOLD, 12));
        lf5.setTextFill(Color.web("#FF2400"));
        
        

      //titles
        root.add(texte2,4,0,2,1);
        root.add(texte3,4,1,5,1);
      //TrainN
        root.add(lb, 0,3);
        root.add(lb1, 0,4);
        root.add(lb2, 0,5);
        root.add(lb3, 0,6);
        root.add(lb4, 0,7);
        root.add(lb5, 0,8);
      //DE
        root.add(lbl, 1,3);
        root.add(lbl1, 1,4);
        root.add(lbl2, 1,5);
        root.add(lbl3, 1,6);
        root.add(lbl4, 1,7);
        root.add(lbl5, 1,8);
      //DE1
        root.add(lc, 2,3);
        root.add(lc1, 2,4);
        root.add(lc2, 2,5);
        root.add(lc3, 2,6);
        root.add(lc4, 2,7);
        root.add(lc5, 2,8);
      //VERS
        root.add(lcl, 3,3);
        root.add(lcl1, 3,4);
        root.add(lcl2, 3,5);
        root.add(lcl3, 3,6);
        root.add(lcl4, 3,7);
        root.add(lcl5, 3,8);
      //VERS1
        root.add(ld, 4,3);
        root.add(ld1, 4,4);
        root.add(ld2, 4,5);
        root.add(ld3, 4,6);
        root.add(ld4, 4,7);
        root.add(ld5, 4,8);
      //NombreDePlacesDisponibles  
        root.add(ldl, 5,3);
        root.add(ldl1, 5,4);
        root.add(ldl2, 5,5);
        root.add(ldl3, 5,6);
        root.add(ldl4, 5,7);
        root.add(ldl5, 5,8);
      //100  
        root.add(le, 6,3);
        root.add(le1, 6,4);
        root.add(le2, 6,5);
        root.add(le3, 6,6);
        root.add(le4, 6,7);
        root.add(le5, 6,8);
      //Price  
        root.add(lel, 7,3);
        root.add(lel1, 7,4);
        root.add(lel2, 7,5);
        root.add(lel3, 7,6);
        root.add(lel4, 7,7);
        root.add(lel5, 7,8);
      //50  
        root.add(lf, 8,3);
        root.add(lf1, 8,4);
        root.add(lf2, 8,5);
        root.add(lf3, 8,6);
        root.add(lf4, 8,7);
        root.add(lf5, 8,8);
        
        Dispo.add("Rabat/Casablanca");
        Dispo.add("Casablanca/Rabat");
        Dispo.add("Casablanca/Tanger");
        Dispo.add("Rabat/Marrackech");
        Dispo.add("Marrackech/Casablanca");
        Dispo.add("Marrackech/Benguerir");
        
        Button button = new Button("Book");
        Button button1 = new Button("Book");
        Button button2 = new Button("Book");
        Button button3 = new Button("Book");
        Button button4 = new Button("Book");
        Button button5 = new Button("Book");
        root.add(button,10,3);
        root.add(button1,10,4);
        root.add(button2,10,5);
        root.add(button3,10,6);
        root.add(button4,10,7);
        root.add(button5,10,8);
        
        //4TH WINDOW-------------------------------------------------------------------------------------------------------------
        
        GridPane root3 = new GridPane();
        root3.setHgap(5);
        root3.setVgap(2);
        root3.setAlignment(Pos.CENTER);
        
        Text texte6 = new Text("Here is your Ticket!");
        texte6.setFont(Font.font("", FontWeight.BOLD, 40));
        texte6.setFill(Color.web("#008080"));

        Text texte7 = new Text("Have a nice Trip!");
        texte7.setFont(Font.font("", FontWeight.NORMAL, 20));
        texte7.setFill(Color.web("#000000"));
        
        Label t = new Label("TICKET");
        t.setFont(Font.font("", FontWeight.BOLD, 30));
        t.setTextFill(Color.web("#FF2400"));
        
        Label t1 = new Label("Full Name : ");
        t1.setFont(Font.font("", FontWeight.BOLD, 15));
        t1.setTextFill(Color.web("#FF2400"));
        
        Label t2 = new Label("ID Number : ");
        t2.setFont(Font.font("", FontWeight.BOLD, 15));
        t2.setTextFill(Color.web("#FF2400"));
        
        Label t3 = new Label("E-mail : ");
        t3.setFont(Font.font("", FontWeight.BOLD, 15));
        t3.setTextFill(Color.web("#FF2400"));
        
        Label t4 = new Label("Phone Number : ");
        t4.setFont(Font.font("", FontWeight.BOLD, 15));
        t4.setTextFill(Color.web("#FF2400"));
        
        Label t5 = new Label("From : ");
        t5.setFont(Font.font("", FontWeight.BOLD, 15));
        t5.setTextFill(Color.web("#FF2400"));
        
        Label t6 = new Label("To :");
        t6.setFont(Font.font("", FontWeight.BOLD, 15));
        t6.setTextFill(Color.web("#FF2400"));
        
        Label t7 = new Label("Departure Day :");
        t7.setFont(Font.font("", FontWeight.BOLD, 15));
        t7.setTextFill(Color.web("#FF2400"));
        
        Label t8 = new Label("TicketCode : ");
        t8.setFont(Font.font("", FontWeight.BOLD, 15));
        t8.setTextFill(Color.web("#FF2400"));
        
      //Titles
        root3.add(texte6,9,0,2,1);
        root3.add(texte7,10,1,7,1);
        
        root3.add(t, 6,5);
        root3.add(t1, 6,8);
        root3.add(t2, 6,9);
        root3.add(t3, 6,10);
        root3.add(t4, 6,11);
        root3.add(t5, 12,8);
        root3.add(t6, 12,9);
        root3.add(t7, 12,10);
        root3.add(t8, 12,11);
        
        button.setOnAction(e->{
        	if(Integer.parseInt(le.getText())==0) {
        		Alert alert=new Alert(AlertType.ERROR);
        		alert.setContentText("No more places left in the train");
        		alert.setTitle("NoTicketsLeftError");
        		/*alert.setHeaderText("")
        		alert.setGraphic();*/
        		alert.show();
        	}
        	else {
        		System.out.println(x);
        		le.setText(String.valueOf( Integer.parseInt(le.getText()) -1))  ;      
        	}});
        	
        Button bouton = new Button("Confirm");
        root1.add(bouton,3,8);
        
        Button botona = new Button("Confirm");
        root2.add(botona, 12, 15);
        
        Button boutonreculepremier = new Button("Previous");
        root2.add(boutonreculepremier, 11, 15);
        
        Button boutonreculelast = new Button("Previous");
        root.add(boutonreculelast, 11, 15);
        
        
        
        Voyageur vv = new Voyageur(userfield.getText(), userfield2.getText(), userfield3.getText(), userfield4.getText());
        bouton.setOnAction(new EventHandler<ActionEvent>(){
        	
        	@Override
        	public void handle(ActionEvent event) {
        		if (userfield.getText() == "" || userfield2.getText() == "" || userfield3.getText() == "" || userfield4.getText() == "") {
        			Alert alert=new Alert(AlertType.ERROR);
            		alert.setContentText("Please Fill All Infos");
            		alert.setTitle("LackOfInfosError");
            		/*alert.setHeaderText("")
            		alert.setGraphic();*/
            		alert.show();
        		} else {
        			x=userfield.getText()+"/"+userfield2.getText()+"/"+userfield3.getText()+"/"+userfield4.getText();
            		scene1.setRoot(root2);
            		archiveTraveler(vv);
        		}
        		
        	
        	
        	}
        	
        	
        });
        //
        Train tt = new Train(userfiel.getText(), userfiel1.getText(), userfiel2.getText());
        botona.setOnAction(new EventHandler<ActionEvent>(){
        	
        	@Override
        	public void handle(ActionEvent event) {
        		if(userfiel.getText() == "" || userfiel1.getText() == "" || userfiel2.getText() == "") {
        			Alert alert=new Alert(AlertType.ERROR);
            		alert.setContentText("Please Fill All Infos");
            		alert.setTitle("LackOfInfosError");
            		/*alert.setHeaderText("")
            		alert.setGraphic();*/
            		alert.show();
        	}
        		else {
        			String s=userfiel.getText()+"/"+userfiel1.getText();
        			int j=0;
        			for(int i=0;i<Dispo.size();i++) {
        				if(Dispo.get(i).equals(s)) {
        					j++;
        					break;
        				}
        			}
        			if(j==1) {
        				x+="/"+userfiel.getText()+"/"+userfiel1.getText()+"/"+userfiel2.getText()+"/"+RandomStringUtils.randomAlphanumeric(10);
            			scene1.setRoot(root); 
            			archiveDestination(tt);
        			}
        			else {
        				Alert alert=new Alert(AlertType.ERROR);
                		alert.setContentText("Please Fill All Infos");
                		alert.setTitle("LackOfInfosError");
                		/*alert.setHeaderText("")
                		alert.setGraphic();*/
                		alert.show();
        			}
        			
        			
        		}
        		
        		
        }});
        
        boutonreculepremier.setOnAction(new EventHandler<ActionEvent>(){
        	
        	@Override
        	public void handle(ActionEvent event) {
        		x="";
        		scene1.setRoot(root1); }
       
        });

        boutonreculelast.setOnAction(new EventHandler<ActionEvent>(){
        	
        	@Override
        	public void handle(ActionEvent event) {
        		x=userfield.getText()+"/"+userfield2.getText()+"/"+userfield3.getText()+"/"+userfield4.getText();
        		scene1.setRoot(root2); }
       
        });
        
        button.setOnAction(new EventHandler<ActionEvent>() {
        	
        	@Override
        	public void handle(ActionEvent event) {
        		scene1.setRoot(root3);
        		String mot = "";
        		ArrayList<Label> listT = new ArrayList<Label>();
        		listT.add(t1);
        		listT.add(t2);
        		listT.add(t3);
        		listT.add(t4);
        		listT.add(t5);
        		listT.add(t6);
        		listT.add(t7);
        		for (int i = 0; i < listT.size(); i++) {
        		for (int k = 0; k <= x.length(); k++) {
        			if (!String.valueOf(x.charAt(k)).equals("/")) {
        				mot += String.valueOf(x.charAt(k));
        			}
        			else {
        				listT.get(i).setText(listT.get(i).getText() + mot);
        				x = x.replace(mot + "/", "");
        				mot = "";
        				break;
        			}
        		}
        		}
        		/*Ticket t = new Ticket();
        		t.saveTicketCode(tt);*/
        		t8.setText(t8.getText() + RandomStringUtils.randomAlphanumeric(10));        	}
        });
        
        fenetre.setTitle("MyTrainTicket");
        fenetre.setScene(scene1);
        fenetre.show();
    }
}