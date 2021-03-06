package main.javatpoint;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * MPEG-4
 *
 * @author Roberto Garrido Trillo
 */
public class Ejemplo77_Media_Video extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    // TODO Auto-generated method stub  
    //Initialising path of the media file, replace this with your file path   
    String path = "src/main/video/test_360x288.flv";

    //Instantiating Media class  
    Media media = new Media(new File(path).toURI().toString());

    //Instantiating MediaPlayer class   
    MediaPlayer mediaPlayer = new MediaPlayer(media);

    //Instantiating MediaView class   
    MediaView mediaView = new MediaView(mediaPlayer);

    //by setting this property to true, the Video will be played   
    mediaPlayer.setAutoPlay(true);

    //setting group and scene   
    Group root = new Group();
    root.getChildren().add(mediaView);
    Scene scene = new Scene(root, 1860, 1000);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Playing video");
    primaryStage.show();
  }


  public static void main(String[] args)
  {
    launch(args);
  }


}

