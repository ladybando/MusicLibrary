import java.io.BufferedReader;

public class DisplayFile {

    public static void main(String[] val) {
        String line;
        java.io.BufferedReader br;

        try {
            br = new BufferedReader(new java.io.FileReader("../NewArtist.txt"));

            while ((line = br.readLine()) != null) {
                String[] data = line.split(":");

                System.out.println(data[0]);
            }

        } catch (Exception e) {    // We’ll cover exceptions soon
            System.out.println(e);  // Quick & dirty error handling
        }

    }

}
