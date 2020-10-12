/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snowman;

/**
 *
 * @author Hanish
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Snowman extends Application
{
    //--------------------------------------------------------------------
    //  Presents a snowman scene.
    //--------------------------------------------------------------------
    @Override
    public void start(Stage primaryStage)
    {        
        Ellipse base = new Ellipse(80, 210, 80, 60);
        base.setFill(Color.WHITE);
        

        Ellipse middle = new Ellipse(80, 130, 50, 40);
        middle.setFill(Color.WHITE);

        Circle head = new Circle(80, 70, 30);
        head.setFill(Color.WHITE);

        Circle rightEye = new Circle(70, 60, 5);
        rightEye.setFill(Color.BLUE);
        Circle leftEye = new Circle(90, 60, 5);
        leftEye.setFill(Color.BLUE);
        //Line mouth = new Line(70, 80, 90, 80);
        
        Arc mouth = new Arc(80, 35, 50, 50, 270-20, 40);
        mouth.setFill(Color.BLACK);
        mouth.setType(ArcType.CHORD);
        
        Circle button1 = new Circle(80, 110, 6);
        button1.setFill(Color.BLACK);
        Circle button2 = new Circle(80, 140, 9);
        button2.setFill(Color.BLACK);
        Circle button3 = new Circle(80, 185, 13);
        button3.setFill(Color.BLACK);
        Circle button4 = new Circle(80, 230, 16);
        button4.setFill(Color.BLACK);
        
        Arc nose = new Arc(33, 58, 50, 50, 360-22, 10);
        nose.setFill(Color.ORANGE);
        nose.setType(ArcType.ROUND);

        Line leftArm = new Line(110, 130, 160, 100);
        leftArm.setStrokeWidth(3);
        
        Line leftHand1 = new Line(150, 105, 155, 90);
        leftHand1.setStrokeWidth(3);
        Line leftHand2 = new Line(150, 105, 163, 110);
        leftHand2.setStrokeWidth(3);
        
        Line rightArm = new Line(50, 130, 0, 100);
        rightArm.setStrokeWidth(3);
        
        Line rightHand1 = new Line(5, 90, 13, 108);
        rightHand1.setStrokeWidth(3);
        Line rightHand2 = new Line(0, 112, 13, 108);
        rightHand2.setStrokeWidth(3);

        Rectangle stovepipe = new Rectangle(60, 0, 40, 50);
        Rectangle brim = new Rectangle(50, 45, 60, 5);
        Group hat = new Group(stovepipe, brim);
        hat.setTranslateX(10);
        hat.setRotate(15);

        Group snowman = new Group(base, middle, head, leftEye, rightEye,
            mouth, button1, button2,button3,button4, leftArm, rightArm, nose,
                hat, leftHand1, leftHand2, rightHand1, rightHand2);
        snowman.setTranslateX(170);
        snowman.setTranslateY(50);


        Rectangle ground = new Rectangle(0, 250, 500, 100);
        ground.setFill(Color.STEELBLUE);

        Group root = new Group(ground, snowman);
        Scene scene = new Scene(root, 500, 350, Color.LIGHTBLUE);

        primaryStage.setTitle("Snow Man");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
