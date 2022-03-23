package pakiecik;

import model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Random;

public class CookingAplication {
    private JPanel MainPanel;
    private JPanel Panel01;
    private JButton produktyButton;
    private JButton przepisyButton;
    private JPanel Panel02;
    private JTextArea textArea1;
    private JPanel ParentPanel;
    private JPanel card1;
    private JPanel card2;
    private JButton edytujProduktButton;
    private JButton dodajProduktButton;
    private JButton usuńProduktButton;
    private JPanel card3;
    private JTextField wprowadzanie;
    private JTextField textField1;
    private JButton zatwierdzButton;
    private JPanel card4;
    private JTextField edycjaTextField;
    private JTextField idtextField;
    private JPanel card5;
    private JTextField podajNowaNazweProduktuTextField;
    private JTextField textField2;
    private JTextField podajNowaIloscProduktuTextField;
    private JTextField textField3;
    private JButton zatwierdzButton1;
    private JButton zatwierdzButton2;
    private JPanel card6;
    private JTextField podajNazweNowegoProduktuTextField;
    private JTextField textField4;
    private JTextField podajIloscNowegoProduktuTextField;
    private JTextField textField5;
    private JButton zatwierdzButton3;
    private JPanel card7;
    private JButton usunPrzepisButton;
    private JButton edytujPrzepisButton;
    private JButton dodajPrzepisButton;
    private JPanel card8;
    private JTextField podajIdPrzepisuDoTextField;
    private JTextField textField6;
    private JButton zatwierdzButton4;
    private JButton wyswietlPrzepisButton;
    private JPanel card10;
    private JTextField podajIdPrzepisuDoTextField1;
    private JTextField textField7;
    private JButton zatwierdzButton5;
    private JPanel card11;
    private JTextField podajIdPrzepisuDoTextField2;
    private JTextField textField8;
    private JButton zatwierdzButton6;
    private JPanel card12;
    private JTextField podajNowaNazwePrzepisuTextField;
    private JTextField textField9;
    private JTextField podajNowyOpisPrzepisuTextField;
    private JTextField textField10;
    private JButton zatwierdzButton7;
    private JPanel card13;
    private JTextField podajNazweNowegoPrzepisuTextField;
    private JTextField textField11;
    private JTextField podajOpisNowegoPrzepisuTextField;
    private JTextField textField12;
    private JButton zatwierdzButton8;
    private JButton dostepnePrzepisyButton;
    private JPanel card14;
    private JTextField podajIdPrzepisuDoTextField3;
    private JTextField textField13;
    private JButton zatwierdzButton9;
    private JButton Button;
    Użytkownik u = new Użytkownik();
    Dane d = new Dane();
    public List<Produkty> produkty = d.getProdukty();
    public List<Przepis> przepisy = d.getPrzepisy();
    public List<PrzepisWym> wymag = u.getWymag();


