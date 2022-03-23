package model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import utils.CsvReader;

public class Dane {
	public Dane() {
		readProdukty();
		readPrzepisy();
		readWymProdukty();
		createProdukty();
		createPrzepisy();
		createWymProdukty();
	}
	
	public void readProdukty() {
		String fileName = "src\\Produkty.csv";
        Reader reader = null;
        try {
            reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CsvReader csvReader = new CsvReader(reader);
        prod = csvReader.readRecords();
	}

	public void readPrzepisy() {
		String fileName = "src\\Przepisy.csv";
		Reader reader = null;
		try {
			reader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		CsvReader csvReader = new CsvReader(reader);
		przep = csvReader.readRecords();
	}

	public void readWymProdukty() {
		String fileName = "src\\WymProdukty.csv";
		Reader reader = null;
		try {
			reader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		CsvReader csvReader = new CsvReader(reader);
		wymprod = csvReader.readRecords();
	}
	
	public void createProdukty() {
		produkty.clear();
		for (int i = 0; i < prod.size(); ++i) {
            String nazwa = prod.get(i).get(0);
            int quantity = Integer.parseInt(prod.get(i).get(1));
            int id = Integer.parseInt(prod.get(i).get(2));
			if(id == 0){
				continue;
			}
            produkty.add(new Produkty(nazwa,quantity,id));
        }
	}

	public void createPrzepisy() {
		przepisy.clear();
		List<WymProdukt> wymProdukt = new ArrayList<>();
		for (int i = 0; i < przep.size(); ++i) {
			int id = Integer.parseInt(przep.get(i).get(0));
			String nazwa = przep.get(i).get(1);
			String opis = przep.get(i).get(2);
			if(id == 0){
				continue;
			}
			przepisy.add(new Przepis(id,nazwa,opis,wymProdukt));
		}
	}

	public void createWymProdukty(){
		for(int i=0; i<(wymprod.size());i++){
			for(int j=0; j<(wymprod.get(i).size());j+=3){
				String nazwa = wymprod.get(i).get(j);
				int quantity = Integer.parseInt(wymprod.get(i).get(j+1));
				int id = Integer.parseInt(wymprod.get(i).get(j+2));
				przepisy.get(i).getWymProdukt().add(new WymProdukt(nazwa, quantity, id));
			}
		}
	}
	
	public List<List<String>> prod;
	public List<List<String>> przep;
	public List<List<String>> wymprod;
	
	public List<Produkty> produkty = new ArrayList<>();
	public List<Przepis> przepisy = new ArrayList<>();
	public List<PrzepisWym> wymag = new ArrayList<>();

	public List<PrzepisWym> getWymag() {
		return wymag;
	}

	public void setWymag(List<PrzepisWym> wymag) {
		this.wymag = wymag;
	}


	public List<Przepis> getPrzepisy() { return przepisy; }

	public void setPrzepisy(List<Przepis> przepisy) { this.przepisy = przepisy; }

	public List<Produkty> getProdukty() {
		return produkty;
	}

	public void setProdukty(List<Produkty> produkty) {
		this.produkty = produkty;
	}


}
