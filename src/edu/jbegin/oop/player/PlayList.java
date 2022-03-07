package edu.jbegin.oop.player;

import java.util.ArrayList;

public interface PlayList {

	ArrayList<Song> getSongList();

	void playAllSongs();

	void addSong(Song song);

}
