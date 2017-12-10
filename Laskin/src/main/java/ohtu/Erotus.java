package ohtu;

import javax.swing.JTextField;

public class Erotus implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private String edellinen;
    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.sovellus = sovellus;
        edellinen = "";
    }

    @Override
    public void suorita() {
        edellinen = Integer.toString(sovellus.tulos());
        int i = Integer.parseInt(tuloskentta.getText());
        int j;
        if (!syotekentta.getText().equals("")) {
            j = Integer.parseInt(syotekentta.getText());
            sovellus.miinus(j);
            i = sovellus.tulos();
            tuloskentta.setText(Integer.toString(i));
        }
    }

    @Override
    public void peru() {
        tuloskentta.setText(edellinen);
    }

}
