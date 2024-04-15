
public class WalletMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q","B10","P","N","N","D","Q"};
   static Wallet myWallet = new Wallet(); //it is a linked list
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            myWallet.addToWallet(new Bill(billValue));
         }   
         else
            if (dataItem == 'Q')
               myWallet.addToWallet(new Quarter());
            else
            if (dataItem == 'D')
               myWallet.addToWallet(new Dime());
            else
            if (dataItem == 'N')
               myWallet.addToWallet(new Nickel());
            else
            if (dataItem == 'P')
               myWallet.addToWallet(new Penny());
         }
      
	  myWallet.print(); //need to make a print method
	  System.out.println("Regular Sum) My wallet contains: $"); //need getValue method as well
	  System.out.println(myWallet.getValue());
	  System.out.println("Resurive Sum) my wallet contains: $: ");
	  myWallet.getValue_Rec();
	  System.out.println("Quarter Sum) My wallet contains: $");
	  myWallet.getQuarter_Rec();
	  
   }
   
  }

