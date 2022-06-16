package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.io.IOException;


public class Bienvenue extends Application {
    public void start(Stage fenetre) throws IOException{
        GridPane root = new GridPane();
        root.setHgap(8);
        root.setVgap(8);
        root.setAlignment(Pos.CENTER);
        Scene scene1 = new Scene(root,660,400, Color.ALICEBLUE);
        Image icon = new Image("C:\\Users\\HP\\Downloads\\train.png");
        fenetre.getIcons().add(icon);
        Text texte = new Text("Bienvenue dans notre plateforme");
        texte.setFont(Font.font("Nunito ExtraLight",15));
        Text texte1 = new Text("Veuillez entrer vos informations pour réserver votre ticket ^^");
        texte1.setFont(Font.font("Nunito ExtraLight",15));
        Label lb = new Label("Nom");
        Label lb1 = new Label("Prénom");
        Label lb2 = new Label("CIN");
        Label lb3 = new Label("Adresse Mail");
        Label lb4 = new Label("N° de Tel");
        TextField userfield = new TextField();
        TextField userfield1 = new TextField();
        TextField userfield2 = new TextField();
        TextField userfield3 = new TextField();
        TextField userfield4 = new TextField();
        root.add(texte,1,0,2,1);
        root.add(texte1,0,1,3,1);
        root.add(lb, 0,3);
        root.add(lb1, 0,4);
        root.add(lb2, 0,5);
        root.add(lb3, 0,6);
        root.add(lb4, 0,7);
        root.add(userfield, 1,3);
        root.add(userfield1, 1,4);
        root.add(userfield2, 1,5);
        root.add(userfield3, 1,6);
        root.add(userfield4, 1,7);
        Button bouton = new Button("Valider");
        root.add(bouton,3,8);

        fenetre.setTitle("MyTrainTicket");
        fenetre.setScene(scene1);
        fenetre.show();
    }
}