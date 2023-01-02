package Default;

public class Client_Interface {

	public static void main(String[] args) {
		Shop s1=new Shop(); // shop info
		
		Shop s2=new Shop("Goa");
		System.out.println("our location is - " + s2.getLocation());  // shop location
		
		Masala_Tea mt1= new Masala_Tea("Ilaichi, Ginger, sugar, lemon grass");
		System.out.println("Special ingregients of Masala tea - " + mt1.getingredients());  // ingredients
		
		Beverage b1=new Masala_Tea(); //inheritance all
		
		
		
	}

}
