import java.util.*;

/* This class make a QRCode from binary data. */
class QRCode {
    int symbol[][] = new int[21][21];
    QRCode(){
        int symbolBase[][] = {
            {1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
            {1,0,1,1,1,0,1,0,0,0,0,0,0,0,1,0,1,1,1,0,1},
            {1,0,1,1,1,0,1,0,0,0,0,0,0,0,1,0,1,1,1,0,1},
            {1,0,1,1,1,0,1,0,0,0,0,0,0,0,1,0,1,1,1,0,1},
            {1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        System.arraycopy(symbolBase,0,symbol,0,symbolBase.length);
    }

    public void makeSymbol(){
        //TODO : make symbol from code data    
    }

    public int[][] getSymbol(){

        return symbol;
    }
}