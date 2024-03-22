
public class MoneyMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q","D","N","P"};//B is for bills and Q for quarters
   static Money[] wallet = new Money[dataSource.length];
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            wallet[i]= new Bill(billValue);
         }   
         else
            if (dataItem == 'Q')
               wallet[i]=new Quarter();
	         if (dataItem == 'D')
	             wallet[i]=new Dime();
	         if (dataItem == 'N')
	             wallet[i]=new Nickel();
	         if (dataItem == 'P')
	             wallet[i]=new Penny();
         }
      
      printWallet();
      sumWallet();
   }
   private static void sumWallet() {
	int sum_bill =0; 
	int sum_cent =0;
	for(int i=0; i<wallet.length; i++) {
		if(wallet[i] instanceof Bill) {
			sum_bill += ((Bill)wallet[i]).getValue();
		}else {
			sum_cent += ((Coin)wallet[i]).getValue();
		}
	}
	sum_bill = sum_bill +sum_cent/100; 
	sum_cent = sum_cent%100;
	System.out.println("Total in wallet: $ "+sum_bill+"."+sum_cent);
	
}
public static void printWallet () {
      for (int i=0;i<wallet.length;i++) {
//         if (wallet[i] instanceof Bill)
//            System.out.println("$ "+((Bill)wallet[i]).getValue()+".00");
//         else
            System.out.println(wallet[i]);
         
      }
   }
}
