import java.util.ArrayList;


public class MusicPlayer {
    public static void main(String[] args){
      MusicPlayer play = new MusicPlayer();
       play.createLibrary();
       play.allArtists();

    }

   public void allArtists() {
      Artist sevyn = new Artist("Sevyn Streeter", "USA", "RnB/Pop", "21st Century");
      sevyn.show();

      Artist her = new Artist("H.E.R.", "USA", "RnB", "21st Century");
      her.show();

      TrumpetPlayer velvet = new TrumpetPlayer("Velvet Brown", "USA", "Classical", "21st Century", "Tuba");
      velvet.show();

      Vocalist jhene = new Vocalist("Jhene Aiko", "Germany/USA", "RnB", "21st Century", "John Mayer");
      jhene.show();

      Guitarist carlos = new Guitarist("Carlos Santana", "Mexico/USA", "Latin Rock", "21st Century", 6);
      carlos.show();
   }
   public void createLibrary(){
      ArrayList<Song> library = new ArrayList<>();
      Song smooth = new Song("Smooth", "The Smooth Hits", "https://youtu.be/6Whgn_iE5uc", "Rob Thomas","none" ,"Carlos Santana");
      Song bs = new Song("BS", "The Smooth Hits"," https://www.youtube.com/watch?v=tXZ_B8Amy00", "Jhene Aiko/H.E.R", "none","none");
      Song damage = new Song("Damage", "The Smooth Hits", "https://youtu.be/PAFAfhod9TU","H.E.R.", "none", "none");
      Song queen = new Song("Queen of the Night Aria", "The Smooth Hits", "https://youtu.be/_wWKyOnJfyk", "Velvet Brown","Velvet Brown", "none");
      Song kisses = new Song("Kissez", "The Smooth Hits", "https://www.youtube.com/watch?v=nNpASlGAgcI", "Sevyn Streeter", "none", "none");

      library.add(smooth);
      library.add(bs);
      library.add(damage);
      library.add(queen);
      library.add(kisses);

      for (Song song : library) {
         System.out.println(" \n\t*******Music Library****** \n" +
                 "  Song Title       | " + song.title + "\n" +
                 "  Playlist Name    | " + song.playlist + "\n" +
                 "  Website          | " + song.url + "\n" +
                 "  Musician Name    | " + song.musician +"\n" +
                 "  Trumpet Player   | " + song.trumpeter + "\n" +
                 "  Guitarist        | " + song.guitarist);
      }
   }
}
