import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class QRCode {
    private int symbol[][] = new int[21][21];
    List<Integer> binData = new ArrayList<Integer>();
    private int cursor = 0;

    public QRCode(){
        /* To create detection of position and timing pattern */
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

    public void setMeta(int modeIndicator, int errLvIndicator){
        List<Integer> modeList = new ArrayList<Integer>(Arrays.asList(0,0,1,0));
        for(int n : modeList){
            binData.add(n);
        }
        List<Integer> errLvList = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,1,0,0,0));
        for(int n : errLvList){
            binData.add(n);
        }
    }

    public void convertBinary(char rawdata[]){
        for(int i = 0; i < rawdata.length; i += 2){
            List<Integer> bin = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0));
            int dec = value(rawdata[i]) * 45 + value(rawdata[i+1]);
            for(int j = 0; dec > 0; j++){
                bin.set(10-j,dec % 2);
                dec = dec / 2;
            }
            for(int n : bin){
                binData.add(n);
            }
        }
        for(int str : binData){
            System.out.print(str);
        }
    }
    public void setSymbolVersion(){
        /* To define Symbol Version */
    }
    public int[][] getSymbol(){
        return symbol;
    }
    private int value(char c){
        if('A' <= c && c <= 'Z') return c - 'A' + 10;
        if('0' <= c && c <= '9') return c - '0';
        else return 0;     
    }
}