package Visual;

import Listenery.Listenery;
import Model.Allergens;
import Model.User;

import javax.swing.*;
import java.awt.*;

public  class MainPage extends JPanel {

    public static JTextField inputImie;
    public static JTextField inputNazwisko;
    public static JComboBox dropDown1;
    public static JComboBox dropDown2;
    public static JComboBox dropDown3;
    public static JButton zapisz;

    public MainPage(){

    setLayout(null);


    JButton searchByPerson = new JButton("Wyszukaj po osobie");
    searchByPerson.addActionListener(new Listenery.SearchUser() );
    searchByPerson.setBounds(340,90,240,43);
    add(searchByPerson);

    JButton searchByAler= new JButton("Wyszukaj po Alergenie");
    searchByAler.setBounds(80,90,240,43);
    searchByAler.addActionListener(new Listenery.Odczyt());
    add(searchByAler);

    JLabel mainName = new JLabel("Alergeny");
    mainName.setFont(new Font("Alergeny",Font.BOLD,30));
    mainName.setBounds(270, 5, 350, 100);
    add(mainName);

    //JLabel imie = new JLabel("Wpisz Imie:");
   //imie.setFont(new Font("Imię :",Font.PLAIN,15));
   //imie.setBounds(10,110,120,20);
    //add(imie);

    JLabel nazwisko = new JLabel("Wpisz Nazwisko:");
    nazwisko.setFont(new Font("Nazwisko :",Font.PLAIN,15));
    nazwisko.setBounds(10,160,120,20);
    add(nazwisko);

    //inputImie = new JTextField("");
    //inputImie.setBounds(130,100,150,30);
    //add(inputImie);

    inputNazwisko = new JTextField("");
    inputNazwisko.setBounds(130,150,150,30);
    add(inputNazwisko);

    JLabel alergen1 = new JLabel("Alergen 1 :");
    alergen1.setFont(new Font("Alergen 1",Font.PLAIN,14));
    alergen1.setBounds(320,155,120,20);
    add(alergen1);

    dropDown1 = new JComboBox(Model.Allergens.values());
    dropDown1.setBounds(400,150,160,30);
    add(dropDown1);

    JLabel alergen2 = new JLabel("Alergen 2 :");
    alergen2.setFont(new Font("Alergen2",Font.PLAIN,14));
    alergen2.setBounds(10,210,160,30);
    add(alergen2);

    dropDown2 = new JComboBox(Model.Allergens.values());
    dropDown2.setBounds(130,210,160,30);
    add(dropDown2);

    JLabel alergen3 = new JLabel("Alergen 3 :");
    alergen3.setFont(new Font("Alergen3",Font.PLAIN,14));
    alergen3.setBounds(320,210,160,30);
    add(alergen3);

    dropDown3 = new JComboBox(Model.Allergens.values());
    dropDown3.setBounds(400,210,160,30);
    add(dropDown3);


    zapisz = new JButton("Zapisz");
    zapisz.setBounds(300,500,120,30);
    zapisz.addActionListener(new Listenery.Zapisz());
    add(zapisz);


    }

    public Dimension getPreferredSize() {
        return new Dimension(650, 550);
    }
}
