
/**
 * Enumeration class TetrominoShape - write a description of the enum class here
 * 
 * @author (Lukas Bedac)
 * @version (6.1.2021)
 * 
 */
public enum TetrominoShape {
    LINE, //(new boolean[][]{{true,true,true,true}}, Farba.getFarba()),
    SQUARE, //(new boolean[][]{{true,true}, {true, true}}, Farba.getFarba()),
    L, //(new boolean[][]{{true,false}, {true,false}, {true, true}}, Farba.getFarba()),
    MIRROREDL, //(new boolean[][]{{false, true}, {false, true}, {true,true}}, Farba.getFarba()),
    S, //new boolean[][]{{false, true, true}, {true, true,false}}, Farba.getFarba()),
    Z, //(new boolean[][]{{true,true,false},{false,true,true}}, Farba.getFarba()),
    T; //(new boolean[][]{{true,true,true},{false,true,false}}, Farba.getFarba());
    
    //private boolean[][] tvar;
    //private Farba farba = new Farba();
    
    //private TetrominoShape(boolean[][] tvar) {
    //    this.tvar = tvar;
    //}
    //public boolean[][] getTvar() {
    //    return this.tvar;
}

