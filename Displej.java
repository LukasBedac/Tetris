
/**
 * Write a description of class Displej here.
 * 
 * @author (Lukas Bedac) 
 * @version (6.1.2021)
 */
public class Displej {
    private Stvorec[][] stvorce;
    /**
     * Constructor for objects of class Displej
     */
    public Displej(int x, int y, int sirka, int vyska, int velkost ) {
        this.stvorce = new Stvorec[vyska][sirka];
        for (int i = 0; i < vyska; i++) {
            for (int j = 0; j < sirka; j++) {
                this.stvorce[i][j] = new Stvorec();
                this.stvorce[i][j].zmenFarbu("white");
                this.stvorce[i][j].zmenStranu(velkost);
                this.stvorce[i][j].posunVodorovne(x + i * (velkost + 1));
                this.stvorce[i][j].posunZvisle(y + j * (velkost + 1));
                this.stvorce[i][j].zobraz();
            }
        }
    }
    /**
     * Method setPolicko
     *
     * @param x - x-ova suradnica
     * @param y - y-lonova suradnica
     * @param farba - farba z ENUM triedy
     */
    public void setPolicko(int x, int y, Farba farba) {
        if (farba == null) {
            this.stvorce[x][y].zmenFarbu("white");
        } else {
            this.stvorce[x][y].zmenFarbu(farba.getFarba());
        } 
    }
}
