package christmasmusic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Action;

public class Controller implements Initializable {

    //All of the song buttons + Play/Pause Button + Previous Button + Next Button
    @FXML
    private Button Button0;
    @FXML
    private Button Button1;
    @FXML
    private Button Button2;
    @FXML
    private Button Button3;
    @FXML
    private Button Button4;
    @FXML
    private Button Button5;
    @FXML
    private Button Button6;
    @FXML
    private Button Button7;
    @FXML
    private Button Button8;
    @FXML
    private Button Button9;
    @FXML
    private Button Button10;
    @FXML
    private Button Button11;
    @FXML
    private Button Button12;
    @FXML
    private Button Button13;
    @FXML
    private Button playButton;
    @FXML
    private Button pauseButton;
    @FXML
    private Button previousButton;
    @FXML
    private Button nextButton;

    @FXML
    private Label songLabel;

    private File directory;
    private File[] files;
    private ArrayList<File> songs;
    private int songumber;
    private Timer timer;
    private TimerTask task;
    private boolean running; 
    private Media media;
    private MediaPlayer mediaPlayer;
    private int songNumber;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        songs = new ArrayList<File>();
        directory = new File("music"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());
    }

    public void playSong() {
        mediaPlayer.play();
    }
    public void pauseSong() {

    }
    public void nextSong() {

    }
    public void previousSong() {

    }
}