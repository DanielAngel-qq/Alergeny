package Model;

public enum Allergens {

    Brak("brak"),
    Marchewka("marchwska"),
    Rzodkiew("rzodkiewka"),
    Krewetki("krewetki");

    public static String nazwaAlergenu;

    Allergens(String nazwaAlergenu) {
    }

    public static String getnazwaAlergenu() {
        return nazwaAlergenu;
    }

    public void setnazwaAlergenu(String nazwaAlergenu) {
        this.nazwaAlergenu = nazwaAlergenu;
    }


    }

