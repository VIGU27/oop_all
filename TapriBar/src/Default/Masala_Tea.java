package Default;

public class Masala_Tea extends Tea{
	private String ingredients;
	
	public Masala_Tea() {
		System.out.println("\n\n---* masala tea has been served *---");
	}
	
	public Masala_Tea(String ing) {
		ingredients=ing;
	}
	public String getingredients() {
		return ingredients;
	}
	public void setingredients(String ingredients) {
		this.ingredients = ingredients;
	}

}
