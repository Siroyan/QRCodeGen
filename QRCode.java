import java.util.Arrays;
class QRCode {
    private int symbol[][] = new int[21][21];
    private int binaryData[] = new int[72];
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
        int mode[] = {0,0,1,0};
        System.arraycopy(mode,0,binaryData,0,mode.length);
        cursor += mode.length;

        int errLv[] = {0,0,0,0,0,1,0,0,0};
        System.arraycopy(errLv,0,binaryData,cursor,errLv.length);
        cursor += errLv.length;
    }
    public void convertBinary(char rawdata[]){
        for(int i = 0; i < rawdata.length; i += 2){
            //int dec = 10 * 45 + 11;
            int dec = value(rawdata[i]) * 45 + value(rawdata[i+1]);
            int bin[] = {0,0,0,0,0,0,0,0,0,0,0};
            for(int j = 0; dec > 0; j++){
                bin[10 - j] = dec % 2;
                dec = dec / 2;
            }
            System.arraycopy(bin,0,binaryData,cursor,bin.length);
            cursor += bin.length;
        }
        System.out.println(Arrays.toString(binaryData));    //DEBUG
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