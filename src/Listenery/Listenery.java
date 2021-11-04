package Listenery;

import Model.Rzodkiew;
import Model.User;
import Visual.MainPage;
import Visual.Search;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listenery {

    public static class Zapisz implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            User.zapisDoPliku();
            Rzodkiew.zapisDoPlikuRz();
        }
    }

    public static class SearchFor implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            User.SearchByPpl();
        }
    }
    public static class Odczyt implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            User.odczytPliku();
        }
    }

    public static class SearchAlergen implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            User.SearchByAlerge();
        }
    }

    public static class SearchUser implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            JFrame window2 = new JFrame("Szukaj osoby");

            window2.add(new Search());

            window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window2.setVisible(true);
            window2.pack();
        }
    }
}
