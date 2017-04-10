import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class javagoogle {
    public static void main(String[] args) throws IOException, URISyntaxException {
  
    String url = "https://www.google.com";
 
     Desktop desktop = Desktop.getDesktop();
     desktop.browse(new URI(url));
 
    }
}