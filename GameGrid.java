
/**
 * Write a description of class GameGrid here.
 * 
 * @author (Lukas Bedac) 
 * @version (6.1.2021)
 */
public class GameGrid {
    public static final int RIADKY = 20; 
    public static final int STLPCE = 10;
    public static final int VELKOSTSTVORCA = 25;
    private Displej displej;
    private static GameGrid instance;
    //private Obdlznik background;
    /**
     * Constructor for objects of class GameGrid
     */
    private GameGrid() {
        this.displej = new Displej(1, 1, GameGrid.RIADKY, GameGrid.STLPCE, VELKOSTSTVORCA); 
        // presunuté v displeji  
        /*this.background = new Obdlznik();
        this.background.zmenStrany(VELKOSTSTVORCA * STLPCE + 1,
                VELKOSTSTVORCA * RIADKY + 1);
        this.background.zmenFarbu("black");
        this.background.zobraz();
        /*this.stvorce = new Stvorec[RIADKY][STLPCE];
        for (int i = 0; i < this.RIADKY; i++) {
            for (int j = 0; j < this.STLPCE; j++) {
                this.stvorce[i][j] = new Stvorec();
                this.stvorce[i][j].zmenStranu(VELKOSTSTVORCA - 1);
                this.stvorce[i][j].posunVodorovne(VELKOSTSTVORCA * j + 1);
                this.stvorce[i][j].posunZvisle(VELKOSTSTVORCA * i + 1);
                this.stvorce[i][j].zmenFarbu("white");
                this.stvorce[i][j].zobraz();
            }
        }*/
    }
    /**
     * Method getInstance
     *
     * @return vráti inštanciu hracej plochy
     */
    public static GameGrid getInstance() {
        if (instance == null) {
            GameGrid.instance = new GameGrid();
        }
        return GameGrid.instance;
    }
    public void zmenPolicko(int x, int y, Farba farba) {
        this.displej.setPolicko(x, y, farba);
    }
    /*public void zobraz(int riadok, int stlpec) {
        this.stvorce[riadok][stlpec].zmenFarbu("blue");
    }
    /**
     * Method skry
     *
     * @param riadok riadok dvojrozmerneho pola
     * @param stlpec stlpec dvojrozmerneho pola
     */
    /*public void skry(int riadok, int stlpec) {
        this.stvorce[riadok][stlpec].zmenFarbu("white");
    }/*
    /**
     * Method setPolicko
     *
     * @param x - pozicia x
     * @param y - pozicia y
     */
    /*public void setPolicko(int x, int y, Farba farba) {
        if (farba == null) {
            this.stvorce[x][y].zmenFarbu("blue");
        } else {
            this.stvorce[x][y].zmenFarbu(farba.getFarba());
        }
    }
    // presunute v Tetrominoes class
    /*public boolean jeZapnute(int riadok, int stlpec) {
        /*if (riadok == this. && stlpec == true) {
            return true;
        }
        return false;
    }*/ 
}
