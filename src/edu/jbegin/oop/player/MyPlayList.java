package edu.jbegin.oop.player;

import java.util.ArrayList;

public class MyPlayList extends MySong implements PlayList {

	private ArrayList<Song> songList = new ArrayList<>();

	@Override
	public ArrayList<Song> getSongList() {
		return songList;
	}

	@Override
	public void addSong(Song song) {
		songList.add(song);
	}

	@Override
	public void playAllSongs() {
		for (Song song : songList) {
			song.play();
		}

	}

}
