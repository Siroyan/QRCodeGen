import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/* This class make a QRCode from binary data. */
class QRCode {
    int symbol[][] = new int[21][21];
    public QRCode(){
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
    public int[][] getQRCode(){
        return symbol;
    }
}