package model;

public class Produkty {
	
	public Produkty(String nazwa, int quantity, int id) {
		
		this.setNazwa(nazwa);
		this.setQuantity(quantity);
		this.setId(id);
		
	}
	
	private String nazwa;
	private int quantity;
	private int id; 
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
