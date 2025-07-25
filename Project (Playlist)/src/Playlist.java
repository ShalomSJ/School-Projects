import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Playlist {

    public static <Track> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playlistName , SongName , ArtistName , Duration ;
        LinkedList Tracks;
        boolean FirstTrack = true;

        System.out.println("Create your own playlist");
        System.out.println("Enter your playlist name");
        playlistName=input.nextLine();
        Tracks = new LinkedList<>();

        while (FirstTrack){
            System.out.println("\n Enter 1) To add songs to playlist: "+playlistName+"\n"+
                    "Enter 2) To remove songs from playlist: "+playlistName+"\n"+
                    "Enter 3) To show songs in the playlist: "+playlistName+"\n"+
                    "Enter 4) To play the playlist: "+playlistName+"\n");

            int FirstChoice = input.nextInt();
            switch(FirstChoice){
                case 1:
                    System.out.println("What is the name of the song:");
                    input.nextLine();
                    SongName = input.nextLine();

                    System.out.println("What is the name of the artist:");
                    ArtistName = input.nextLine();

                    System.out.println("What is the duration of the song:");
                    Duration = input.nextLine();

                    Track t = new Track(SongName,ArtistName,Duration);
                    Tracks.add(t);

                    System.out.println(SongName+ "Your song has been added to the playlist"+playlistName+"!\n");
                    break;
                case 2:
                    if(Tracks.size()==0){
                        System.out.println("There are no songs in the playlist"+playlistName);
                        break;
                    }else{
                        System.out.println("This are tracks");

                        for(Object i: Tracks) {
                            i.showTrack();

                            System.out.println("What is the index of the song you want to remove,the first song is at index 1");
                            int index = input.nextInt();

                            if (index <= 0 || index < Track.size()) {
                                System.out.println("No song has been added on that index");
                            } else {
                                Track.remove(index - 1);
                                System.out.println("The song has been removed!");
                            }
                            break;
                        }
                    }
                case 3:
                    if (Track.size() == 0) {
                        System.out.println("There are no tracks in your playlist");
                        break;
                    }else{
                        System.out.println("These are the list of songs on your playlist");
                        LinkedList<Object> track = new LinkedList<>();
                        for(Object i:track) {
                            i.showTrack();

                            System.out.println("The current song playing is");
                            Track.getFirst().showTrack();

                            String x = track.listIterator().toString();
                            x.length(); //first song is currently playing
                            boolean forward = true; //keeps a track as the user is going forward or backward the linked list
                            boolean finished = false; //checks whether the user reached the end of the linked list or did not

                            boolean second = true;
                            while (second) {
                                System.out.println("\n Enter 1) To play the next song\n" + "Enter 2) To play the previous song\n" + "Enter 3) To play the same song again\n" + "Enter 4) To stop the playlist");
                            }

                            }
                        }
                    }
            }
        }
    }
    class repeat{
        boolean forward;

         private repeat{
            ListIterator<Object> listIterator;
            if(listIterator.hasPrevious()){
                System.out.println("Now replaying" + listIterator.previous().toString());
                forward = false;
            }else{
                System.out.println("We are at the end of the list");
            }else{
                 listIterator.hasNext();
                 {
                     System.out.println("Now replaying" + listIterator.next().toString());
                     forward = true;
                 }else{
                     System.out.println("We have reached the end of the list");
                 }
            }
    }
}


