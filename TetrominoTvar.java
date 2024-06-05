/*import java.util.Random;
/**
 * Write a description of class TetrominoTvar here.
 * 
 * @author (Lukas Bedac) 
 * @version (a version number or a date)
 * nechtiac vytvorena classa na výrobu tetromín kvôli zmene celého ENUMU TetrominoShape
public class TetrominoTvar {
    private Random random;
    /**
     * Constructor for objects of class TetrominoTvar
     *
    public TetrominoTvar() {
        this.random = new Random();
    }
    public Tetrominoes vyrobNovyTvar(TetrominoShape tvar) {
    switch (tvar){
        case LINE:
            return new Tetrominoes(new boolean[][]{{true,true,true,true}}, Farba.nahodnaFarba());
        case SQUARE:
            return new Tetrominoes(new boolean[][]{{true,true}, {true, true}}, Farba.nahodnaFarba());
        case L:
            return new Tetrominoes(new boolean[][]{{true,false}, {true,false}, {true, true}}, Farba.nahodnaFarba());
        case MIRROREDL:
            return new Tetrominoes(new boolean[][]{{false, true}, {false, true}, {true,true}}, Farba.nahodnaFarba());
        case S:
            return new Tetrominoes(new boolean[][]{{false, true, true}, {true, true,false}}, Farba.nahodnaFarba());
        case Z:
            return new Tetrominoes(new boolean[][]{{true,true,false},{false,true,true}}, Farba.nahodnaFarba());
        case T:
            return new Tetrominoes(new boolean[][]{{true,true,true},{false,true,false}}, Farba.nahodnaFarba());
        default :
            return null;
        }
    }
        public Tetrominoes nahodnyTyp() {
        TetrominoShape[] typy = TetrominoShape.values();
        Tetrominoes tetromino = this.vyrobNovyTvar(typy[this.random.nextInt(typy.length)]);
        return tetromino;
    }
    
    
}*/
