package CookBook.media;

/**
 *
 * @author Roberto Garrido Trillo
 */
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class E19_MediaTracking extends Application
{

   public static void main(String[] args)
   {
      Application.launch(args);
   }


   @Override
   public void start(Stage stage)
   {
// Locate the media content in the CLASSPATH
      URL mediaUrl = getClass().getResource("/main/media/test02_1280x720.mp4");
      String mediaStringUrl = mediaUrl.toExternalForm();
      
// Create a Media
      final Media media = new Media(mediaStringUrl);
// Create a Media Player
      final MediaPlayer player = new MediaPlayer(media);
      
// Automatically begin the playback
      player.setAutoPlay(false);
      
// Set the Times of the Player
      player.setStartTime(Duration.seconds(00));
      player.setStopTime(Duration.seconds(25));
      
// Create a 400X300 MediaView
      final MediaView mediaView = new MediaView(player);
      mediaView.setFitWidth(400);
      mediaView.setFitHeight(300);
      mediaView.setSmooth(true);
      
// Create the DropShadow effect
      DropShadow dropshadow = new DropShadow();
      dropshadow.setOffsetY(5.0);
      dropshadow.setOffsetX(5.0);
      dropshadow.setColor(Color.WHITE);
      mediaView.setEffect(dropshadow);
      
// Create the Buttons
      Button playButton = new Button("Play");
      Button stopButton = new Button("Stop");
      
// Create the Event Handlers for the Button
      playButton.setOnAction(new EventHandler<ActionEvent>()
      {
         public void handle(ActionEvent event)
         {
            if (player.getStatus() == Status.PLAYING) {
               player.stop();
               player.play();
            } else {
               player.play();
            }
         }


      });
      
      stopButton.setOnAction(new EventHandler<ActionEvent>()
      {
         public void handle(ActionEvent event)
         {
            player.stop();
         }


      });
      
// Create the HBox
      HBox controlBox = new HBox(5, playButton, stopButton);
// Create the VBox
      VBox root = new VBox(5, mediaView, controlBox);
// Set the Style-properties of the HBox
      root.setStyle("-fx-padding: 10;"
              + "-fx-border-style: solid inside;"
              + "-fx-border-width: 2;"
              + "-fx-border-insets: 5;"
              + "-fx-border-radius: 5;"
              + "-fx-border-color: blue;");
// Create the Scene
      Scene scene = new Scene(root);
// Add the scene to the Stage
      stage.setScene(scene);
// Set the title of the Stage
      stage.setTitle("A Tracking Media Example");
// Display the Stage
      stage.show();
   }


}

