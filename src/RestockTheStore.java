import java.util.Scanner;
public class RestockTheStore {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("Welcome to the restocking tool.");
    	
		 int stoValSoda=100,stoValChips=40,stoValCandy=60,reStoValSoda=40,reStoValChips=20,reStoValCandy=40;
		 int xSoda,xChips,xCandy;
		 System.out.println("How many soda have been sold today? 100 are in stock.");
		 xSoda = myObj.nextInt();
         if(xSoda>stoValSoda) {
			 System.out.println("That value is too high. Stock not adjusted");
		 }else{
			 System.out.println("There are "+(stoValSoda-xSoda)+" Sodas left.");
		 }
         System.out.println("How many chips have been sold today? 40 are in stock.");
         xChips = myObj.nextInt();
         if(xChips>stoValChips) {
			 System.out.println("That value is too high. Stock not adjusted");
		 }else{
			 System.out.println("There are "+(stoValChips-xChips)+" chips left.");
		 }
         System.out.println("How many candy have been sold today? 60 are in stock.");
         xCandy = myObj.nextInt();
         if( xCandy>stoValCandy) {
			 System.out.println("That value is too high. Stock not adjusted");
		 }else{
			 System.out.println("There are "+(stoValCandy- xCandy)+" candy left.");
		 }
         System.out.println("Thank you for filling out the values. Here is what needs to be restocked.");
         if((stoValSoda-xSoda)<=reStoValSoda&&stoValSoda>xSoda) {
        	 System.out.println("Soda needs to be restocked."); 
         }
         if((stoValChips-xChips)<=reStoValChips&&stoValChips>xChips) {
        	 System.out.println("Chips needs to be restocked."); 
         }
         if((stoValCandy- xCandy)<=reStoValCandy&&stoValCandy>xCandy) {
        	 System.out.println("Candy needs to be restocked."); 
         }
		
	}

}
