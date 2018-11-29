//**** Important Note **********
// using list instead of linked list

package udemy10_LinkedList_Playlist;

import java.util.*;

public class Main_List {

	public static void main(String[] args) {
		
		List<Album> album = new ArrayList<Album>();
		List<String> playlist = new ArrayList<String>();
		
		//album 0
		album.add(new Album("Mersal",new Song("Aalaporaan Thamizhan",5.48)));
		album.get(0).addsongs("Mersal Arasan", 4.50);
		album.get(0).addsongs("Maacho", 4.00);
		//album.get(0).printsongs();

		//album 1
		album.add(new Album("Vivegam",new Song("Suraiva",5.11)));
		album.get(1).addsongs("Suraiva Title", 4.00);
		//album.get(1).printsongs();
		
		//album 2
		album.add(new Album("Vikram Vedha",new Song("Yaanji",5.5)));
		//album.get(1).printsongs();
		
		String songname = album.get(0).getsong(0).getTitle();
		
		addsong(playlist,songname);
		
		addsong(playlist,"test");
		addsong(playlist,"test");
		
		playlist.add(album.get(1).getsong(1).getTitle());
		playlist.add(album.get(0).getsong(2).getTitle());
		playlist.add(album.get(2).getsong(0).getTitle());
	
		playPlaylist(playlist);
		
	}
	
	public static void addsong(List<String> playlist, String song) {
		
		ListIterator<String> i = playlist.listIterator();
		
		while (i.hasNext()) {
			if (i.next()==song) {
				System.out.println("Song already in playlist !");
				return;
			}
		}
		playlist.add(song);
	}
	
	public static void playPlaylist(List<String> playlist) {

		ListIterator<String> i = playlist.listIterator();
		Scanner scan = new Scanner(System.in);

		System.out.println("1. Next Song");
		System.out.println("2. Previous Song");
		System.out.println("3. Play Again");
		System.out.println("4. Remove Song");
		System.out.println("5. End Playlist");
		
		int option = 1;
		String currentSong;
		boolean forward = true;
		boolean reverse = false;
		
		if (i.hasNext()) {
			System.out.println("Song :" +i.next());
		}else {
			System.out.println("No songs in playlist !");
			return;
		}
		
		while (option>=1 && option <=4 && (i.hasNext()||i.hasPrevious())) {
			
			System.out.println("Enter option :");
			option = scan.nextInt();
			
			switch (option) {
			
			case 1:
				if (!forward) {
					if (i.hasNext()) {
						i.next();
					}else {
						System.out.println("End of playlist");
						option = 5;
					}
				}
					if (i.hasNext()) {
						System.out.println("Song :" +i.next());
						forward = true;
						reverse = false;
						}else {
							System.out.println("End of playlist");
							option = 5;
							}						
				break;
			
			case 2:
				if (!reverse) {
					if (i.hasPrevious()) {
						i.previous();
					}else {
						System.out.println("Reached playlist beginning");
					}
				}
				if (i.hasPrevious()) {
					System.out.println("Song :" +i.previous());
					reverse = true;
					forward = false;
					}else {
							System.out.println("Reached playlist beginning");
					}
				break;
				
			case 3:
				if (forward && i.hasPrevious()) {
						System.out.println("Song :" +i.previous());
						forward = false;
						reverse = true;
					}else  if (i.hasNext()){
						System.out.println("Song :" +i.next());
						forward = true;
						reverse = false;
					}
				break;
			
			case 4:
				i.remove();
				System.out.println("Song removed");
				break;
		
			}
			
		}
		
		printplaylist(playlist);
		System.out.println("**End**");
		option =6;
		
	}
	
	public static void printplaylist(List<String> playlist) {
		
		ListIterator<String> i = playlist.listIterator();
		System.out.println("Playlist printing");
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}


























