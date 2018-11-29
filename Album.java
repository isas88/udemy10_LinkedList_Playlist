package udemy10_LinkedList_Playlist;

import java.util.*;

public class Album {

	private String albumname;
	private LinkedList<Song> song1 = new LinkedList<Song>();
	
	public Album(String name, Song song) {
		this.albumname = name;
		this.song1.add(song);
	}

	public void addsongs(String title, double duration) {
		
		Song songobject = new Song(title,duration); 
		song1.add(songobject);
	}

	public Song getsong(int idx) {
		return song1.get(idx);
	}
	
	public void printsongs() {
		ListIterator<Song> i = this.song1.listIterator();
		
		while (i.hasNext()) {
			
			System.out.println("Song Title: " +i.next().getTitle() +",   Duration:  "+i.previous().getDuration());
			i.next();
			//System.out.println("Song Title: " +i.next().getTitle() );
		}
		
	}
		
	public String getAlbumname() {
		return albumname;
	}

	public void setAlbumname(String albumname) {
		this.albumname = albumname;
	}

	public LinkedList<Song> getSong1() {
		return song1;
	}

	public void setSong1(LinkedList<Song> song1) {
		this.song1 = song1;
	}


	
}
