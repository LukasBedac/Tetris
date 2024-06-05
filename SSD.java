
/**
 * Trieda reprezentuje 7 segmentovy displej.
 * Oznacenie segmentov:
 * ┌─ A ─┐
 * F        B
 * ├─ G ─┤
 * E        C
 * └─ D ─┘
 *  
 * @author Michal Varga
 * @version 1.0
 */
public class SSD {
    private Segment[] segmenty;
    /**
     * Constructor for objects of class Display
     */
    public SSD(int dlzkaSegmentu, int hrubkaSegmentu, int poziciaDisplejaX, int poziciaDisplejaY) {                     
        this.segmenty = new Segment[7];
        
        this.segmenty[0] = new Segment(dlzkaSegmentu, hrubkaSegmentu, poziciaDisplejaX + hrubkaSegmentu, poziciaDisplejaY);
        this.segmenty[1] = new Segment(hrubkaSegmentu, dlzkaSegmentu, poziciaDisplejaX + dlzkaSegmentu + hrubkaSegmentu, poziciaDisplejaY + hrubkaSegmentu);
        this.segmenty[2] = new Segment(hrubkaSegmentu, dlzkaSegmentu, poziciaDisplejaX + dlzkaSegmentu + hrubkaSegmentu, poziciaDisplejaY + dlzkaSegmentu + 2 * hrubkaSegmentu);
        this.segmenty[3] = new Segment(dlzkaSegmentu, hrubkaSegmentu, poziciaDisplejaX + hrubkaSegmentu, poziciaDisplejaY + 2 * dlzkaSegmentu + 2 * hrubkaSegmentu);
        this.segmenty[4] = new Segment(hrubkaSegmentu, dlzkaSegmentu, poziciaDisplejaX, poziciaDisplejaY + dlzkaSegmentu + 2 * hrubkaSegmentu);
        this.segmenty[5] = new Segment(hrubkaSegmentu, dlzkaSegmentu, poziciaDisplejaX, poziciaDisplejaY + hrubkaSegmentu);
        this.segmenty[6] = new Segment(dlzkaSegmentu, hrubkaSegmentu, poziciaDisplejaX + hrubkaSegmentu, poziciaDisplejaY + dlzkaSegmentu + hrubkaSegmentu);
    }
    
    public void rozsviet() {
        for (int index = 0; index < this.segmenty.length; index++ ) {
            this.segmenty[index].rozsviet();
        }
        /*this.segmenty[0].rozsviet();
        this.segmenty[1].rozsviet();
        this.segmenty[2].rozsviet();
        this.segmenty[3].rozsviet();
        this.segmenty[4].rozsviet();
        this.segmenty[5].rozsviet();
        this.segmenty[6].rozsviet();*/      
    }
    
    public void zhasni() {
        for (Segment segment : this.segmenty) {
            segment.zhasni();
        }
        /*this.segmenty[0].zhasni();
        this.segmenty[1].zhasni();
        this.segmenty[2].zhasni();
        this.segmenty[3].zhasni();
        this.segmenty[4].zhasni();
        this.segmenty[5].zhasni();
        this.segmenty[6].zhasni();*/     
    }
    
    public void zobraz0() {
        this.rozsviet();
        this.segmenty[6].zhasni();
    }
    
    public void zobraz1() {
        this.zhasni();
        this.segmenty[1].rozsviet();
        this.segmenty[2].rozsviet();
    }
    
    public void zobraz2() {
        this.rozsviet();
        this.segmenty[2].zhasni();
        this.segmenty[5].zhasni();        
    }
    
    public void zobraz3() {
        this.rozsviet();
        this.segmenty[4].zhasni();
        this.segmenty[5].zhasni();
    }
    
    public void zobraz4() {
        this.rozsviet();
        this.segmenty[0].zhasni();
        this.segmenty[3].zhasni();
        this.segmenty[4].zhasni();
    }
    
    public void zobraz5() {
        this.rozsviet();
        this.segmenty[1].zhasni();
        this.segmenty[4].zhasni();
    }
    
    public void zobraz6() {
        this.rozsviet();
        this.segmenty[1].zhasni();
    }
    
    public void zobraz7() {
        this.zhasni();
        this.segmenty[0].rozsviet();
        this.segmenty[1].rozsviet();
        this.segmenty[2].rozsviet();
    }
    
    public void zobraz8() {
        this.rozsviet();
    }
    
    public void zobraz9() {
        this.rozsviet();
        this.segmenty[4].zhasni();
    }      
    public void zobrazA() {
        this.rozsviet();
        this.segmenty[3].zhasni();
    }
    public void zobrazB() {
        this.rozsviet();
        this.segmenty[0].zhasni();
        this.segmenty[1].zhasni();
    }
    public void zobrazC() {
        this.rozsviet();
        this.segmenty[1].zhasni();
        this.segmenty[2].zhasni();
        this.segmenty[6].zhasni();
    }
    public void zobrazD() {
        this.rozsviet();
        this.segmenty[0].zhasni();
        this.segmenty[5].zhasni();
    }
    public void zobrazE() {
        this.rozsviet();
        this.segmenty[1].zhasni();
        this.segmenty[2].zhasni();
    }
    public void zobrazF() {
        this.rozsviet();
        this.segmenty[2].zhasni();
        this.segmenty[3].zhasni();
    }
    public void zobrazMinus() {
        this.zhasni();
        this.segmenty[6].rozsviet();
    }
    public void zobraz(int cislo) {
        
        switch (Math.abs(cislo)) {
            case 0:
                this.zobraz0();
                break;
            case 1:
                this.zobraz1();
                break;
            case 2:
                this.zobraz2();
                break;
            case 3:
                this.zobraz3();
                break;
            case 4:
                this.zobraz4();
                break;
            case 5:
                this.zobraz5();
                break;
            case 6:
                this.zobraz6();
                break;
            case 7:
                this.zobraz7();
                break;
            case 8:
                this.zobraz8();
                break;
            case 9:
                this.zobraz9();
                break;
            case 10:
                this.zobrazA();
            case 11:
                this.zobrazB();
                break;
            case 12:
                this.zobrazC();
                break;
            case 13:
                this.zobrazD();
                break;
            case 14:
                this.zobrazE();
                break;
            case 15:
                this.zobrazF();
                break;
            default:
                this.zhasni();
        }
    }
}
