import javax.swing.JOptionPane;
/**
 * Write a description of class Tetris here.
 * 
 * @author (Lukas Bedac) 
 * @version (6.1.2021)
 */
public class Tetris {
    private Tetrominoes tetromino;
    private TetrominoMaker tovaren;
    private Stack stack;
    private Manazer manazer;
    /**
     * Constructor for objects of class Tetris
     */
    public Tetris() {
        this.manazer = new Manazer();
        this.tovaren = new TetrominoMaker();
        this.stack = new Stack();
        this.tetromino = this.tovaren.nahodnyTyp();
        this.tetromino.zapni();
    }
    /**
     * Method posunDole
     *
     */
    public void spusti() {
        this.manazer.spravujObjekt(this);
    }
    /**
     * Method posunDole
     *
     */
    public void posunDole() {
        this.tetromino.posunDole(this.stack);
    }
    /**
     * Method posunVpravo
     *
     */
    public void posunVpravo() {
        this.tetromino.posunDoprava(this.stack);
    }
    /**
     * Method posunVlavo
     *
     */
    public void posunVlavo() {
        this.tetromino.posunDolava(this.stack);
    }
    /**
     * Method aktivuj
     * - otáča objekt
     */
    public void aktivuj() {
        this.tetromino.otoc(this.stack);
    }
    /**
     * Method zrus
     *
     */
    public void zrus() {
        System.exit(0);
    }
    /**
     * Method tik
     * - stará sa o automatický pohyb dole, ukladanie do kopy a vytváranie nových tetromín
     */
    public void tik() {
        if (!this.tetromino.posunDole(this.stack)) {
            this.stack.pridajDoStacku(this.tetromino);
            this.tetromino = this.tovaren.nahodnyTyp();
            this.tetromino.zapni();
            if (this.stack.nastalaKolizia(this.tetromino)) {
                JOptionPane.showMessageDialog(null, "Koniec hry");
                this.manazer.prestanSpravovatObjekt(this);
                
            }
        }
    }
    /**
     * Method zastav
     *
     */
    /*public void zastav() {
        if (this.jeAktivny == true) {
            this.manazer.prestanSpravovatObjekt(this);
            this.jeAktivny = false;
        } else {
            this.manazer.spravujObjekt(this);
            this.jeAktivny = true;
            this.tetromino.zapni();
        }
        
        /*if (this.manazer.spravujObjekt(this.tetromino) == true) {
            this.manazer.prestanSpravovatObjekt(this);
        } else {
            return;
        }*/
    
}
