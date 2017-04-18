import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Javadownloadresponse1 
 {
	public static void main(String[] args) throws IOException 
		{
		 
		 String fileName = "C:\\Users\\lenovo\\Desktop\\response.txt"; 
		 
		 URL link = new URL("http://www.google.com"); 
		
     
		 InputStream input = new BufferedInputStream(link.openStream());
	
		 ByteArrayOutputStream out = new ByteArrayOutputStream();
		 int n;
		 while (-1!=(n=input.read()))
		 {
			out.write(n);
	     }
		 
		 byte[] response = out.toByteArray();
		 FileOutputStream fos = new FileOutputStream(fileName);
	     fos.write(response);
	     System.out.println("Download completed");

		}

  }
