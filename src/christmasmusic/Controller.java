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

    //All of the song buttons + Play/Pause Button
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
    private Label songLabel;

    private File directory;
    private File[] files;
    private ArrayList<File> songs;
    private boolean running; 
    private Media media;
    private MediaPlayer mediaPlayer;
    private int songNumber;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

    }
    @FXML
    void playSong(ActionEvent event) {
        mediaPlayer.play();
    }
    @FXML
    void pauseSong(ActionEvent event) {
        mediaPlayer.pause(); 
    }

    @FXML
    void onplaySong1(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music1"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        //Code for music 2 - 13 does not work at this line for each folder
        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong2(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music2"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong3(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music3"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong4(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music4"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong5(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music5"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong6(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music6"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong7(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music7"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong8(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music8"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong9(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music9"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong10(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music10"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong11(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music11"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong12(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music12"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong13(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music13"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
    @FXML
    void onplaySong14(ActionEvent event) {
        songs = new ArrayList<File>();
        directory = new File("music14"); 
        files = directory.listFiles();

        if(files != null) {
            for(File file : files) {
                songs.add(file); 
            }
        }

        media = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songLabel.setText(songs.get(songNumber).getName());

        mediaPlayer.play();
    }
}