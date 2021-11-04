package Model;

import Visual.MainPage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Rzodkiew {
    private String nazwisko;
    private String allergens1;
    public static TreeMap<String,String > listaRzodkiew = new TreeMap<>();

    public Rzodkiew(String nazwisko, String allergens1) {
        this.nazwisko = nazwisko;
        this.allergens1 = allergens1;
        listaRzodkiew.put(allergens1,nazwisko);
    }

    @Override
    public String toString() {
        return "Rzodkiew{" +
                "nazwisko='" + nazwisko + '\'' +
                ", allergens1='" + allergens1 + '\'' +
                '}';
    }
    public static void zapisDoPlikuRz() {
        try {
            FileOutputStream fos = new FileOutputStream("Alergen1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            new Rzodkiew(MainPage.inputNazwisko.getText(), MainPage.dropDown1.getSelectedItem().toString());

            System.out.println("*****************************************************");
            Set<Map.Entry<String, String >> entrySet = listaRzodkiew.entrySet();
            for (Map.Entry<String, String> entry : entrySet) {
                System.out.println(entry.getKey() + " :" + entry.getValue());
            }
            oos.writeObject(listaRzodkiew);
            oos.close();
            fos.close();

        } catch (Exception ex) {
        }
    }
    public static void odczytPliku() {
        try {
            FileInputStream fis = new FileInputStream("Alergen1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            TreeMap<String, String> lista1 = (TreeMap<String, String>) ois.readObject();

            listaRzodkiew = lista1;

            System.out.println("-----------------------------------------------");
            Set<Map.Entry<String, String>> entrySet = lista1.entrySet();
            for (Map.Entry<String, String> entry : entrySet) {
                System.out.println(entry.getKey() + " :" + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
