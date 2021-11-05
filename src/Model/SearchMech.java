package Model;

public class Search {

    public static void SearchByPpl() {
        if (User.listaUser.containsKey(Visual.Search.inputNazwisko1.getText())){
            Visual.Search.alegenySzukane.setText(" ");
            System.out.println("===============");
            Visual.Search.alegenySzukane.append("Alergeny "+ Visual.Search.inputNazwisko1.getText()+ " to: "+String.valueOf(User.listaUser.get(Visual.Search.inputNazwisko1.getText())));
        }else {
            // System.out.println("To nie nazwisko");
        }
    }
}
