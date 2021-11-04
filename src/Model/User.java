package Model;

import Visual.MainPage;
import Visual.Search;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class User implements Serializable {

    private String name;
    private String nazwisko;
    private String allergens1;
    private String allergens2;
    public  String allergens3;
    public static TreeMap<String, User> listaUser = new TreeMap<>();


    public User(String nazwisko, String allergens1, String allergens2, String allergens3) {
        this.nazwisko = nazwisko;
        this.allergens1 = allergens1;
        this.allergens2 = allergens2;
        this.allergens3 = allergens3;
        listaUser.put(nazwisko,this);
    }

    @Override
    public String toString() {
        return " " +
                "Alergen 1 = " + allergens1 +
                ", Alergen 2 = " + allergens2 +
                ", Alergen 3 = " + allergens3 +
                ' ';
    }

    public static void odczytPliku() {
        try {
            FileInputStream fis = new FileInputStream("Users.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            TreeMap<String, User> lista = (TreeMap<String, User>) ois.readObject();

            listaUser = lista;

            System.out.println("--------------------------------");
            Set<Entry<String, User>> entrySet = lista.entrySet();
            for (Entry<String, User> entry : entrySet) {
                System.out.println(entry.getKey() + " :" + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void zapisDoPliku() {
        try {
            FileOutputStream fos = new FileOutputStream("Users.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            new User(MainPage.inputNazwisko.getText(), MainPage.dropDown1.getSelectedItem().toString(),
                    MainPage.dropDown2.getSelectedItem().toString(), MainPage.dropDown3.getSelectedItem().toString());

            System.out.println("============================");
            Set<Entry<String, User>> entrySet = listaUser.entrySet();
            for (Entry<String, User> entry : entrySet) {
                System.out.println(entry.getKey() + " :" + entry.getValue());
            }
            oos.writeObject(listaUser);
            oos.close();
            fos.close();

        } catch (Exception ex) {
        }
    }

    public static void SearchByPpl() {
        if (listaUser.containsKey(Search.inputNazwisko1.getText())){
            Search.alegenySzukane.setText(" ");
            System.out.println("===============");
            Search.alegenySzukane.append("Alergeny "+ Search.inputNazwisko1.getText()+ " to: "+String.valueOf(listaUser.get(Search.inputNazwisko1.getText())));
        }else {
           // System.out.println("To nie nazwisko");
        }
    }
    public static void SearchByAlerge() {
        if (Rzodkiew.listaRzodkiew.containsKey(Search.inputNazwisko1.getText())){
            Search.alegenySzukane.setText(" ");
            System.out.println("===============");
            Search.alegenySzukane.append(Search.inputNazwisko1.getText()+ " alergen ma : "+ String.valueOf(Rzodkiew.listaRzodkiew.get(Search.inputNazwisko1.getText())));
        }else {
             System.out.println("Niestety nie");
            System.out.println(Rzodkiew.listaRzodkiew.values());
        }
    }






    public String getAllergens1() {
        return allergens1;
    }

    public void setAllergens1(String allergens1) {
        this.allergens1 = allergens1;
    }

    public String getAllergens2() {
        return allergens2;
    }

    public void setAllergens2(String allergens2) {
        this.allergens2 = allergens2;
    }

    public String getAllergens3() {
        return allergens3;
    }

    public void setAllergens3(String allergens3) {
        this.allergens3 = allergens3;
    }
}
