package edu.jbegin.oop.player;

public class Main {

	

	public static void main(String[] args) {
	   
        Author author1 = new Author("Пикник");
        Author author2 = new Author("Вивальди");
        Author author3 = new Author("Abba");
        Author author4 = new Author("Vanessa Mae");
        Author author5 = new Author("Queen");

      
        MySong song1 = new MySong("Вертолёт", author1);
        MySong song2 = new MySong("Времена года", author2);
        MySong song3 = new MySong("Happy New Year", author3);
        MySong song4 = new MySong("Lay All Your Love On Me", author3);
        MySong song5 = new MySong("Toccata and Fugue in D minor", author4);
        MySong song6 = new MySong("Show must go on", author5);
        MySong song7 = new MySong("We will rock you", author5);


       
        MyPlayList playlist = new MyPlayList();
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);
        playlist.addSong(song6);
        playlist.addSong(song7);

        
        playlist.playAllSongs();

	}

}
