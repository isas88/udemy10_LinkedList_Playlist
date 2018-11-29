package udemy10_LinkedList_Playlist;

public class Song {

	private String title;
	private double duration;
	
	public Song(String title,double duration) {
	this.title= title;
	this.duration = duration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public Song addsong(String title, double duration) {
		return new Song(title,duration);
	}
}
