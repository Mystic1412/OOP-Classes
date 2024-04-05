
public class Wallet {
  private MoneyList walletContents;
  
  public Wallet(){
	  walletContents = new MoneyList();
  }
  public void addToWallet(Money m){
	  walletContents.append(m);
  }
  public void print () {
		  System.out.println(walletContents.toString());
  }
  public String getValue() {
	  String sum = walletContents.sum();	  
	  return sum;
	  
  }
}
