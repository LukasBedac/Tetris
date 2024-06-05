import java.util.Random;
/**
 * Enumeration class Farba - write a description of the enum class here
 * 
 * @author (Lukas Bedac)
 * @version (6.1.2021)
 */
public enum Farba {
    Zlta("yellow"),
    Cervena("red"),
    Modra("blue"),
    Zelena("green"),
    Fialova("magenta");
    private String farba;
    private static Random random = new Random();
    /**
     * Method nahodnaFarba
     *
     * @return - vráti náhodnú farbu
     */
    public static Farba nahodnaFarba() {
        return Farba.values()[random.nextInt(Farba.values().length)];
    }
    /**
     * Farba Constructor
     *
     * @param farba - uloží farbu do atriutu
     */
    Farba(String farba) {
        this.farba = farba;
    }
    /**
     * Method getFarba
     *
     * @return - vráti farbu z atribútu
     */
    public String getFarba() {
        return this.farba;
    }
}
