
import java.io.*;
import java.util.Date;

public class SaveMoney {

  public static void main(String argv[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("money.out"); //creates a "money.out" file
    ObjectOutputStream oos = new ObjectOutputStream(fos); 
    //Quarter
    for (int i=0; i<5; i++) {
    	Quarter q = new Quarter();
    	oos.writeObject(q);
    }
    
    for (int i=0; i<5; i++) {
    	Dime d = new Dime();
    	oos.writeObject(d);
    }
    
    for (int i=0; i<5; i++) {
    	Nickel n = new Nickel();
    	oos.writeObject(n);
    }
    
    for (int i=0; i<5; i++) {
    	Penny p = new Penny();
    	oos.writeObject(p);
    }
    
    Date date = new Date();
    oos.writeObject(date);
    oos.flush(); //put everything into the stream?
    oos.close(); 
    fos.close();
  }
}