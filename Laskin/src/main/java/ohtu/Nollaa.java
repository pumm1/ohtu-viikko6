package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private String edellinen;
    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.sovellus = sovellus;
        edellinen = "";
    }

    @Override
    public void suorita() {
        edellinen = Integer.toString(sovellus.tulos());
        sovellus.nollaa();
        int i = sovellus.tulos();
        tuloskentta.setText(Integer.toString(i));
    }

    @Override
    public void peru() {
        tuloskentta.setText(edellinen);
    }

}
