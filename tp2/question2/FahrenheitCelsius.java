package question2;
import java.text.*;
import java.math.*;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     *
     * @param args ...
     */
    public static void main(String[] args) {

        // pour tous les paramètres de la ligne de commande
        for (int i = 0; i < args.length; i++) {
            int fahrenheit;
            try {
                fahrenheit = Integer.parseInt(args[i]);
                float celsius = fahrenheitEnCelsius(fahrenheit);
                System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,                                                                                // imposés

            } catch (NumberFormatException nfe) {
                System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
            }

        }

    }

    /**
     * la méthode à compléter.
     *
     * @param f la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        DecimalFormat df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.FLOOR);
        String num = df.format(5.0 / 9 * (f - 32));
        return Float.parseFloat(num); // à compléter en remplaçant ce return 0.F par la fonction
        // de conversion
    }

}
