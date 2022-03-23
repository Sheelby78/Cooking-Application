package model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Użytkownik {
    Dane d = new Dane();
    public List<Produkty> produkty = d.getProdukty();
    public List<Przepis> przepisy = d.getPrzepisy();

    public List<PrzepisWym> getWymag() {
        return wymag;
    }

    public List<PrzepisWym> wymag = d.getWymag();

    public void usunProdukty(int x){
        try {
            String fileName = "src\\Produkty.csv";
            FileWriter writer = new FileWriter(fileName);
            writer.write("Nazwa;quantity;id;" + System.lineSeparator());
            for (int i = 0; i < produkty.size(); i++) {
                    if(produkty.get(i).getId()==x){
                        produkty.get(i).setId(0);
                    }
                    if(produkty.get(i).getId()==0) {
                        continue;
                    }
                    writer.write(produkty.get(i).getNazwa() + ";");
                    writer.write(produkty.get(i).getQuantity() + ";");
                    writer.write(produkty.get(i).getId() + ";");
                    writer.write(System.lineSeparator());
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editProduct(int x, String n, int q) {
        for (int i = 0; i < produkty.size(); i++) {
            if(produkty.get(i).getId()==x){
                if(n!=null){
                    produkty.get(i).setNazwa(n);
                }
                if(q!=0){
                    produkty.get(i).setQuantity(q);
                }
            }
            try {
                String fileName = "src\\Produkty.csv";
                FileWriter writer = new FileWriter(fileName);
                writer.write("Nazwa;quantity;id;" + System.lineSeparator());
                for (int j = 0; j < produkty.size(); j++) {
                    writer.write(produkty.get(j).getNazwa() + ";");
                    writer.write(produkty.get(j).getQuantity() + ";");
                    writer.write(produkty.get(j).getId() + ";");
                    writer.write(System.lineSeparator());
                }
                writer.flush();
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void createProdukt(String n, int q, int id){
        produkty.add(new Produkty(n,q,id));
        try {
            String fileName = "src\\Produkty.csv";
            FileWriter writer = new FileWriter(fileName);
            writer.write("Nazwa;quantity;id;" + System.lineSeparator());
            for (int j = 0; j < produkty.size(); j++) {
                writer.write(produkty.get(j).getNazwa() + ";");
                writer.write(produkty.get(j).getQuantity() + ";");
                writer.write(produkty.get(j).getId() + ";");
                writer.write(System.lineSeparator());
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void usunPrzepis(int x){
        try {
            String fileName = "src\\Przepisy.csv";
            FileWriter writer = new FileWriter(fileName);
            writer.write("Id;Nazwa;Opis;" + System.lineSeparator());
            for (int i = 0; i < przepisy.size(); i++) {
                if(przepisy.get(i).getId()==x){
                    przepisy.get(i).setId(0);
                }
                if(przepisy.get(i).getId()==0) {
                    continue;
                }
                writer.write(przepisy.get(i).getId() + ";");
                writer.write(przepisy.get(i).getNazwa() + ";");
                writer.write(przepisy.get(i).getOpis() + ";");
                writer.write(System.lineSeparator());
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String fileName = "src\\WymProdukty.csv";
            FileWriter writer = new FileWriter(fileName);
            writer.write("Nazwa;quantity;id;" + System.lineSeparator());
            for(int i=0;i<przepisy.size();i++){
                if(przepisy.get(i).getId()==x||przepisy.get(i).getId()==0){
                    continue;
                }

                for(int j=0;j<przepisy.get(i).getWymProdukt().size();j++){
                    writer.write(przepisy.get(i).getWymProdukt().get(j).getNazwa() + ";");
                    writer.write(przepisy.get(i).getWymProdukt().get(j).getQuantity() + ";");
                    writer.write(przepisy.get(i).getWymProdukt().get(j).getId() + ";");
                }
                    writer.write(System.lineSeparator());
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void editPrzepis(int x, String n, String o) {
        for (int i = 0; i < przepisy.size(); i++) {
            if(przepisy.get(i).getId()==x){
                if(n!=null){
                    przepisy.get(i).setNazwa(n);
                }
                if(o!=null){
                    przepisy.get(i).setOpis(o);
                }
            }
            try {
                String fileName = "src\\Przepisy.csv";
                FileWriter writer = new FileWriter(fileName);
                writer.write("Id;Nazwa;Opis;" + System.lineSeparator());
                for (int j = 0; j < przepisy.size(); j++) {
                    writer.write(przepisy.get(j).getId() + ";");
                    writer.write(przepisy.get(j).getNazwa() + ";");
                    writer.write(przepisy.get(j).getOpis() + ";");
                    writer.write(System.lineSeparator());
                }
                writer.flush();
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void createPrzepis(String n, String o, int id){
        List<WymProdukt> wymProdukt = new ArrayList<>();
        przepisy.add(new Przepis(id,n,o,wymProdukt));
        try {
            String fileName = "C:\\Users\\Patryk\\IdeaProjects\\lab 04_pop\\src\\Przepisy.csv";
            FileWriter writer = new FileWriter(fileName);
            writer.write("Nazwa;quantity;id;" + System.lineSeparator());
            for (int j = 0; j < przepisy.size(); j++) {
                writer.write(przepisy.get(j).getId() + ";");
                writer.write(przepisy.get(j).getNazwa() + ";");
                writer.write(przepisy.get(j).getOpis() + ";");
                writer.write(System.lineSeparator());
            }
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int wybierz(int i){
        int ile = przepisy.get(i).getWymProdukt().size();
            for(int j=0;j<przepisy.get(i).getWymProdukt().size();j++){
                for(int k=0;k<produkty.size();k++){
                    if(przepisy.get(i).getWymProdukt().get(j).getId()==produkty.get(k).getId()&&przepisy.get(i).getWymProdukt().get(j).getQuantity()<=produkty.get(k).getQuantity()){
                        ile--;
                    }
                }
                }
                    if(ile==0){
                        int id = przepisy.get(i).getId();
                        String n = przepisy.get(i).getNazwa();
                        String o = przepisy.get(i).getOpis();
                        List<WymProdukt> wymProdukt = przepisy.get(i).getWymProdukt();
                        wymag.add(new PrzepisWym(id,n,o,wymProdukt));
                        return przepisy.get(i).getId();
            }
        return 0;
    }

}
