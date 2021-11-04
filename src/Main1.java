import Model.Rzodkiew;
import Model.User;
import Visual.MainPage;

import javax.swing.*;

public class Main1 {

    public static JFrame window;

    public static void main(String[] args) {

        window = new JFrame("Alergeny");


        window.add(new MainPage());

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
        User.odczytPliku();
        System.out.println("++++++++++++++++++++");
        Rzodkiew.odczytPliku();

    }
}