import java.util.*;

class BinData{
    List<Integer> binData;
    char plaindata[];
    
    public BinData(){
        binData = new ArrayList<Integer>();
        char rawdata[] = {'A','B','C','D','E','1','2','3'};
        System.arraycopy(rawdata,0,plaindata,0,rawdata.length);        
    }

    public List<Integer> getBinDataList(){
        for(int i = 0; i < plaindata.length; i += 2){
            List<Integer> bin = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0));
            int dec = value(plaindata[i]) * 45 + value(plaindata[i+1]);
            for(int j = 0; dec > 0; j++){
                bin.set(10-j,dec % 2);
                dec = dec / 2;
            }
            for(int n : bin){
                binData.add(n);
            }
        }
        /*
        for(int str : binData){
            System.out.print(str);
        }
        */
        return binData;
    }

    private int value(char c){
        if('A' <= c && c <= 'Z') return c - 'A' + 10;
        if('0' <= c && c <= '9') return c - '0';
        else return 0;     
    }
}