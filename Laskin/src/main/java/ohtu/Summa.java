package ohtu;

import javax.swing.JTextField;

public class Summa implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private String edellinen;
    public Summa(Sovelluslogiikka s, JTextField t, JTextField sy) {
        sovellus = s;
        tuloskentta = t;
        syotekentta = sy;
        edellinen = "";
    }

    @Override
    public void suorita() {
        edellinen = Integer.toString(sovellus.tulos());
        int i = Integer.parseInt(tuloskentta.getText());
        int j;
        if (!syotekentta.getText().equals("")) {
            j = Integer.parseInt(syotekentta.getText());
            sovellus.plus(j);
            i = sovellus.tulos();
            tuloskentta.setText(Integer.toString(i));
        }

    }

    @Override
    public void peru() {
        tuloskentta.setText(edellinen); 
    }

}
