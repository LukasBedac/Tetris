
/**
 * Write a description of class Tetrominoes here.
 * 
 * @author (Lukas Bedac) 
 * @version (6.1.2021)
 */
public class Tetrominoes {
    private boolean[][] tvar;
    private int x;
    private int y;
    private Farba farba;
    /**
     * Constructor for objects of class Tetrominoes
     */
    public Tetrominoes(boolean[][] tvar, Farba farba) {
        this.tvar = tvar; 
        this.x = 5 - tvar[0].length / 2;
        this.y = 0;
        this.farba = farba;
    }
    /**
     * Method getPoziciaX
     *
     * @return - vráti poziciu x
     */
    public int getPoziciaX() {
        return this.x;
    }
    /**
     * Method getPoziciaY
     *
     * @return - vráti pozíciu y
     */
    public int getPoziciaY() {
        return this.y;
    }
    /**
     * Method getTvar
     *
     * @return - vráti tvar 
     */
    public boolean[][] getTvar() {
        return this.tvar;
    }
    /**
     * Method getVyska
     *
     * @return - vráti výšku tvaru (RIADKY)
     */
    public int getVyska() {
        return this.tvar.length;
    }
    /**
     * Method getSirka
     *
     * @return - vráti šírku tvaru (stĺpce)
     */
    public int getSirka() {
        return this.tvar[0].length;
    }
    /**
     * Method getFarba
     *
     * @return - vráti farbu 
     */
    public Farba getFarba() {
        return this.farba;
    }
    /**
     * Method zapni
     *
     */
    public void zapni() {
        for (int i = 0; i < this.getVyska(); i++) {
            for (int j = 0; j < this.getSirka(); j++) {
                if (this.tvar[i][j]) {
                    GameGrid.getInstance().zmenPolicko(j + this.x, i + this.y, this.farba);
                }
            }
        }
    }
    /**
     * Method vypni
     *
     */
    public void vypni() {
        for (int i = 0; i < this.getVyska(); i++) {
            for (int j = 0; j < this.getSirka(); j++) {
                if (this.tvar[i][j]) {
                    GameGrid.getInstance().zmenPolicko(j + this.x, i + this.y, null);
                }
            }
        }
    }
    /**
     * Method jeAktivnyStvorec
     *
     * @param x - súradnica x
     * @param y - súradnica yr
     * @return - vráti pravdivostnú hodnotu či je čtvorček zasvietený (true)
     */
    public boolean jeAktivnyStvorec(int x, int y) {
        return x >= 0 && x < this.getSirka() && y >= 0 && y < this.getVyska()
            && this.tvar[y][x];
    }
    /**
     * Method posunDole
     *
     * @return - vráti pravdivostnú hodnotu posunu dole
     */
    public boolean posunDole(Stack stack) {
        this.vypni();
        if (this.y < GameGrid.RIADKY - this.getVyska()) {
            this.y++;
            if (stack.nastalaKolizia(this)) {
                this.y--;
                this.zapni();
                return false;
            }
            this.zapni();
            return true;
        }
        this.zapni();
        return false;
    }
    /*    }
        this.vypni();
        this.y += 1;
        if (this.koliziaSoStackom()) {
            this.y--;
            this.zapni(); 
            return false;
        }
        this.zapni();
        
        return true;
    }*/
    /**
     * Method posunDoprava
     *
     */
    public void posunDoprava(Stack stack) {
        this.vypni();
        if (this.x < GameGrid.STLPCE - this.tvar[0].length) {
            this.x++;
            if (stack.nastalaKolizia(this)) {
                this.x--;
            }
        }
        this.zapni();
    }
    /**
     * Method posunDolava
     *
     */
    public void posunDolava(Stack stack) {
        this.vypni();
        if (this.x > 0) {
            this.x--;
            if (stack.nastalaKolizia(this)) {
                this.x++;
            }
        }
        this.zapni();
    }
    /**
     * Method otoc
     *  
     */
    public void otoc(Stack stack) {
        if (this.x + this.getVyska() > 10 || this.y + this.getSirka() > 20) {
            return;
        }
        this.zapni();
        boolean[][] novy = new boolean[this.getSirka()][this.getVyska()];
        for (int i = 0; i < this.getVyska(); i++) {
            for (int j = 0; j < this.getSirka(); j++) {
                novy[j][novy[0].length - 1 - i] = this.tvar[i][j];
            }
        }
        this.vypni();
        boolean[][] stary = this.tvar;
        if (novy[0].length + this.x <= 10 && novy.length + this.y <= GameGrid.RIADKY) {
            this.tvar = novy;
        }
        if (stack != null && stack.nastalaKolizia(this)) {
            this.tvar = tvar;
        }
        this.zapni();
    }
       /*public void ulozDoStacku() {
        for (int i = 0; i < this.getVyska(); i++) {
            for (int j = 0; j < this.getSirka(); j++) {
                if (this.tvar[i][j]) {
                    Stack.getInstance().zapni(i + y, j + x);                    
                }
            }
        }
    }*/
    /*public boolean koliziaSoStackom() {
        for (int i = 0; i < this.getVyska();i++) {
            for (int j = 0; j < this.getSirka();j++) {
                if(this.tvar[i][j] && Stack.getInstance().nastalaKolizia(this)){
                    return true;                    
                }
            }
        }
        
        return false;
    }*/
}

    