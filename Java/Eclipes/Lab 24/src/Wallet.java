
public class Wallet {
  private MoneyList walletContents;
  
  public Wallet(){
	  walletContents = new MoneyList();
  }
  public void addToWallet(Money m){
	  walletContents.append(m);
  }
  public void print () {
	  System.out.println("Regular Print:" );
	  System.out.println(walletContents.toString());
	  System.out.println("Resurive Print first to last: ");
	  walletContents.print_Rec();
	  System.out.println("Resurive Print last to first: ");
	  walletContents.print_Rev_Rec();
		  
		  
  }
  	public String getValue() {
	  String sum = walletContents.sum();	  
	  return sum;
	  
  	}
  public void getValue_Rec() {
	  walletContents.sum_Rec();
  }
  
  public void getQuartar_Rec() {
	  walletContents.sumQuartar_Rec();
  }
}
