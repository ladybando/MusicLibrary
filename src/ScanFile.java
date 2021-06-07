import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {

    public static void main(String[] args) throws FileNotFoundException {
        ScanFile scan = new ScanFile();
        scan.scanArtist();
    }

    public String[] scanArtist() throws FileNotFoundException {
        File file = new File("../NewArtist.txt");
        String artist = "";
        String[] singer = new String[0];
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String string = sc.next();//sc.next() prints name, origin, genre, timeperiod, influencedby
                /*int ind = string.indexOf(":"); ind is always -1
                * String singer = string.substring(ind); //singer prints nothing because ind is always -1?
                * */
                artist += sc.nextLine();//prints rihanna, barbados, rnb/pop, 21st century, chanel
                singer = new String[]{artist};
            }
            return singer;
        }
    }
}