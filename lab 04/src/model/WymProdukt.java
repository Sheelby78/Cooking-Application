package model;

public class WymProdukt {
	public WymProdukt(String nazwa, int quantity, int id) {
		this.nazwa = nazwa;
		this.quantity = quantity;
		this.id = id;
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
