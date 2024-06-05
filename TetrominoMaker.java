import java.util.Random;
/**
 * Write a description of class TetrominoTvar here.
 * 
 * @author (Lukas Bedac) 
 * @version (6.1.2021)
 */
public class TetrominoMaker {
    private Random random;
    /**
     * Constructor for objects of class TetrominoTvar
     */
    public TetrominoMaker() {
        this.random = new Random();
    }
    /**
     * Method vyrobNovyTvar
     *
     * @param tvar - tvar z ENUM triedy tetromina
     * @return - vyrobí nové tetromino
     */
    public Tetrominoes vyrobNovyTvar(TetrominoShape tvar) {
        switch (tvar) {
            case LINE:
                return new Tetrominoes(new boolean[][]{{true, true, true, true}}, Farba.nahodnaFarba());
            case SQUARE:
                return new Tetrominoes(new boolean[][]{{true, true}, {true, true}}, Farba.nahodnaFarba());
            case L:
                return new Tetrominoes(new boolean[][]{{true, false}, {true, false}, {true, true}}, Farba.nahodnaFarba());
            case MIRROREDL:
                return new Tetrominoes(new boolean[][]{{false, true}, {false, true}, {true, true}}, Farba.nahodnaFarba());
            case S:
                return new Tetrominoes(new boolean[][]{{false, true, true}, {true, true, false}}, Farba.nahodnaFarba());
            case Z:
                return new Tetrominoes(new boolean[][]{{true, true, false}, {false, true, true}}, Farba.nahodnaFarba());
            case T:
                return new Tetrominoes(new boolean[][]{{true, true, true}, {false, true, false}}, Farba.nahodnaFarba());
            default :
                return null;
        }
    }
    /**
     * Method nahodnyTyp
     *
     * @return - vyrobí nové náhodné tetromino 
     */
    public Tetrominoes nahodnyTyp() {
        TetrominoShape[] typy = TetrominoShape.values();
        Tetrominoes tetromino = this.vyrobNovyTvar(typy[this.random.nextInt(typy.length)]);
        return tetromino;
    }
    
    
}