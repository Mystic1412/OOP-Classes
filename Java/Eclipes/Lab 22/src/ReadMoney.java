
import java.io.*;
import java.util.Date;

public class ReadMoney {

  public static void main(String argv[]) throws Exception {
    FileInputStream fis = new FileInputStream("money.out");
    ObjectInputStream ois = new ObjectInputStream(fis);
    for(int i=0; i<20; i++) {
    	Object obj = ois.readObject();
    	if(obj instanceof Quarter) {
    		Quarter q = (Quarter)obj;
    		System.out.println("The Quarter is: "+ q);
    	}
    	if(obj instanceof Dime) {
    		Dime d = (Dime)obj;
    		System.out.println("The Dime is: "+ d);
    	}
    	if(obj instanceof Nickel) {
    		Nickel n = (Nickel)obj;
    		System.out.println("The Nickel is: "+ n);
    	}
    	if(obj instanceof Penny) {
    		Penny p = (Penny)obj;
    		System.out.println("The Penny is: "+ p);
    	}
    }
    Date date = (Date) ois.readObject();
    System.out.println("The date is: "+date);
    ois.close(); //close object stream
    fis.close(); //close file stream
  }
}