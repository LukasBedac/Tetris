
/**
 * Write a description of class Stack here.
 * 
 * @author (Lukas Bedac) 
 * @version (6.1.2021)
 */
public class Stack {
    //private static Stack instance;
    private Farba[][] stack;
    /**
     * Constructor for objects of class Stack
     */
    public Stack() {
        this.stack = new Farba[GameGrid.RIADKY][GameGrid.STLPCE];
    }
    /*public static Stack getInstance() {
        if (Stack.instance == null) {
            Stack.instance = new Stack();
        }
        return Stack.instance;
    }
    /*public boolean jePlny() {
        for (int i = 0; i < this.stack.length;i++) {
            for (int j = 0; j < this.stack[i].length;j++) {
                if (this.stack[i][j] == true) {
                    GameGrid.getInstance().setPolicko(i, j);
                    return true;
                }
            }
        }
        return false;
    }*/
    /**
     * Method pridajDoStacku
     *
     * @param tetromino - používa aktuálne tetromino na zistenie tvaru 
     */
    public void pridajDoStacku(Tetrominoes tetromino) {
        for (int i = 0; i < tetromino.getSirka(); i++) {
            for (int j = 0; j < tetromino.getVyska(); j++) {
                if (tetromino.jeAktivnyStvorec(i, j)) {
                    this.stack[tetromino.getPoziciaY() + j][tetromino.getPoziciaX() + i] = 
                        tetromino.getFarba();
                } 
            }
        }
        this.kontrolaRiadkov();
    }
     /**
      * Method nastalaKolizia
      *
      * @param tetromino - používa aktuálne tetromino, kontroluje sa či nie je null
      * @return - vráti pravdivostnú hodnotu
      */
    public boolean nastalaKolizia(Tetrominoes tetromino) {
        for (int i = 0; i < tetromino.getSirka(); i++) {
            for (int j = 0; j < tetromino.getVyska(); j++) {
                if (tetromino.jeAktivnyStvorec(i, j) && 
                    this.stack[tetromino.getPoziciaY() + j][tetromino.getPoziciaX() + i] != null) {
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Method kontrolaRiadkov
     * - slúži na kontrolu riadkov a následne zmazanie a 
     *   posunie riadka nad ním na miesto zmazaného
     */ 
    public void kontrolaRiadkov() {       
        for (int i = GameGrid.RIADKY - 1 ; i >= 0; i--) {
            int pocitadlo = 0;
            for (int j = 0; j < GameGrid.STLPCE; j++) {
                if (this.stack[i][j] != null) {
                    pocitadlo++;
                }
            }
            if (pocitadlo == GameGrid.STLPCE) {
                for (int y = i; y > 0; y--) {
                    for (int x = 0; x < GameGrid.STLPCE; x++) {
                        this.stack[y][x] = this.stack[y - 1][x];
                        //this.pridajDoStacku(y, x, this.stack);
                    }
                }
                
            }
            for (int k = 0; k < GameGrid.STLPCE; k++) {
                GameGrid.getInstance().zmenPolicko(k, i, this.stack[i][k]);
            }
        }
    }
    /*public boolean vymazPoslednyRiadok() {
        for (int i = 0; i < stack.length;i++) {
            for (int j = 0; j < stack[i].length;j++) {
                if (j == 10) {
                    this.stack[i][j]; 
                    return true;
                }   
            }
        }        
        return false;
    }*/
}
