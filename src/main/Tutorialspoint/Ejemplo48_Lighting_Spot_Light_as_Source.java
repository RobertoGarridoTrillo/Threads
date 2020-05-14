package main.Tutorialspoint;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene;  
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 

/**
 * On applying this effect to a node, a light is simulated on it, as if it is
 * being generated by a spot light.
 *
 * Spot Light Source − The light from this source attenuates in all directions.
 * The intensity of the light depends on the distance of the object from the
 * source. Spot Light Source
 *
 * The class named Light.Spot of the package javafx.scene.effect represents the
 * distant light source. This class contains four properties, which are −
 *
 * pointsAtX − This property is of the type double and it represents the x
 * coordinate of the direction of vector for this light.
 *
 * pointsAtY − This property is of the type double and it represents the y
 * coordinate of the direction of vector for this light.
 *
 * pointsAtZ − This property is of the type double and it represents the z
 * coordinate of the direction of vector for this light.
 *
 * specularExponent − This property is of the type double and it represents the
 * specular exponent, which controls the focus of this light source.
 *
 * @author Roberto Garrido Trillo
 */
         
public class Ejemplo48_Lighting_Spot_Light_as_Source extends Application { 
   @Override 
   public void start(Stage stage) { 
      //Creating a Text object 
      Text text = new Text();       
      
      //Setting font to the text 
      text.setFont(Font.font(null, FontWeight.BOLD, 40));       
      
      //setting the position of the text 
      text.setX(60); 
      text.setY(50); 
      
      //Setting the text to be embedded. 
      text.setText("Welcome to Tutorialspoint");       
      
      //Setting the color of the text 
      text.setFill(Color.RED);   
       
      //Drawing a Circle 
      Circle circle = new Circle();         
      
      //Setting the centre of the circle 
      circle.setCenterX(300.0f); 
      circle.setCenterY(160.0f); 
      
      //Setting the radius of the circle 
      circle.setRadius(100.0f); 
      
      //setting the fill color of the circle  
      circle.setFill(Color.CORNFLOWERBLUE);
      
      //Instantiating the Light.Spot class 
      Light.Spot light = new Light.Spot(); 
      
      //Setting the color of the light 
      light.setColor(Color.GRAY); 
      
      //setting the position of the light 
      light.setX(70); 
      light.setY(55); 
      light.setZ(45); 
       
      //Instantiating the Lighting class  
      Lighting lighting = new Lighting(); 
      
      //Setting the light source 
      lighting.setLight(light);  
      
      //Applying lighting effect to the text 
      text.setEffect(lighting);      
      
      //Applying lighting effect to the circle 
      circle.setEffect(lighting); 
         
      //Creating a Group object  
      Group root = new Group(text,circle);   
               
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Ejemplo48_Lighting_Spot_ Light_as_Source"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();          
   }
   public static void main(String args[]){ 
      launch(args); 
   } 
}   
