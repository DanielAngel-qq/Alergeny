package Visual;

import Listenery.Listenery;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class Search extends JPanel {
    public static JTextArea alegenySzukane = new JTextArea();

    public static JTextField inputImie1;
    public static JTextField inputNazwisko1;
    public static JComboBox dropDown21;
    public static JComboBox dropDown22;
    public static JComboBox dropDown23;
    public static JButton zapisz;

    public Search(){
        setLayout(null);


        JLabel mainName = new JLabel("Alergeny");
        mainName.setFont(new Font("Alergeny",Font.BOLD,30));
        mainName.setBounds(280, 5, 350, 100);
        add(mainName);

        JLabel imie = new JLabel("Wpisz Imie:");
        imie.setFont(new Font("Imię :",Font.PLAIN,15));
        imie.setBounds(10,110,120,20);
        add(imie);

        JLabel nazwisko = new JLabel("Wpisz Nazwisko:");
        nazwisko.setFont(new Font("Nazwisko :",Font.PLAIN,15));
        nazwisko.setBounds(10,160,120,20);
        add(nazwisko);

        inputImie1 = new JTextField("");
        inputImie1.setBounds(130,100,150,30);
        add(inputImie1);

        inputNazwisko1 = new JTextField("");
        inputNazwisko1.setBounds(130,150,150,30);
        add(inputNazwisko1);

        JLabel alergen1 = new JLabel("Alergen 1 :");
        alergen1.setFont(new Font("Alergen 1",Font.PLAIN,14));
        alergen1.setBounds(320,155,120,20);
        add(alergen1);

        dropDown21 = new JComboBox(Model.Allergens.values());
        dropDown21.setBounds(400,150,160,30);
        add(dropDown21);

        JLabel alergen2 = new JLabel("Alergen 2 :");
        alergen2.setFont(new Font("Alergen2",Font.PLAIN,14));
        alergen2.setBounds(10,210,160,30);
        add(alergen2);

        dropDown22 = new JComboBox(Model.Allergens.values());
        dropDown22.setBounds(130,210,160,30);
        add(dropDown22);

        JLabel alergen3 = new JLabel("Alergen 3 :");
        alergen3.setFont(new Font("Alergen3",Font.PLAIN,14));
        alergen3.setBounds(320,210,160,30);
        add(alergen3);

        dropDown23 = new JComboBox(Model.Allergens.values());
        dropDown23.setBounds(400,210,160,30);
        add(dropDown23);

        alegenySzukane = new JTextArea(" ");
        alegenySzukane.setBounds(50,350,500,150);
        add(alegenySzukane);

        zapisz = new JButton("Szukaj");
        zapisz.setBounds(340,90,240,43);
        zapisz.addActionListener(new Listenery.SearchFor());
        zapisz.addActionListener(new Listenery.SearchAlergen());
        add(zapisz);


    }
    public Dimension getPreferredSize() {
        return new Dimension(650, 550);
    }
}