    public CookingAplication() {
        produktyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card2);
                ParentPanel.repaint();
                ParentPanel.revalidate();
                textArea1.setText("");
                textArea1.append(String.valueOf("Id | Nazwa | Ilość\n"));
                for(int i=0;i<produkty.size();i++) {
                    textArea1.append(String.valueOf(produkty.get(i).getId()) + " | ");
                    textArea1.append(String.valueOf(produkty.get(i).getNazwa()) + " | ");
                    textArea1.append(String.valueOf(produkty.get(i).getQuantity()) + "\n");
                }
            }
        });
        przepisyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card7);
                ParentPanel.repaint();
                ParentPanel.revalidate();
                textArea1.setText("");
                textArea1.append(String.valueOf("Id | Nazwa\n"));
                for(int i=0;i<przepisy.size();i++) {
                    textArea1.append(String.valueOf(przepisy.get(i).getId()) + " | ");
                    textArea1.append(String.valueOf(przepisy.get(i).getNazwa()) + "\n");
                }
            }
        });
        usuńProduktButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card3);
                ParentPanel.repaint();
                ParentPanel.revalidate();
            }
        });

        zatwierdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x= Integer.parseInt(wprowadzanie.getText());
                u.usunProdukty(x);
                d.readProdukty();
                d.createProdukty();
                textArea1.setText("");
                textArea1.append(String.valueOf("Id | Nazwa | Ilość\n"));
                for(int i=0;i<produkty.size();i++) {
                    textArea1.append(String.valueOf(produkty.get(i).getId()) + " | ");
                    textArea1.append(String.valueOf(produkty.get(i).getNazwa()) + " | ");
                    textArea1.append(String.valueOf(produkty.get(i).getQuantity()) + "\n");
                }

            }
        });
        edytujProduktButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card4);
                ParentPanel.repaint();
                ParentPanel.revalidate();
            }
        });
        zatwierdzButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card5);
                ParentPanel.repaint();
                ParentPanel.revalidate();
            }
        });
        zatwierdzButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nowaNazwa = textField2.getText();
                int nowaIlosc = Integer.parseInt(textField3.getText());
                int x = Integer.parseInt(idtextField.getText());
                u.editProduct(x,nowaNazwa,nowaIlosc);
                d.readProdukty();
                d.createProdukty();
                textArea1.setText("");
                textArea1.append(String.valueOf("Id | Nazwa | Ilość\n"));
                for(int i=0;i<produkty.size();i++) {
                    textArea1.append(String.valueOf(produkty.get(i).getId()) + " | ");
                    textArea1.append(String.valueOf(produkty.get(i).getNazwa()) + " | ");
                    textArea1.append(String.valueOf(produkty.get(i).getQuantity()) + "\n");
                }

            }
        });
        dodajProduktButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card6);
                ParentPanel.repaint();
                ParentPanel.revalidate();
            }
        });
        zatwierdzButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = textField4.getText();
                int q = Integer.parseInt(textField5.getText());
                int id = produkty.get(produkty.size()-1).getId()+1;
                u.createProdukt(n,q,id);
                d.readProdukty();
                d.createProdukty();
                textArea1.setText("");
                textArea1.append(String.valueOf("Id | Nazwa | Ilość\n"));
                for(int i=0;i<produkty.size();i++) {
                    textArea1.append(String.valueOf(produkty.get(i).getId()) + " | ");
                    textArea1.append(String.valueOf(produkty.get(i).getNazwa()) + " | ");
                    textArea1.append(String.valueOf(produkty.get(i).getQuantity()) + "\n");
                }
            }
        });
        usunPrzepisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card8);
                ParentPanel.repaint();
                ParentPanel.revalidate();
            }
        });
        zatwierdzButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textField6.getText());
                u.usunPrzepis(id);
                d.readWymProdukty();
                d.createWymProdukty();
                d.readPrzepisy();
                d.createPrzepisy();
                textArea1.setText("");
                textArea1.append(String.valueOf("Id | Nazwa\n"));
                for(int i=0;i<przepisy.size();i++) {
                    textArea1.append(String.valueOf(przepisy.get(i).getId()) + " | ");
                    textArea1.append(String.valueOf(przepisy.get(i).getNazwa()) + "\n");

                }
            }
        });
        wyswietlPrzepisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card10);
                ParentPanel.repaint();
                ParentPanel.revalidate();
            }
        });
        zatwierdzButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                int id = Integer.parseInt(textField7.getText());
                int k = 0;

                for(int i=0;i<przepisy.size();i++) {
                    if(przepisy.get(i).getId()==id){
                        k=i;
                        break;
                    }
                }
                    textArea1.append(String.valueOf(przepisy.get(k).getNazwa()) + "\n");
                    textArea1.append(String.valueOf(przepisy.get(k).getOpis()) + "\n");

                        for(int j=0; j<przepisy.get(k).getWymProdukt().size();j++){
                            textArea1.append(String.valueOf(przepisy.get(k).getWymProdukt().get(j).getNazwa()) + " | ");
                            textArea1.append(String.valueOf(przepisy.get(k).getWymProdukt().get(j).getQuantity()) + "\n");
                        }

            }
        });
        zatwierdzButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card12);
                ParentPanel.repaint();
                ParentPanel.revalidate();
            }
        });
        edytujPrzepisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card11);
                ParentPanel.repaint();
                ParentPanel.revalidate();
            }
        });
        zatwierdzButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.readPrzepisy();
                d.createPrzepisy();
                String n = textField9.getText();
                String o = textField10.getText();
                int id  = Integer.parseInt(textField8.getText());
                u.editPrzepis(id,n,o);
                d.readPrzepisy();
                d.createPrzepisy();
                textArea1.setText("");
                textArea1.append(String.valueOf("Id | Nazwa\n"));
                for(int i=0;i<przepisy.size();i++) {
                    textArea1.append(String.valueOf(przepisy.get(i).getId()) + " | ");
                    textArea1.append(String.valueOf(przepisy.get(i).getNazwa()) + "\n");

                }

            }
        });
        dodajPrzepisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card13);
                ParentPanel.repaint();
                ParentPanel.revalidate();
            }
        });
        zatwierdzButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.readPrzepisy();
                d.createPrzepisy();
                String n = textField11.getText();
                String o = textField12.getText();
                int id = przepisy.get(przepisy.size()-1).getId()+1;
                u.createPrzepis(n,o,id);
                d.readPrzepisy();
                d.createPrzepisy();
                textArea1.setText("");
                textArea1.append(String.valueOf("Id | Nazwa\n"));
                for(int i=0;i<przepisy.size();i++) {
                    textArea1.append(String.valueOf(przepisy.get(i).getId()) + " | ");
                    textArea1.append(String.valueOf(przepisy.get(i).getNazwa()) + "\n");

                }
            }
        });
        dostepnePrzepisyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ParentPanel.removeAll();
                ParentPanel.add(card14);
                ParentPanel.repaint();
                ParentPanel.revalidate();

                wymag.clear();
                textArea1.setText("");
                textArea1.append(String.valueOf("Id | Nazwa\n"));
                for(int i=0; i<przepisy.size();i++){
                    if(u.wybierz(i)!=0){
                        textArea1.append(String.valueOf(przepisy.get(i).getId()) + " | ");
                        textArea1.append(String.valueOf(przepisy.get(i).getNazwa()) + "\n");
                    }
                }
            }
        });

        zatwierdzButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame f1 = new JFrame();
                JFrame f = new JFrame();
                f1.setSize(400,300);
                f.setSize(400, 300);
                int x=0;
                int ktore=0;
                for(int i= 0;i<wymag.size();i++){
                    if(wymag.get(i).getId()==Integer.parseInt(textField13.getText())){
                        x=wymag.get(i).getWymProdukt().size();
                        ktore=i;
                    }
                }
                int[] values = new int[x];
                int[] values2 = new int[x];
                String[] names = new String[x];
                for(int i=0;i<x;i++){
                    values[i] = wymag.get(ktore).getWymProdukt().get(i).getQuantity();
                    names[i] = wymag.get(ktore).getWymProdukt().get(i).getNazwa();
                    for(int j=0;j<produkty.size();j++){
                        if(produkty.get(j).getId()==wymag.get(ktore).getWymProdukt().get(i).getId()){
                            values2[i] = produkty.get(j).getQuantity();
                        }
                    }
                    values[i] = values2[i] - values[i];
                }
                f1.getContentPane().add(new ChartPanel(values2, names, "Produkty przed wybraniem przepisu"));
                f.getContentPane().add(new ChartPanel(values, names, "Produkty po wybraniu przepisu"));

                WindowListener wndCloser = new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                };
                f.setVisible(true);
                f1.setVisible(true);
            }
        });
    }



        public static void main(String[] args) {
            JFrame frame = new JFrame("CookingAplication");
            frame.setContentPane(new CookingAplication().MainPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
}
