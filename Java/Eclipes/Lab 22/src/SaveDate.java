
import java.io.*;
import java.util.Date;

public class SaveDate {

  public static void main(String argv[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("date.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    Date date = new Date();
    oos.writeObject(date);
    oos.flush(); //put everything into the stream?string? one of the two idk what she said
    oos.close(); 
    fos.close();
  }
}