import java.util.*;

class BinData{
    private List<Integer> binData = new ArrayList<Integer>();
    private List<Character> plaindata = new ArrayList<Character>();
    
    BinData(List<Character> rawData){
        for(char c : rawData){
            plaindata.add(c);
        }
    }

    public List<Integer> getBinDataList(){
        for(int i = 0; i < plaindata.size(); i += 2){
            List<Integer> bin = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0));
            int dec = value(plaindata.get(i)) * 45 + value(plaindata.get(i+1));
            for(int j = 0; dec > 0; j++){
                bin.set(10-j,dec % 2);
                dec = dec / 2;
            }
            for(int n : bin){
                binData.add(n);
            }
        }
        return binData;
    }

    private int value(char c){
        if('A' <= c && c <= 'Z') return c - 'A' + 10;
        if('0' <= c && c <= '9') return c - '0';
        else return 0;     
    }
}